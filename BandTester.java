class BroadBandTester{
	public static void main(String[] arg){
		BroadBand broadband=new BroadBand("Airtail",159);
		broadband.brand=Band.Two_HERTZ;
		broadband.plan=Plan.Monthly;
		broadband.connectionType=BandType.PREPAID;
		System.out.println(broadband.band.value+"Heartz");
		System.out.println(broadband.plan);
		System.out.println(broadband.operatorName);
		System.out.println(broadband.speed+"MB");
		System.out.println(broadband.connectionType.type);
	}
}