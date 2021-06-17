class R1
{
int R(int x)
{
int a=x;
return (x);
}
float R(float x)
{
float b=x;
return (x); 
}
public static void main(String[] arr)
{
R1 n= new R1();
int k= n.R(4);
System.out.println(""+k);
float h= n.R(9.88f);
System.out.println(h);

}
}
