package practice;

public class ArmstrongWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,c=0;
int n=153,temp=n;
while(n>0) {
	a=n%10;
	n=n/10;
	c+=a*a*a;
	
}
if(temp==c) {
	System.out.println("Armstrong");
	
}else
{System.out.println("not Armstrong");
	
}
	}

}
