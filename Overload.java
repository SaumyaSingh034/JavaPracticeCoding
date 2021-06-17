class Overload
{
void add()
{
int a=5;
int b=6;
int c=a+b;
System.out.println(c);
}
int add(int a,int b)
{
int c=a+b;
return(c);
}
void add(int a,float b)
{
float c= a+b;
System.out.println(c);
}
public static void main(String[] arr)
{
Overload c = new Overload();
c.add();
int y=c.add(4,5);
System.out.println(y);
 c.add(4,7.88f);
}
}