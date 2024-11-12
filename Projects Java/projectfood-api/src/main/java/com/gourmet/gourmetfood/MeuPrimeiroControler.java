package com.gourmet.gourmetfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroControler {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}

}
