package aggregation;

public class Data {
     String place;
     int id;
     Student s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student x=new Student("jenisha",25);
    Data d=new Data("tvm",123,x);
    d.display();
   
	}
public Data(String place,int id,Student s)
{
	this.place=place;
	this.id=id;
	this.s=s;
}
public void display()
{
	System.out.println(s.name+" " +s.age+" ");
	System.out.println(place+" " +id+" ");	
}
}
