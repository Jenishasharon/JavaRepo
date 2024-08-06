package polymorphism;

public class PolymorphismChild extends PolymorphismParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PolymorphismChild obj=new PolymorphismChild();
     obj.add(2.4f,3.6f);
	}
public void add(float d,float e)
{
	super.add(5, 10);
	float f=d+e;
	System.out.println(f);
}
}
