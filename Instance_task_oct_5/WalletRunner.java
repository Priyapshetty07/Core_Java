class WalletRunner{
    
	public static void main (String...args){
	
	    Wallet	wallet=new Wallet();
	
		String col = wallet.color;
		String made = wallet.countryMade;
		int money = wallet.price;
		
		System.out.println(col);
		System.out.println(made);
		System.out.println(money);
    }
}