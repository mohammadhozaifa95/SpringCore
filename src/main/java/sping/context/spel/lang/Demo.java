package sping.context.spel.lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+12/3%4}")
private int x;
	@Value("#{12+11-10}")
private int y;
@Value("#{T(java.lang.Math).sqrt(22.2)}")
private double e;
@Value("#{ new java.lang.String('Mohammad huzaifa')}")
private String str;
@Value("#{T(java.lang.Math).PI}")
private double pi;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
public double getPi() {
	return pi;
}
public void setPi(double pi) {
	this.pi = pi;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", e=" + e + ", str=" + str + ", pi=" + pi + "]";
}
}