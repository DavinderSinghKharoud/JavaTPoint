package practice;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]={{1,1,1},{2,2,2},{3,3,3}}; 
int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
int c[][]=new int[3][3];
for(int l=0;l<a.length;l++) {
	for(int m=0;m<a.length;m++) {
		c[l][m]=0;
		for(int n=0;n<a[0].length;n++) {
			c[l][m]+=a[l][n]*b[n][m];	
			}

		System.out.print(c[l][m]+" ");
	}
	System.out.println();
}

	}

}
