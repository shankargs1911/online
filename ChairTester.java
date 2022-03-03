class ChairTester{
	public static void main(String[]details){
		System.out.println(///////////);
	Chair chair=new Chair();
	chair.material="plastic";
	chair.noofPieces=3;
	chair.size='M';
	System.out.println("\n"+"Chair 1 Details");
	System.out.println("Things Name"+"\t"+chair.name);
	System.out.println("Material"+"\t"+chair.material);
	System.out.println("No of Pieces Per Pack"+"\t"+chair.noOfPieces);
	System.out.println("Size"+"\t"+chair.size);

	Chair chair1=new Chair();
	chair1.material="iron";
	chair1.noofPieces=2;
	chair1.size='S';
	
	System.out.println("\n"+"Chair 2 Details");
	System.out.println("Things Name"+"\t"+chair1.name);
	System.out.println("Material"+"\t"+chair1.material);
	System.out.println("No of Pieces Per Pack"+"\t"+chair.noOfPieces);
	System.out.println("Size"+"\t"+chair1.size);
	}	
}