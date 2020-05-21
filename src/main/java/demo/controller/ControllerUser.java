package demo.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
    	//データ呼び出し
    	ModelUser UserData = useRepository.selectByPrimaryKey(id);
    	//確認
    	System.out.println(UserData);
    	//Html出力テスト
//    	model.addAttribute("input", UserData);
    	//データを分割するためのフォーマット(Date型)
    	SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");//年("yy" 2020 -> 2020)(yyyy 2020 -> 20)
    	SimpleDateFormat monthFormat = new SimpleDateFormat("MM");//月("M" 8 -> 8)("MM" 8 -> 08)
    	SimpleDateFormat dayFormat = new SimpleDateFormat("dd");//年に対する日("D" 9 -> 9)("DDD" 9 -> 009),月に対する日("d" 9 -> 9)("dd" 9 -> 09)
    	SimpleDateFormat weekFormat = new SimpleDateFormat("E");//("E" 2011年8月30日→火)

		//データを分けてテーブル表示(HTML出力)
		model.addAttribute("criteria_Year", yearFormat.format(UserData.getYearMonthDay()));
		model.addAttribute("criteria_Month", monthFormat.format(UserData.getYearMonthDay()));
		model.addAttribute("criteria_Day", dayFormat.format(UserData.getYearMonthDay()));
		model.addAttribute("criteria_Week", weekFormat.format(UserData.getYearMonthDay()));

		//Date型からLocalDate型に変換
		LocalDate ldud = UserData.getYearMonthDay().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		//確認
		System.out.println(ldud);

		//データを分けてテーブル表示(HTML出力)
		model.addAttribute("localDate_Year", ldud.getYear());
		model.addAttribute("localDate_Month", ldud.getMonthValue());//ldud.getMonth()
		model.addAttribute("localDate_Day", ldud.getDayOfMonth());//ldud.getDayOfYear()
		model.addAttribute("localDate_Week", ldud.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPANESE));//ldud.getDayOfWeek()

		//月末取得
		LocalDate lastDay = ldud.with(TemporalAdjusters.lastDayOfMonth());
		//確認
		System.out.println(lastDay);
		//Html出力テスト
    	model.addAttribute("input", lastDay);
    	//データを分けてテーブル表示(HTML出力)
    	model.addAttribute("lastDay_Year", lastDay.getYear());
		model.addAttribute("lastDay_Month", lastDay.getMonthValue());
		model.addAttribute("lastDay_Day", lastDay.getDayOfMonth());
		model.addAttribute("lastDay_Week", lastDay.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPANESE));

    	return "select";
    }




}





