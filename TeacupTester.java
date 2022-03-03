class TeacupTester{
	public static void main(String[]teacup){
		System.out.println(///////////);
	Teacup teacup=new Teacup();
	teacup.material="Glass";
	teacup.noOfPieces=24;
	teacup.size='M';
	System.out.println("\n"+"Teacup 1 Details");
	System.out.println("Things Name"+"\t"+teacup.name);
	System.out.println("Material"+"\t"+teacup.material);
	System.out.println("No of Pieces Per Pack"+"\t"+teacup.noOfPieces);
	System.out.println("Size"+"\t"+teacup.size);

	TeaCup teacup1=new Teacup();
	teacup1.material="gold";
	teacup1.noOfPieces=6;
	teacup1.size='S';
	
	System.out.println("\n"+"Teacup 2 Details");
	System.out.println("Things Name"+"\t"+teacup1.name);
	System.out.println("Material"+"\t"+teacup1.material);
	System.out.println("No of Pieces Per Pack"+"\t"+teacup.noOfPieces);
	System.out.println("Size"+"\t"+teacup1.size);
	}	
}