package org.lion.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo")
public class DemoController {
	@RequestMapping("")
	@ResponseBody
	public String demo(@RequestParam("name") String name){
		return "hello,"+name;
	}
}
