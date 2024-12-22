package com.spring.Stereotype.anootation;


  import org.springframework.beans.factory.annotation.Value;
  
  public class Shop {
  
  @Value("Alhum") private String name;
  
  @Value("Maliq") private String address; public String getName() { return
  name; } public void setName(String name) { this.name = name; } public String
  getAddress() { return address; } public void setAddress(String address) {
  this.address = address; }
  
  @Override public String toString() { return "Shop [name=" + name +
  ", address=" + address + "]"; }
  
  }
  
  
 