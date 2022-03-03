class ChargerTester{
public static void main(String[] args){
Charger charger=new Charger();
charger.chargerColor=ChargerColor.BLACK;
charger.chargerType=ChargerType.USB_TYPE_C;
charger.watts=12;
charger.brand="NOKIA";
charger.pinType=PinType.TWO_PIN;
charger.usb=false;
charger.wireLength=4;
charger.working=false;
charger.about();


charger.upDateColor();
charger.upDateChargerType();
charger.upDateWatt();
charger.upDateWatt(10);
charger.upDateBrand();
charger.UpDatePinType();
charger.UpDateUSB();
charger.UpDateUSB(false);
charger.UpDateWireLength();
charger.UpDateWireLength(15);
charger.UpDateWorking();
charger.UpDateWorking(false);
}
}