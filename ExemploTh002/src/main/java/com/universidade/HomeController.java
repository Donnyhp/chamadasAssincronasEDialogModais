package com.universidade;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String showHome(Model model) {
		model.addAttribute("data", new Date());
		List<String> listDepartamentos = Arrays.asList(
				"Financeiro", "Comercial", "Recursos Humanos");
		model.addAttribute("departamentos", listDepartamentos);
		return "home_tl";
	}	
}
