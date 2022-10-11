package com.aaeetii.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.aaeetii.springbootmvc.models.Alien;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("aid") int i, @RequestParam("aname") int j, Model m) {
		
		int sum = i + j;
		m.addAttribute("sum", sum);
		
		return "result";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {
		
		return "result";
	}
}
