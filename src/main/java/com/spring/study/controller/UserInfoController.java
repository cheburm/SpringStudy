package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.study.model.UserInfoModel;

@Controller
public class UserInfoController {
	
	@RequestMapping(value="/user-info-insert",method = RequestMethod.GET)
	public ModelAndView info(Model model) {
		ModelAndView mav = new ModelAndView("userinfoInsert");
		return mav;
	}
	
	@RequestMapping(value = "/insert-data", method = RequestMethod.POST,produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String insertData(UserInfoModel userInfoModel) {
							
						/*	 @RequestParam String user_id,
							 @RequestParam String user_password,
							 @RequestParam String user_name,
							 @RequestParam String user_phone) */
		
	{	return userInfoModel.getUser_id() + ", " + userInfoModel.getUser_password() + ", " + 
			   userInfoModel.getUser_name() + ", " + userInfoModel.getUser_phone();	}

	}
}
