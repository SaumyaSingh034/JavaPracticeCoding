import java.util.StringTokenizer;
class StringTokenizerDemo
{
public static void main(String[] args)
{
String shirts = "RedShirt, BlackShirt, MaroonShirt, BlueShirt";
StringTokenizer st = new StringTokenizer(shirts,",");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}