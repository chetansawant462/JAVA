//program on battery pecentage using if..else..if.....


import java.util.*;
class Battery
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter battery percentage = ");
 int battery = sc.nextInt();
 
 if(battery == 100)
 {
   System.out.println("battery fully Charged***");
 }
 else if(battery == 0)
 {
   System.out.println("switch off!!!");
 }
 else if(battery > 20)
 { 
   System.out.println("battery colour is green at %" +battery);
 }
 else if(20 >= battery && battery > 15)
 {
   System.out.println("battery colour is orange at %" +battery);
 }
 else if(battery <= 15)
 {
   System.out.println("battery colour is red at %" +battery);
 }
}
}
 