package interfacing;

public class InterfaceChild implements InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
