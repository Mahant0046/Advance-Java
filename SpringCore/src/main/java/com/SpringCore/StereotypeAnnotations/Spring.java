package com.SpringCore.StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Spring {

	@Value("true")
	private boolean isKnowSpring;


	public boolean isKnowSpring() {
		return isKnowSpring;
	}

	public void setKnowSpring(boolean isKnowSpring) {
		this.isKnowSpring = isKnowSpring;
	}

	@Override
	public String toString() {
		return "SpringBoot [isKnowSpring=" + isKnowSpring + "]";
	}

	public Spring(boolean isKnowSpring) {
		super();
		this.isKnowSpring = isKnowSpring;
	}

	public Spring() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
