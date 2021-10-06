class WashingMachine{
 
    public static void washClothes(String[] clothes)
	{
	   // <3 = Start
	   // >5 = OverLoad
	   System.out.println("invoked washcode");
	   int size = clothes.length;
	   
	   if(size<3)
	   {
		   return "START";
	   }
	   else if(size>5)
	   {
		   return "OVERLOAD";
	   }
	}
}