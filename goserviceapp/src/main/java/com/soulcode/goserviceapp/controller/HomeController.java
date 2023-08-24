package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value={"/","/home"})
public class HomeController {
 @GetMapping
 public ModelAndView home(){
     ModelAndView mv = new ModelAndView("home");

     return mv;
 }
}
