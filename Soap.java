/*Soap-name,price, color, size,weight,manfDate,tmf
init all instance variabels
updateMethods -7 methods + all variables
7 getMethods to return address of instance vairables
3 copies of soap
*/
class Soap{
String name;
double price;
String color;
double weight;
String manfDate;
int tmf;
Soap(){
}
void about(){
	System.out.println(name);
	System.out.println(price);
	System.out.println(color);
	System.out.println(weight);
	System.out.println(manfDate);
	System.out.println(tmf);
}
void UpDateName(){
	System.out.println(name);
	name="Mysore Sandle Soap";
	System.out.println(name);
}
void UpDateprice(){
	System.out.println(price);
	price=50;
	System.out.println(price);
}
void UpDateColor(){
	System.out.println(color);
	color="White";
	System.out.println(color);
}
void UpDateWeight(){
	System.out.println(weight+"grams");
	weight=50;
	System.out.println(weight+"grams");
}
void UpDateManfDate(){
	System.out.println(manfDate);
	manfDate="Feb 2022"; 
	System.out.println(manfDate);
}
void UpDateTMF(){
	System.out.println(tmf);
	tmf=18;
	System.out.println(tmf);

}

Soap(String name,double price,String color,double weight,String manfDate,int tmf){
	this.name=name;
	this.price=price;
	this.color=color;
	this.weight=weight;
	this.manfDate=manfDate;
	this.tmf=tmf;
}

String getSoapName()
{
System.out.println("Brand Name");
return this.name;	
}

double getSoapPrice(){
	System.out.println("price of Soap");
	return this.price;
}
String getSoapcolor()
{
	System.out.println("Color of Soap");
	return this.color;
}
double getSoapWeight(){
	System.out.println("Weight of Soap");
	return this.weight;
}
String getSoapManFDate(){
	System.out.println("Man Date of Soap");
	return this.manfDate;
}
int getSoapTFM(){
	System.out.println("TMF");
	return this.tmf;
}
}