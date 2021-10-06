class Speakers
{
	public static String volume(int level)
	 {
		if (level<=0)
		{
		return "On the Speaker"; 
		}
		
		else if (level<=3)
		{
		return  "ok";
		}
		
		else if (level>3 && level <5)
		{
		return "loud";
		}
		
		else if (level>5 && level<9)
		{
		return "too loud";
		}
		
		else
		{
		return"Call the police";
		}
	}
	//other method
    public static boolean turnOn()
	{
		boolean on =true;
	    return on;  //true
    }
    
	public static boolean turnOff()
	{
		boolean off = false;
	    return false; //false
    }
}