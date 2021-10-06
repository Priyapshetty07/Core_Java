class RunnerConstructor{
   
   public static void main(String...values)
   {
    System.out.println("invoked Constructor");
    
	
    Transformer trans = new Transformer(); //instantiation	
    Robot robot = new Robot();
	HardDisk hardDisk = new HardDisk();
	WaterTank waterTank = new WaterTank();
	Motor motor = new Motor();
	
   }
}