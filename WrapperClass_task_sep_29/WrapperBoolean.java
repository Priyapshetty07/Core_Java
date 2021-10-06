class WrapperBoolean
{
	public static void main(String[] wrapper)
	{
	    String laptop = "True";
	    boolean convertedLaptopTurnOn = Boolean.parseBoolean(laptop);
	    System.out.println("converted String to boolean(LaptopTurnOn): " + convertedLaptopTurnOn);
	
	    String door = "False";
	    boolean convertedDoor = Boolean.parseBoolean(door);
	    System.out.println("converted String to boolean(Doorclose): " +convertedDoor);
	
     	String motor = "True";
		boolean convertedMotor = Boolean.parseBoolean(motor);
		System.out.println("converted String to boolean(MotorON): " +convertedMotor);
	
		String cookervisel = "True";
		boolean convertedCookervisel = Boolean.parseBoolean(cookervisel);
		System.out.println("converted String to boolean(cookerviselON): " +convertedCookervisel);
	
		String ironBox = "False";
		boolean convertedIron = Boolean.parseBoolean(ironBox);
		System.out.println("converted String to boolean(ironBoxOF): " + convertedIron);
	}
}