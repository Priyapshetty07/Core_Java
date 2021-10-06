class IronBox{                        
//2 ways to declare local variables
//1:declared within the body
//2:declare with the parathesis
	public static void heating(String clothType) //declare with the parathesis(parameter)          
    {                                      
		System.out.println("invoked heating"); 
		
		String temperature = "70 degree";//declared within the body
		System.out.println(temperature);
		
		System.out.println("Cloth Type is:" +clothType);
		
	}
	public static void steamWater(boolean yes) //declare with the parathesis(parameter)
	{
	   System.out.println("invoked steamWater");
	   
	   System.out.println("Steam Water is:"+yes);
	
    }                                       
}
	
	



