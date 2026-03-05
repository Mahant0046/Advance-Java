package com.SpringCore.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class Department {
	@Value("21")
	private int dno;

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + "]";
	}

	
	
}
