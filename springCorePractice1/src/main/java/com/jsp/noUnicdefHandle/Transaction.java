package com.jsp.noUnicdefHandle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Transaction {
	
	@Autowired
	@Qualifier("phone")
	private Payment pay ;
	
	public void done() {
		pay.payMode();
	}
	

}
