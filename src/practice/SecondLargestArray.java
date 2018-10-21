package practice;

public class SecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,4,32,3,42,534};
int temp;
int index=1;
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j]) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}
}
System.out.println("Second Largest Number is"+" "+a[index]);

	}

}
