class CmdLine
{
void fact(int n)
{
int f=1;
for(int i=n;i>0;i--)
{
f=f*i;
}
System.out.println("Factorial of number is="+f);
}
public static void main(String[] ar)
{
int a= Integer.parseInt(ar[0]);
CmdLine obj= new CmdLine();
obj.fact(a);
}
}