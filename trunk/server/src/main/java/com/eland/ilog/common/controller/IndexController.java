package com.eland.ilog.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
    @RequestMapping(value = "/api/index", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "hello, world!";
    }
}
