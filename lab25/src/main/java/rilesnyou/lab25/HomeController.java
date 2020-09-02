package rilesnyou.lab25;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import rilesnyou.lab25.model.DataResponse;

@Controller
public class HomeController {

	@Autowired
	ApiService apiServ;

	@RequestMapping("/")
	public String home(Model model) {
		DataResponse response = apiServ.fetchWeather(42, 86);
		model.addAttribute("response", response);
		return "redirect:/select";
	}

	@RequestMapping("/select")
	public String showIndex() {

		return "select-form";
	}
//	@RequestMapping("/find-data")
//	public String showData(Model model) {
//		
//		List<String> data = apiServ.findData();
//		model.addAttribute("data", data);
//				
//		return "show-form";
//	}
}