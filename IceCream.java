/*IceCream-flavour,quantity,price,color:enum,brand,packingType:enum
update all instance variables with one method
get methods for all instance variables
3 copies of ice cream*/
class IceCream{
String flavour;
double quantity;
IceCreamColor color;
String brand;
IceCreamPackingType packingType;
 

 void about(){
 System.out.println(flavour);
 System.out.println(quantity);
 System.out.println(color);
 System.out.println(brand);
 System.out.println(packingType);
}
void UpDateflavour(){
 System.out.println(flavour);
 flavour="StrawBerry";
 System.out.println("UpDated "+flavour);
}
void UpDateQuantity(){
 System.out.println(quantity+"gram");
 quantity=75;
 System.out.println("UpDated "+quantity+"gram");
}
void UpDateColor(){
 System.out.println(color);
 color=IceCreamColor.WHITE;
 System.out.println("UpDated "+color);
}
void UpDateBrand(){
 System.out.println(brand);
 brand="Amul";
 System.out.println("UpDated "+brand);
}
void UpDatePackingType(){
 System.out.println(packingType);
 packingType=IceCreamPackingType.CONE_TYPE;
 System.out.println(packingType);
}
void UpDateAll(String flavour,double quantity,IceCreamColor color,String brand,IceCreamPackingType packingType){
	this.flavour=flavour;
	this.quantity=quantity;
	this.color=color;
	this.brand=brand;
	this.packingType=packingType;
 System.out.println(flavour);
 System.out.println(quantity);
 System.out.println(color);
 System.out.println(brand);
System.out.println(packingType);
}
}