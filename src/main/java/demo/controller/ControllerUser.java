package demo.controller;

import java.text.SimpleDateFormat;
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

    @RequestMapping("/edit{id}")
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

    @RequestMapping("/select{id}")
    public String select(@PathVariable Integer id, Model model) {
    	ModelUser UserData = useRepository.selectByPrimaryKey(id);
    	model.addAttribute("input", UserData);
    	SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    	SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    	SimpleDateFormat dayFormat = new SimpleDateFormat("dd");

		//データを分けてテーブル表示
		model.addAttribute("criteria_Year", yearFormat.format(UserData.getYearMonthDay()));
		model.addAttribute("criteria_Month", monthFormat.format(UserData.getYearMonthDay()));
		model.addAttribute("criteria_Day", dayFormat.format(UserData.getYearMonthDay()));



    	return "select";
    }




}





