package com.tx.springboot.app.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
/*     public String showLoginPage() {
        return "login";
    } 
*/
    public String index() {
        return "forward:/index.html";
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        if ("terrance".equals(username) && "123456".equals(password)) {
            System.out.println("success! Username: " + username + ", Password:" + password);
            return "success";
        } else {
            System.out.println("failure! Username: " + username + ", Password:" + password);
            return "failure";
        }
    }
}