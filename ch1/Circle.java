import java.util.*;
public class Circle
{
          public static void main(String args[])
          {
                   float radius,area;
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter Radius of Circle:"); 
                   radius=sc.nextFloat();
                   area=3.14f*radius*radius;
                   System.out.println("Area of Circle="+area); 
           }
}