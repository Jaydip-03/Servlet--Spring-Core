package com.jsp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "petrol")
//@Primary
public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("car moving using petrol engine");
		
	}

}




@Component
//@Component(value = "diesel")
@Qualifier
class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("car started moving uing diesel engine");
		
	}
	
}