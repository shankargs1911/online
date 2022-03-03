class HeadSet{
String brand;
HeadSetType type;
double price;
String volume;
String color;
HeadSet(String volume){
this.volume=volume;
}
void displayDetails(){
System.out.println("company "+brand);
System.out.println("Type "+type);
System.out.println("Color "+color);
System.out.println("price"+price);
}
void changeVolume(){
System.out.println("volume before change "+volume);
volume="High volume";
System.out.println("volume after change "+volume);
}
}