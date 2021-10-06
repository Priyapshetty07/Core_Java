class WrapperFloat{
	public static void main(String...wrapper){
		
		String pi = "3.142";
		float convertedPi = Float.parseFloat(pi);
		System.out.println("converted String to float(pi): " + convertedPi);
		
		String mobileInch = "5.28";
        float convertedMobileInch = Float.parseFloat(mobileInch);
        System.out.println("converted String to float(mobileInch): " + convertedMobileInch);
    
       String intrestRate = "6.56";
       float convertedIntrestRate = Float.parseFloat(intrestRate);
       System.out.println("converted String to float(intrestRate): " + convertedIntrestRate);

       String processorClockSpeed = "1.5";
       float convertedprocessorClockSpeed = Float.parseFloat(processorClockSpeed);
       System.out.println("converted String to float(processorClockSpeed): " + convertedprocessorClockSpeed);
      
       String landInHectares = "1.3251";
       float convertedLandInHectares = Float.parseFloat(landInHectares);
       System.out.println("converted String to float(landInHectares): " + convertedLandInHectares);
	   
	}
}