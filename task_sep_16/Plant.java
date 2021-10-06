class Plant{
	
	//2 ways to declare local variables
	//1:declared within the body
	//2:declare with the parathesis
   public static void grow(String plantName)//declare with the parathesis(parameter)
   {
      System.out.println("invoked grow");
	  float height=12.2f;     //declared within the body
	  System.out.println(height);
	  System.out.println(plantName);
	  
    }
	
	public static void watering(int litres)//declare with the parathesis(parameter)
	{
		System.out.println("invoked watering");
		System.out.println("Litres:"+litres);
		boolean enough = false; //initialise and declaration //declared within the body
		System.out.println("Enough:"+ enough); //In string + become Concation 
	}
}