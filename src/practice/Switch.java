package practice;

public enum Switch {
	   SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY ;
	    public static void test(Switch Day) {
		   if(Day==MONDAY) {
			   System.out.println("good");
		   }
		   	   }
	    public static void main(String[] args) {
			test(MONDAY);
		}
}
