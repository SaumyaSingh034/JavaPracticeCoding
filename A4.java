class B
{
A4 obj;
B(A4 obj)
{
  this.obj = obj;
 }
  void display()
  {
  System.out.println(obj.data); //using data member of A class
  }
}
  class A4
  {
  int data=10;
  A4()
  {
  B obj= new B(this);
  obj.display();
  }
  public static void main(String[] arr)
  {
  new A4();
  }
  }