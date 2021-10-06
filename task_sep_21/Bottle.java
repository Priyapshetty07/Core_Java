class Bottle{
	
	public static void storing(String bottleColor,String bottleCapacity,int bottlePrice,String bottleMaterial,String[] brands)
	{
		System.out.println("invoked bottle");
		System.out.println("Bottle Color :"+bottleColor);
		System.out.println("Bottle Capacity :"+bottleCapacity);
		System.out.println("Bottle Price :"+bottlePrice);
		System.out.println("Bottle material :"+bottleMaterial);
		
		for(int brand=0;brand<brands.length;)
		 {
			String temp = brands[brand];
			System.out.println("brand :"+temp);
			brand++;
		 }
		
	}
}