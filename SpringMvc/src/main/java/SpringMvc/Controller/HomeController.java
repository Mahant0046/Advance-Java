package SpringMvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SpingMvc.Model.User;
import SpringMvc.Service.UserService;



@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	//To provide common Name for the Project instead writing model add attribute in very methods we have use @ModelAttribute to make this common
	@ModelAttribute											
	public void CommonHeader(Model model) {
		System.out.println("This function calls Automatically whenever Page Refreshs");
		model.addAttribute("AppName","Spring MVC Project");
	}
	
	@RequestMapping("/")
	public String Hello() {
		return "index";
	}
	
	@RequestMapping("/Welcome")
	public String Welcome(Model model) {
		model.addAttribute("Name","Mahantesh");
		return "welcome";
	}
	
	@RequestMapping(path = "/Home",method = RequestMethod.GET)
	public ModelAndView Home() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("Course","MCA");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/Form")
	public String UserForm() {
			return "Contact";
	}
	
	@RequestMapping(path ="handleForm" , method = RequestMethod.POST)
	public String HandleForm(@ModelAttribute User user,Model model)
	{
		userService.createUser(user);
		return "success";
	}
}



//@RequestMapping(path ="handleForm" , method = RequestMethod.POST)
//public String HandleForm(
//		@RequestParam("email") String email,
//		@RequestParam("name") String name,
//		@RequestParam("password") String password ,
//		Model model) {
//
//	User user=new User();
//	user.setEmail(email);
//	user.setName(name);
//	user.setPassword(password);
//	
//	model.addAttribute("User", user);
//	return "success";
//}
