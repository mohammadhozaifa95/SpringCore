package InjectUsingci;

import java.util.List;

public class persion {
private String name;
private int persionId;
private Certi   certi;
private List<Integer>  number;
public persion() {

}
public persion(String name, int persionId,Certi   certi,List<Integer> number) {
	super();
	this.name = name;
	this.persionId = persionId;
	this.certi=certi;
	this.number=number;
}
@Override
public String toString() {
	return this.name+""+this.persionId+""+this.certi+""+this.number;
}

}
