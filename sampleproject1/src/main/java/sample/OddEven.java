package sample;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9,10};
int sum1=0;
int sum2=0;
for(int i=0;i<a.length;i++) {

if(a[i]%2==0)
{
	sum1=sum1+a[i];
}
else
{
	sum2=sum2+a[i];
}
	}
System.out.println(sum1);
System.out.println(sum2);
	}
}
