class StablizerRunner{

	public static void main (String[] args){
	
	Stablizer stablizer=new Stablizer("V-Gurad",3109);
	System.out.println(stablizer);
	
	System.out.println("***************************************");
	
	Stablizer stablizer1=new Stablizer(200,"White");
	System.out.println(stablizer1);
	
	System.out.println("***************************************");
	
	Stablizer stablizer2 = new Stablizer("TV");
	System.out.println(stablizer2);
	
	System.out.println("***************************************");
	
	Stablizer stablizer4 = new Stablizer(200,3109);
	System.out.println(stablizer4);
	
	System.out.println("***************************************");
	
	Stablizer stablizer3 = new Stablizer("tv","White","v-Gurad");
	System.out.println(stablizer4);
  }
}