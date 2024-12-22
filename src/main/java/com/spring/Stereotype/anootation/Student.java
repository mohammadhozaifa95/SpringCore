package com.spring.Stereotype.anootation; // Ensure this matches

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob") // Ensure this matches the bean name you're trying to retrieve
public class Student {
    @Value("Mohammad")
    private String name;

    @Value("Sakinaka center")
    private String address;

    @Value("#{mo}")
    private List<String> aName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getaName() {
        return aName;
    }

    public void setaName(List<String> aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + ", aName=" + aName + "]";
    }
}
