package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num="371";
int number=Integer.parseInt(num);
int sum=0,temp=number;
for(int count=0;count<=num.length();count++) {
    
	int modulus=temp%10;
	int divide=temp/10;
	temp=divide;
	 sum+=modulus*modulus*modulus;
	
}
if(sum==number) {
	System.out.println(sum+" "+"number is armstrong");
}else {
	System.out.println("number is not armstrong");
}
	}

}
