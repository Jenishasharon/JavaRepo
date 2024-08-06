package abstracting;

public class AbstractChildExample2 extends AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildExample2 obj=new AbstractChildExample2();
		obj.add();
		obj.sub();
		obj.mul();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int d=a-b;
		System.out.println(d);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int e=a*b;
		System.out.println(e);
	}

}
