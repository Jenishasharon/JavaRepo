package interfacing;

public class MultipleInterfaceChild implements MultipleInterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterfaceChild obj=new MultipleInterfaceChild();
		obj.hello();
		obj.add();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=5;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}
