package com.example.SanChoi247.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SanChoi247.model.entity.San;
import com.example.SanChoi247.model.entity.User;
import com.example.SanChoi247.model.repo.LoginRepo;
import com.example.SanChoi247.model.repo.SanRepo;

import jakarta.servlet.http.HttpSession;

import java.util.ArrayList;
@Controller
public class LoginController {
    @Autowired
    LoginRepo loginRepo;
    // @Autowired
    // SanRepo sanRepo;
    // @GetMapping("/")
    // public String ShowIndex(Model model) throws Exception {
    //     ArrayList<San> plist = sanRepo.getAllSan();
    //     model.addAttribute("ProductList", plist);
    //     return "public/index";
    // }

    @GetMapping("/Login")
    public String ShowLogin(){
        return "public/Login";
    }

    @GetMapping("/Logout")
    public String Logout(HttpSession httpSession){
        httpSession.removeAttribute("UserAfterLogin");
        return "redirect:/";
    }

    @PostMapping("/LoginToSystem")
    public String LoginToSystem(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession) throws Exception{
        User user = loginRepo.checkLogin(username, password);
        if (user == null) {
            return "public/Login";
        } else {
            httpSession.setAttribute("UserAfterLogin", user);
            return "redirect:/";
        }
    }
}
