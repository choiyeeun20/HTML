package com.yeeun.web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootConfiguration
@Controller /*new 없이 new HomeController를 생성함*/
public class HomeController {
	@GetMapping("/") // 도메인뒤에 보이는것 .
	public String hello() {
		return "index.html";
	}
}
