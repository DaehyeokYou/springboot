package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CommonController {
    
	@RequestMapping("/")
    public String root_test() throws Exception{
        return "Root!";
    }
	
    @RequestMapping("/js")
    public String js_test() throws Exception{
        return "Jisoo";
    }
 
    @RequestMapping("/dh")
    public String dh_test() throws Exception{
        return "Daehyeok";
    }
    
    @RequestMapping("/jt")
    public String jt_test() throws Exception{
        return "Jitae";
    }
 
}
