package com.spring.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.study.model.CustomerModel;

@Controller
public class DeliveryController {

	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public ModelAndView delivery() {
		return new ModelAndView("delivery");
	}

	@RequestMapping(value = "/delivery-request", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView deliveryRequest(CustomerModel customerModel) {
		ModelAndView mav = new ModelAndView("delivery-request");
		mav.addObject("CustomerModel",customerModel);
		return mav;
		
	}

}
