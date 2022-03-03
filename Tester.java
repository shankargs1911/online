class Tester{
public static void main(String[] args){
	{
		System.out.println("SeaPort");
SeaPort S=new SeaPort(20,10,"India",250000d);
System.out.println("port Name "+SeaPort.name);
System.out.println("Total Turnover "+S.turnover);
System.out.println("no of ships "+S.ships);
System.out.println("Country "+S.country);
System.out.println("Total Port Area "+S.area);
System.out.println();
}
{
	System.out.println("Locker");
Locker L=new Locker("mechans",6,300,75000d);
System.out.println("Company "+L.company);
System.out.println("Total Height "+L.height+" feet");
System.out.println("Weight "+L.weight+" kg");
System.out.println("price "+L.price);
System.out.println(Locker.type);
}
{
	System.out.println();
	CellPhone C=new CellPhone("Samsung","Android",6,128,150*50,25000d,"Alexa",5000);
	System.out.println("CellPhone");
	System.out.println("company "+C.company);
System.out.println("Operating "+C.os);
System.out.println("Ram"+C.ram+" gb");
System.out.println("Rom "+C.rom+" gb");
System.out.println("Size "+C.screenSize+" mm");
System.out.println("price "+C.price+"/-");
System.out.println("voice Assistance "+C.voiceAssistance);
System.out.println("Battery Capacity "+C.battery+" mAh");
System.out.println(CellPhone.processor);
System.out.println(CellPhone.camera);

}
{
		
	coin N=new coin(5,"India","Steel","Mysore");
	System.out.println("");
	System.out.println("coin");
	System.out.println("coin value "+N.value);
	System.out.println("country "+N.country);
	System.out.println("Material "+N.material);
	System.out.println("Printing Place "+N.placeOfPrinting);
	System.out.println(coin.size);
	
}
{
	
	Perfume P=new Perfume("Axe",250,200,"India");
	System.out.println("");
	System.out.println("Perfume");
	System.out.println("company "+P.company);
	System.out.println("price "+P.price);
	System.out.println("Quantity "+P.quantity+" ML");
	System.out.println("Origin counry "+P.madeUpOf);
	System.out.println(Perfume.smell);
	
	
	
	
}
}	
}