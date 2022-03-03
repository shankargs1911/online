class EngineTester{
	public static void main(String[]details){
		System.out.println(///////////);
	Engine engine=new Engine();
	engine.material="iron";
	engine.noOfPieces=20;
	engine.size='s';
	System.out.println("\n"+"Engine 1 Details");
	System.out.println("Things Name"+"\t"+engine.name);
	System.out.println("Material"+"\t"+engine.material);
	System.out.println("No of Pieces Per Pack"+"\t"+engine.noOfPieces);
	System.out.println("Size"+"\t"+engine.size);

	Engine engine1=new Engine();
	engine1.material="Steel";
	engine1.noOfPieces=12;
	engine1.size='S';
	
	System.out.println("\n"+"Engine 2 Details");
	System.out.println("Things Name"+"\t"+engine1.name);
	System.out.println("Material"+"\t"+engine1.material);
	System.out.println("No of Pieces Per Pack"+"\t"+engine.noOfPieces);
	System.out.println("Size"+"\t"+engine1.size);
	}	
}