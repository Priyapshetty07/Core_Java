//arugments is ref passed during invocation 
		// 2 ways to pass the arugments->VALUE or REF

class IronBoxRunner{
	public static void main(String[] args)
	{
		//IronBox.heating();
		String name="Cotton";  //ref->arugments
		IronBox.heating(name);
		
		//or
		//IronBox.heating(Cotton); //value->arugments
		
		//boolean steam = true; //ref->arugments
		//IronBox.steamWater(steam);
		
		//or
		IronBox.steamWater(true); //value->arugments
	}

}













