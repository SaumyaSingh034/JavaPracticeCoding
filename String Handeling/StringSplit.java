class StringSplit
{
public static void main(String[] args)
{
 //String shirts = "RedShirt, wBlackShirt, wMaroonShirt, wBlueShirt";
 //String[] results = shirts.split("w");
 String shirts ="RedShirt, BlackShirt, MaroonShirt, BlueShirt";
 String[] results = shirts.split(" ");
 for(String shirtstr : results)
 {
  System.out.println(shirtstr);
 }
 }
 }