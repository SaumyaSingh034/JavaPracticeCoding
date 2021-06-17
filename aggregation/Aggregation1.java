class Student
{
int rollno;
String name;
Address add;
public Student(int r,String n, Address a)
{
this.rollno=r;
this.name= n;
this.add=a;
}
}
class Address
{
int streetnum;
String city;
String country;
Address(int s, String c,String co)
{
this.streetnum=s;
this.city=c;
this.country=co;
}
}
class Aggregation1
{
public static void main(String[] arr)
{
Address ad = new Address(10,"Varanasi","India");
Student obj= new Student(34,"Saumya",ad);
System.out.println(obj.rollno);
System.out.println(obj.name);
System.out.println(obj.add.streetnum);
System.out.println(obj.add.city);
System.out.println(obj.add.country);
}
}