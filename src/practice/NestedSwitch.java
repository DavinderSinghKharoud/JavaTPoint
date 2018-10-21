package practice;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int collyear=2;
int room=1;
switch(collyear) {
case 1:System.out.println("no extra subjects"); break;
case 2:{
	switch(room) {
	case 1:System.out.println("math,physics"); break;
	case 2:System.out.println("punjabi,english"); break;
	}
}break;
case 3:System.out.println("good to go"); break;
default:System.out.println("over");
}
	}
}
