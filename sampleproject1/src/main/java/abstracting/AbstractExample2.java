package abstracting;

public abstract class AbstractExample2 {
static int a=20;
static int b=10;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public abstract void sub();
	public abstract void mul();
}
