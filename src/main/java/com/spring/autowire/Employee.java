package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
@Autowired
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
	System.out.println("Set method call");
}

public Employee(Address address) {
	super();
	this.address = address;
	System.out.println("Constructor call");
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

}
