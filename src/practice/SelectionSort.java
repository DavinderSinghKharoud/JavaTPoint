package practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,4,34,2,102,66};
int temp;
for(int i=0;i<a.length;i++) {
	for(int j=1;j<a.length;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
}
	for(int k=0;k<a.length;k++) {
		System.out.println(a[k]);}
	}

}
