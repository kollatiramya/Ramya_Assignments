package com.springrest.springRestQsn_3;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ServicePincode implements ServicePin {
	
	List<Pincode> pin;

	public ServicePincode() {
		pin = new ArrayList<>();
		pin.add(new Pincode(515001,"AP","Anantapur","India"));
		pin.add(new Pincode(515005,"AP","Hindupur","India"));
	
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}