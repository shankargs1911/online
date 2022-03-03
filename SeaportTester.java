class SeaportTester{
	public static void main(String[] args){
	Seaport seaport=new Seaport();
	System.out.println("print all ships");
	System.out.println(Seaport.ship);
	System.out.println(seaport.colour);
	System.out.println(seaport.noOfShips);
	
	Seaport seaport2=new Seaport();
	System.out.println("print all ship2");
	seaport2.ship="srilanka";
	System.out.println(Seaport.ship);
	System.out.println(seaport2.ship);
	seaport.colour="red";
	System.out.println(seaport2.colour);
	seaport.noOfShips=9;
	System.out.println(seaport2.noOfShips);
	}
}