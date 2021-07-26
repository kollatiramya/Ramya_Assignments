package com.springrest.springRestQsn_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springRestQsn_3.Pincode;
import com.springrest.springRestQsn_3.ServicePin;

@RestController
public class ControllerPinCode {
	
	@Autowired
	ServicePin s;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}
