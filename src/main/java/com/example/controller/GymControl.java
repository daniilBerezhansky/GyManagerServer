package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class GymControl {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getTest(ModelMap modelMap){
        return "Sho?";
    }
}
