package demo.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.domainModel.ModelUser;
import demo.repository.RepositoryUser;
import demo.request.requestModelData;


@Controller
public class ControllerUser {


    @Autowired
    RepositoryUser useRepository;


    @GetMapping("/")
    public String index(Model model) {


//       	//個別表示
//    	ModelUser yearMonthDayData = useRepository.selectByPrimaryKey(1);
//    	model.addAttribute("displayId",yearMonthDayData.getId());
//    	model.addAttribute("displayYearMonthDay",yearMonthDayData.getYearMonthDay());


    	//全表示
    	 List<ModelUser> list = useRepository.selectByExample();
    	 model.addAttribute("List", list);


    	//新規入力画面
    	model.addAttribute("input_screen", new ModelUser());


        return "index";
    }


    @RequestMapping(value="/add")
    public String add(@ModelAttribute @Valid requestModelData inportYearMonthDay, Model model) {


    	Date data = java.sql.Date.valueOf(inportYearMonthDay.getYearMonthDay());
    	ModelUser newData = new ModelUser();
    	newData.setYearMonthDay(data);
    	useRepository.insert(newData);

    	return "redirect:";


    }


    @RequestMapping("/{id}")
	public String edit(@PathVariable Integer id, Model model) {

    	ModelUser UserData = useRepository.selectByPrimaryKey(id);

    	model.addAttribute("input", UserData);
    	model.addAttribute("input_screen", UserData);

		return "edit";
	}


    @RequestMapping(value="/editAdd")
    public String editAdd(@ModelAttribute @Valid requestModelData inportYearMonthDay, Model model) {
    	ModelUser newData = new ModelUser();

    	newData.setId(inportYearMonthDay.getId());

    	Date data = java.sql.Date.valueOf(inportYearMonthDay.getYearMonthDay());
    	newData.setYearMonthDay(data);

    	useRepository.updateByPrimaryKeySelective(newData);

    	return "redirect:";


    }
}





