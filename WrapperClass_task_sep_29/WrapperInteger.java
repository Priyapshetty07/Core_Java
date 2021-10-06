class WrapperInteger{

	public static void main (String...values){
	
		String age= "30";
		int convertedtoAge=Integer.parseInt(age);
		System.out.println("converted string to int " + (convertedtoAge*5));
	
		String petrolPrice= "105";
		int convertedIntopetrolPrice =Integer.parseInt(petrolPrice);
		System.out.println("converted string to int " + (convertedIntopetrolPrice+1));
	
		String pincode = "560040";
		int convertedIntoPincode= Integer.parseInt(pincode);
		System.out.println("converted string to int " + (convertedIntoPincode-1));
		
		String quantityOfSweets = "5";
		int convertedIntoSweets = Integer.parseInt(quantityOfSweets);
		System.out.println("converted string to int " + (convertedIntoSweets));
		
		String pagesOfOBook = "100";
		int convertedIntoPages = Integer.parseInt(pagesOfOBook);
		System.out.println("converted string to int " + (convertedIntoPages/2));
	
	}
}