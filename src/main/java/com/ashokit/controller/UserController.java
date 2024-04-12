package com.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.dto.LoginDto;
import com.ashokit.dto.RegisterDto;
import com.ashokit.dto.ResetPwdDto;
import com.ashokit.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String registerPage(Model model) {
		return "registerView";
	}

	@GetMapping("/states/{cid}")
	public Map<Integer, String> getStates(@PathVariable("cid") Integer cid){
		return null;
	}
    @GetMapping("/cities/{sid}")
	public Map<Integer, String> getCities(@PathVariable("sid")Integer sid){
		return null;
	}
    @PostMapping("/register")
	public String register(RegisterDto regDto,Model model) {
		return "registerView";
	}

    @GetMapping("/")
	public String loginPage(Model model) {
		return "index";
	}

    @PostMapping("/login")
	public String login(LoginDto loginDto, Model model) {
		return "index";
	}

    @PostMapping("/resetPwd")
	public String resetPwd(ResetPwdDto pwdDto,Model model) {
		return "";
	}
    
    @GetMapping("/dashboard")
	public String dashboard(Model model) {
		return "dashboard";
	}

    @GetMapping("/logout")
	public String logout() {
		return "index";
	}

}
