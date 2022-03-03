class AutomobailsTester{
	public static void main(String[]details){
		System.out.println(///////////);
	Automobails automobails=new Automobails();
	automobails.material="bulb";
	automobails.noofPieces=3;
	automobails.size='M';
	System.out.println("\n"+"Automobails 1 Details");
	System.out.println("Things Name"+"\t"+automobails.name);
	System.out.println("Material"+"\t"+automobails.material);
	System.out.println("No of Pieces Per Pack"+"\t"+automobails.noOfPieces);
	System.out.println("Size"+"\t"+automobails.size);

	Automobails automobails1=new Automobails();
	automobails1.material="motor spare parts";
	automobails1.noofPieces=1;
	automobails1.size='All';
	
	System.out.println("\n"+"Automobails 2 Details");
	System.out.println("Things Name"+"\t"+automobails1.name);
	System.out.println("Material"+"\t"+automobails.material);
	System.out.println("No of Pieces Per Pack"+"\t"+automobails.noOfPieces);
	System.out.println("Size"+"\t"+automobails1.size);
	}	
}