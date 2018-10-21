package practice;

public class LabelledForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a:
	for(int i=1;i<5;i++) {
		System.out.println("a");
	
	b:
		for(int j=3;j<8;j++) {
			System.out.println("b");
			if(j==5) {
				break a;
			}
		}
	}
	}

}
