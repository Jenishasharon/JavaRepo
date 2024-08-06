package inheritance;

public class SuperKeywordChild1 extends SuperKeywordParent {
   
	String a="blue";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperKeywordChild1 x=new SuperKeywordChild1();
x.display();
	}
	
public void display()
{
	System.out.println(super.a);
	System.out.println(a);
}
}
