package inheritance;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild x=new SuperConstructorChild();
	}
public SuperConstructorChild()
{
	super(5,6);
	System.out.println("hello");
}
}
