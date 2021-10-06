class WrapperDouble{

	public static void main (String...wrapper){

		String weight = "72.6";
		double conversionWeight = Double.parseDouble(weight);
		System.out.println("converted String to double(weight): " + conversionWeight);
		
		String hotelBill = "5985.87";
		double conversionBill= Double.parseDouble(hotelBill);
		System.out.println("converted String to double(hotelBill): " + conversionBill);
		
		String ticketPrice = "515.25";
		double conversionTicket = Double.parseDouble(ticketPrice);
		System.out.println("converted String to double(ticketPrice): " + conversionTicket);

		String clothPrice = "1524.25";
		double conversionPrice = Double.parseDouble(clothPrice);
		System.out.println("converted String to double(clothPrice ): " + conversionPrice);	
	
		String cylinderWeight = "14.2";
		double conversionCylinder = Double.parseDouble(cylinderWeight);
		System.out.println("converted String to double(cylinderWeight): " + conversionCylinder);
	}
}