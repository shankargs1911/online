class withParameter{
		public static void main(String[] args){
		System.out.println("person Name and Age");

		person.nameAge("Ram","25 years");
		System.out.println(" ");
		System.out.println("Academic Details");
		person.academics("Ram","Mechanical","B G M I T Mudhol","Design Of machines","65%");
		System.out.println(" ");
		System.out.println("Family Details");
		person.family("Basavant","Ratnabayi");
		System.out.println(" ");
		System.out.println("general Deatils");
		person.general(269676616249l,8050167475l);
		System.out.println(" ");
		System.out.println("personal Details");
		person.personal("Unmarried");
	}
}
class person{
	public static void nameAge(String name, String age){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}


public static void academics(String name,String branch,String collageName,String favSubject,String percentage){
	System.out.println("Branch - "+branch);
	System.out.println("Collage Name - "+collageName);
	System.out.println("Faverite Subject- "+favSubject);
	System.out.println("Percentage= "+percentage);
}
public static void family(String fatherName,String motherName){
	System.out.println("Father Name="+fatherName);
	System.out.println("Mother Name="+motherName);
}
public static void general(long adharNo,long mobileNo){
	System.out.println("Adhar No= "+adharNo);
	System.out.println("Mobile No= "+mobileNo);
}
public static void personal(String maritalStatus){
	System.out.println("Marital Status= "+maritalStatus);
}
}