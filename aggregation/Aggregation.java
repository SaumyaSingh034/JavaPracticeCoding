class Author
{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
authorName=name;
this.age=age;
this.place=place;
}
public String getAuthorName()
{
return authorName;
}
}
class Book
{
int price;
String name;
Author auth;
Book(String name, int price,Author at)
{
this.name= name;
this.price=price;
auth=at;
}
public void showDetail()
{
System.out.println("Book is = "+name);
System.out.println("price is = "+price);
System.out.println("Author is = "+auth.getAuthorName());
}
}
class Aggregation
{
public static void main(String[] arr)
{
Author a= new Author("Me",21,"lko");
Book b= new Book("Java", 550, a);
b.showDetail();
}
}