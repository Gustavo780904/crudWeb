package com.example.joaovitor.CrudWeb.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorGeral {
	
		@RequestMapping("/")
		public String home() {
			return "index";
		}

}
