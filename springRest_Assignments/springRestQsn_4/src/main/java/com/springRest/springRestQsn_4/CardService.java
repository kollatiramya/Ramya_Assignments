package com.springRest.springRestQsn_4;

import org.springframework.stereotype.Service;

@Service
public interface CardService {

	String getCardType(long cardNo);

}