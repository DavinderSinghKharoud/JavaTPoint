package practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9,10};
int begin=0,last=a.length-1,mid=0;
int num=60;
boolean find=false;
while(begin<last) {
	mid=(begin+last)/2;
	if(a[mid]<num) {
		begin=mid+1;
	} else if(a[mid]>num) {
		last=mid-1;
	}else {
		find=true;
		break;
	}
}
if(find) {
	System.out.println("number found");
}else {
	System.out.println("number not found");
}
	}

}
