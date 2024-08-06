package abstracting;

public class AbstractChild extends AbstractExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.hello();
		obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is abstract method");
	}

}
