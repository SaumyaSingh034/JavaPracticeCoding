//this keyword can be used to invoke current class method
class This3
{
void m()
{
System.out.println("From method m");
}
void n()
{
m();
}
void p()
{
this.n();
}
public static void main(String[] arr)
{
//This3 h = new This3();
//h.p();
new This3().p();
}
}
