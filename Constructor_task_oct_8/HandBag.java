class HandBag{
	String color;
	double price;
	String brand;
	float size;
	String material;
	float capacity;
	
	HandBag(){
	    System.out.println("invoked Handbag constructor");
    }
    
	HandBag(String quality){
	    System.out.println("quality of string is : " + quality);
    }
	
    HandBag(int warrenty){
	    System.out.println("Warrenty of string is :" + warrenty );
    }
	
    HandBag(String quality,int warrenty){
	    System.out.println("quality of string is : " + quality);
	    System.out.println("Warrenty of string is :" + warrenty);
    }

    HandBag(float weight){
	    System.out.println("weight :" + weight);
	}
	
    HandBag(String feedback,String catagory){
	    System.out.println("Feedback : " + feedback);
	    System.out.println("catagory ; " + catagory);
    }
  
    HandBag(int dollar,double rupees){
	    System.out.println("Price in dollar :"+ dollar);
	    System.out.println("Price in Rupees :" + rupees);
    }
 
    HandBag(String colo,float dimension){
        color=colo;
        size=dimension;
	    System.out.println("Color : " + colo);
	    System.out.println("Size : " + dimension );
    }
	
    HandBag(String comment,double rating){
	    System.out.println("comments on bag : " + comment);
	    System.out.println("Rating : " + rating);
    }
   
    HandBag(double dimension){
	    System.out.println("Dimension :" + dimension);
	}

    HandBag(double amount,String bran,float si,String mat,float capa){
	    price = amount;
	    brand = bran;
	    size = si;
	    material = mat;
	    capacity = capa;
	    System.out.println("Price :" + amount);
	    System.out.println("Brand :" + bran );
	    System.out.println("Size :" + si);
	    System.out.println("Material :" + mat);
	    System.out.println("Capacity :" + capa);
    }
 }