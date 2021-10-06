class DeodrantRunner{

    public static void main (String...args){
	
    Deodrant deodrant= new Deodrant();
		
		String band=deodrant.brand;
		int value = deodrant.price;
		int	quant = deodrant.quantity;
		String col = deodrant.color;
		
		System.out.println(band);
		System.out.println(value);
		System.out.println(quant);
		System.out.println(col);
	}
}