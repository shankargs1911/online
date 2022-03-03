 class SoapTester{
public static void main(String[] args){
Soap soap=new Soap();
soap.name="Mysore Sandle Soap";
soap.price=50.20;
soap.color="white";
soap.weight=500;
soap.manfDate="Aug-2022";
soap.tmf=20;
soap.about();
soap.UpDateName();
soap.UpDateprice();
soap.UpDateColor();
soap.UpDateWeight();
soap.UpDateManfDate();
soap.UpDateTMF();

Soap soap1=new Soap("Lux",30,"Red",250,"Aug 2021",25);

String name1=soap1.getSoapName();
System.out.println(name1);
double rate=soap1.getSoapPrice();
System.out.println(rate);
String color=soap1.getSoapcolor();
System.out.println(color);
double weight=soap1.getSoapWeight();
System.out.println(weight);
String date=soap1.getSoapManFDate();
System.out.println(date);
int tfm=soap1.getSoapTFM();
System.out.println(tfm);




}
}