class Factorial
{
public static void main(String[] args)
{
int number=5;
int Factorial=number;
for(int i=(number-1);i>1;i--)
{
Factorial=Factorial*i;
}
System.out.println("factorial="+Factorial);
}
}