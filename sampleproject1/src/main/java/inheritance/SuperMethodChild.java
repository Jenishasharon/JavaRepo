package inheritance;

public class SuperMethodChild extends SuperMethodParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperMethodChild x=new SuperMethodChild();
x.add();
	}
public void add()
{
	super.hello();
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
}
