package com.springrest.springRestQsn_3;

import org.springframework.stereotype.Service;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}