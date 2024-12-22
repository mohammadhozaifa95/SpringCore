package InjectUsingci;

public class Addition {
private int a;
private int b;

public Addition(int a, int b) {
	
	this.a=a;
	this.b=b;
	System.out.println("int Constructor call");
}
 public Addition(double a, double b){
	this.a=(int)a;
	this.b=(int)b;
	System.out.println("Double Constructor call");
	
 }
 public void sum() 
 {
	 System.out.println(this.a+this.b);
 }
}
