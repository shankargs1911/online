class HairDryer{
int speed;
int watts;
boolean hotAir;
HairDryer(int speed){
	this.speed=speed;
	System.out.println("prameter costructer");
}

void displayDetails(){
System.out.println("Display All Details");
System.out.println("Speed "+speed);
System.out.println("hotAir "+hotAir);
System.out.println("watts "+watts);

}
void ChangeSpeed(){
		System.out.println("speed before change"+speed);
		speed=speed+10;
	System.out.println("speed After change"+speed);
}
}