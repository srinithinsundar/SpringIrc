package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class day2 {
	@Value("${sname}")
	public String name;
	@RequestMapping("/")
	@ResponseBody
	public String Day() {
		return "hi "+ name;
	}

}
