class Gender{
   public static void main (String[] args)
   {
	   //8 GENDER LIST
	String priya= "Female";
	String diya = "Female";
	String raki= "Male";
	String sachu= "Male";
	String aanya= "Female";
	String shashank="Male";
	String evva= "Female";
	String navanith= "Male";
	
	String[] gender = {priya,diya,raki,sachu,aanya,shashank,evva,navanith};
	
	int size = gender.length;
	System.out.println ("total Gender list:"+size);
	
	System.out.println("Priya:" + priya);
	System.out.println("Diya:" + diya);
	System.out.println("Raki:" + raki);
	System.out.println("Sachu:" + sachu);
	System.out.println("Aanya:" +aanya);
	System.out.println("Shashank:" +shashank);
	System.out.println("Evva:" +evva);
	System.out.println("Navanith:"+ navanith);
	
	//INDEX OF ARRAY
	System.out.println("Index[0] :" +gender[0]);
	System.out.println("Index[1] :" +gender[1]);
	System.out.println("Index[2] :" +gender[2]);
	System.out.println("Index[3] :" +gender[3]);
	System.out.println("Index[4] :" +gender[4]);
	System.out.println("Index[5] :" +gender[5]);
	System.out.println("Index[6] :" +gender[6]);
	System.out.println("Index[7] :" +gender[7]);
	}
}