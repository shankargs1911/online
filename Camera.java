class Camera{
String brand;
double price;
String memorycardsize;
String chargeable;
int zoomUpTo;

Camera(String brand,double price,String memorycardsize)
{
this.brand=brand;
this.price=price;
this.memorycardsize=memorycardsize;
}
Camera(String brand,double price,String memorycardsize,String chargeable,int zoomUpTo)
{
this(brand,price,memorycardsize);
this.chargeable=chargeable;
this.zoomUpTo=zoomUpTo;
}
Camera(String brand,String memorycardsize,String chargeable,double price)
{
	this.brand=brand;
this.memorycardsize=memorycardsize;
this.chargeable=chargeable;
this.price=price;
}
Camera(String chargeable,double price,int zoomUpTo)
{
	this.chargeable=chargeable;
	this.price=price;
	this.zoomUpTo=zoomUpTo;
}

Camera(String brand,int zoomUpTo,double price)
{
this.brand=brand;
this.price=price;
this.zoomUpTo=zoomUpTo;

}
Camera(String chargeable,double price,String memorycardsize,int zoomUpTo)
{
	this.chargeable=chargeable;
	this.price=price;
	this.memorycardsize=memorycardsize;
	this.zoomUpTo=zoomUpTo;
}
}