package spring.Redirect.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String search()
	{
		System.out.println("this is home controller.........");
		
		
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView redirect(@RequestParam("anyKeyword") String query)
	{
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(url);
		
		
		return redirectView;
	}

}
