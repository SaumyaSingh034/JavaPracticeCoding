class A
{
public void m()
{
System.out.println("Hello class...");
}
interface Message
{
 void msg();
 }
 }
 class NestedInterfaceDemo1 implements A.Message
 {
 public void msg()
 {
 System.out.println("Hello Method of Nested Interface...");
 }
 public static void main(String[] arr)
 {
 A.Message m= new NestedInterfaceDemo1(); //upcasting here
 m.msg();
 new A().m();
 }
 }