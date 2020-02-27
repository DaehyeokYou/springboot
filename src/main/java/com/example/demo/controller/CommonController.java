package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CommonController {
    
	@RequestMapping("/")
    public String root_test() throws Exception{
        return "Hello!";
    }
	
    @RequestMapping("/js")
    public String js_test() throws Exception{
        return "Hello jisoo";
    }
 
    @RequestMapping("/dh")
    public String dh_test() throws Exception{
        return "Hello daehyeok";
    }
 
}
