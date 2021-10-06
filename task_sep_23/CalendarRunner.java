class CalendarRunner{
	public static void main(String[] names){
		String personName1 = "Priya";
		String personName2 = "Diya";
		String personName3 = "Evaa";
		String personName4 = "Aravi";
		String personName5 = "Aanya";
		
		System.out.println("----------------personName1-------------------");
	// priya-10-Wendnesday
		System.out.println("Name is : " +personName1 + " Birth month is :" +Calendar.getBirthMonth(personName1));
		System.out.println("Birthday is :" +Calendar.getBirthDay(personName1));
	     
		System.out.println("----------------personName3-------------------");
		
	//evaa-8-Friday
	    System.out.println("Name is : " +personName3 + " Birth month is :" +Calendar.getBirthMonth(personName3));
		System.out.println(" Birthday is :" +Calendar.getBirthDay(personName3));
	   
	   System.out.println("----------------personName5-------------------");
	   
	//else-aanya,return-9,return "Sunday"
	    System.out.println("Name is : " +personName5 + " Birth month is :" +Calendar.getBirthMonth(personName5));
		System.out.println("Birthday is :" +Calendar.getBirthDay(personName5));
    }
}