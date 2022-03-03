/*Charger — color:enum,type:enum,watts,brand,pinType:enum,usb,wireLength,working
16 update methods, about(),update(….);*/
class Charger{
ChargerColor chargerColor;
ChargerType chargerType;
int watts;
String brand;
PinType pinType;
boolean usb;
int wireLength;
boolean working;

void about(){
System.out.println(brand);
System.out.println("Color "+chargerColor);
System.out.println("Charger Type"+chargerType);
System.out.println("Pin Type "+pinType);
System.out.println("USB is Their "+usb);
System.out.println("WireLength "+wireLength+"m");
System.out.println("It Is Working "+working);
}
void upDateColor(){
	System.out.println("before upDate "+chargerColor);
    chargerColor=ChargerColor.BLACK;
 	System.out.println("After upDate "+chargerColor);

}

void upDateChargerType(){
    System.out.println("before upDate "+chargerType);
    chargerType=ChargerType.USB_TYPE_A;
	System.out.println("before upDate "+chargerType);
}
void upDateWatt(){
    System.out.println("before upDate "+watts+" watt");
	watts=15;
	System.out.println("before upDate "+watts+" watt");
}
void upDateWatt(int watts){
	this.watts=watts;
	System.out.println("before upDate "+watts+" watt");
    watts=20;
	System.out.println("before upDate "+watts+" watt");
}
void upDateBrand(){
	System.out.println("before upDate "+brand);
    brand="Sony";
	System.out.println("before upDate "+brand);
}
void UpDatePinType(){
	System.out.println("before upDate "+pinType);
    pinType=PinType.THREE_PIN;
	System.out.println("before upDate "+pinType);
}
/*void UpDatePinType(PinType pinType){
	this.pinType=PinType.pinType;
    System.out.println("before upDate "+pinType);
	pintype=PinType.TWO_PIN;
	System.out.println("before upDate "+pinType);
}*/
void UpDateUSB(){
	System.out.println("before upDate "+usb);
	usb=true;
    System.out.println("before upDate "+usb);	
}
void UpDateUSB(boolean usb){
	this.usb=usb;
	System.out.println("before upDate "+usb);
    usb=true;
    System.out.println("before upDate "+usb);	
}
void UpDateWireLength(){
	System.out.println("before upDate "+wireLength+"m");
	wireLength=16;
    System.out.println("before upDate "+wireLength+"m");
}
void UpDateWireLength(int wireLength){
	this.wireLength=wireLength;
	System.out.println("before upDate "+wireLength+"m");
	wireLength=6;
    System.out.println("before upDate "+wireLength+"m");
}
void UpDateWorking(){
	System.out.println("before upDate "+working);
	working=true;
	System.out.println("before upDate "+working);
}
void UpDateWorking(boolean working){
	this.working=working;
	System.out.println("before upDate "+working);
	working=true;
	System.out.println("before upDate "+working);
}
}