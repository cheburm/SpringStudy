package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.study.model.CustomerModel;

@Controller
public class PostManController {
	
	@RequestMapping(value = "/postManTest", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
	@ResponseBody // 프로덕스를 써줘야한다
	public String postResponse(@RequestParam String id,
							   @RequestParam String password,
							   @RequestParam String name,
							   @RequestParam String phone) {
		return "사용자 id: " + id + " 비밀번호 : " + password + " 이름 : " + name + " 연락처 : " + phone;
	}
	
	@RequestMapping(value = "/postManDelivery",method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String deliveryPostResponse(CustomerModel customerModel) {
		return"주문자: " + customerModel.getCustomer_name() + "\n 주소 : " + customerModel.getCustomer_addres()
			+ "\n 연락처 : " + customerModel.getCustomer_phone() + "\n 요청사항 : " + customerModel.getCustomer_etc();
	}

}
