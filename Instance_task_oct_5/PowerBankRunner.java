class PowerBankRunner{

	public static void main (String...args){
	
	    PowerBank power=new PowerBank();
			int cap = power.capacity;
			String com = power.company;
			int value = power.price;
			
			System.out.println(cap);
			System.out.println(com);
			System.out.println(value);
	}
}