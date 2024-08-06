package interfacing;

public class InterfaceExample2Child implements InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample2Child obj=new InterfaceExample2Child();
		obj.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}

}
