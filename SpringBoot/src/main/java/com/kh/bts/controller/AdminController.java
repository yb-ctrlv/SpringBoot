package com.kh.bts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.bts.model.biz.MemberBiz;

@Controller
public class AdminController {

	@Autowired
	private MemberBiz biz;
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/loginform")
	public String loginform() {
		System.out.println("들어옴");
		return "loginform";
	}
	
	@RequestMapping("/memberlist")
	public String memberlist(Model model) {
		model.addAttribute("list", biz.selectList());
		return "memberlist";
	}
}
