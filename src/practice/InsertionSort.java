package practice;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,3,4,12,14,5};
int c=5;
for(int i=a.length-1;i>=0;i--) {
	for(int j=i-1;j>=0;j--) {
		c=i;
		if(a[c]<a[j]) {
			int temp=a[c];
			a[c]=a[j];
			a[j]=temp;
		}
		c--;
	}
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	
		
	}

}
