package accessmodifier;

public class AccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AccessModifier1 obj=new AccessModifier1();
    obj.hello();
    obj.name();
    obj.number();
    obj.display();
	}
public void hello()
{
	System.out.println("this is public");
	}
private void name()
{
	System.out.println("this is private");
}
protected void number()
{
	System.out.println("this is protected");
}
void display()
{
	System.out.println("this is default");
}
}
