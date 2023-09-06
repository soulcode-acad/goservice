package com.soulcode.goserviceapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class FirebaseController {
    @ModelAttribute("email")
    public String emailFirebase(Authentication authentication){
        if (authentication != null){
            return authentication.getName();
        }
        return null;
    }
}
