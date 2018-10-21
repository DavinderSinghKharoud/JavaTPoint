package practice;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
int temp[][] = new int[3][3];
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[0].length;j++) {
		temp[i][j]=a[j][i];
		
	}
}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(temp[i][j]+" ");
	}
	System.out.println();
}
	}

}
