class PrimitiveTester{
	
	public  static void main(String[] args){
		byte b =127; //1 byte  memory
		short s = 32767; //2 byte  memory
		int i = 2147483647; //4 byte  memory
		long l =9876543210l; //8 byte  memory
		float f =7.758995f; //4 byte  memory
		double d =12.4587568566d; //8 byte  memory
	    boolean bool=(b==s);//1 byte memory
		char c = 'p'; //2 byte  memory
		
		    System.out.println(" print a byte value " + b);  //byte
			System.out.println(" print a short value " + s);  //short
			System.out.println(" print a int value " + i);  //int
			System.out.println(" print a long value " + l);  //long
			System.out.println(" print a float value " + f);  //float
			System.out.println(" print a double value " + d); //double
			System.out.println(" print a boolean value " + bool); //boolean 
            System.out.println(" print a character value " + c); //character
		}
}