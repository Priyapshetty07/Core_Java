class LighterRunner{
   
  public static void main(String[] args){
		
		System.out.println("on method :" + Lighter.on());
		System.out.println("off method :" + Lighter.off());
		
		//int width = 0;
		//System.out.println("The width of lighter is 0 :" + Lighter.light(width));
		
        //int width = 2;
		//System.out.println("The width of lighter is 2 :" + Lighter.light(width));		
	 
	    int width = -1;
		System.out.println("The width of lighter is -1 :" + Lighter.light(width));
	}
}