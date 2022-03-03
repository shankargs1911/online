class ApartmentTester{
	public static void main(String[] args){
		Apartment apartment=new Apartment(180,"X WORKZ",50);{
			apartment.rent=Rent.TWENTY_Thousand;
			apartment.area=Area.Rajajinagar;
			System.out.println("Apartment Name"+apartment.name);
			System.out.println("Apartment area"+apartment.area);
			System.out.println("Total Apartment"+apartment.totalApartment+" Apartment");
			System.out.println("Rent"+apartment.rent.rnt+"/-");
			System.out.println("Total Workers"+apartment.rent.rnt+"/-");
			System.out.println("Total Workers"+apartment.totalApartment);
		}
		
	}
}