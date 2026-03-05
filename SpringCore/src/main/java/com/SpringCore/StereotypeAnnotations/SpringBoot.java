package com.SpringCore.StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBoot {

	@Autowired
	private Spring s;

	public Spring getS() {
		return s;
	}

	
	public void setS(Spring s) {
		System.out.println("Setter Injection");
		this.s = s;
	}

	@Override
	public String toString() {
		return "SpringBoot [s=" + s + "]";
	}


	public SpringBoot(Spring s) {
		System.out.println("Constructor Injections");
		this.s = s;
	}

	public SpringBoot() {
		
	}
	
}
