class ArrayChar
{
public static void main(String[] args)
{
 char[] copyFrom ={'a','b','c','d','e'};
 char[] copyTo = {'s','u','m','o','p','l'};
 System.arraycopy(copyFrom,2,copyTo,2,3);
 //System.out.println(new String(copyTo));
 System.out.println(copyTo);
 }
}
