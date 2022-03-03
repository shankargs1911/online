class Shoe{
Size size;
double price;
String brand;
Type type;
String color;
Shoe(double price,String color){
this.price=price;
this.color=color;
}
void displayDetails(){
System.out.println("size "+size);
System.out.println("brand "+brand);
System.out.println("color "+color);
System.out.println("Type "+type);
System.out.println("price "+price);
}

void changePrice(){
System.out.println("price before change "+price);
price=price+500;
System.out.println("price after change "+price);
}
}