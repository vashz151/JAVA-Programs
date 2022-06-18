import java.util.*;
public class Vampire
{
  public static void main(String[] args)
  {
    int i,n,j,k,l,value;
    boolean b=false;
    System.out.println("Enter a four digit number:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    value=n;
    int a[]=new int[4];
    int v[]=new int[2];
    for(i=0;i<4;i++)
    {
      a[i]=n%10;
      n=n/10;
    }
    for(i=0;i<4;i++)
    {
      for(j=0;j<4;j++)
      {
        if(j==i) continue;
        for(k=0;k<4;k++)
        {
          if((k==i) || (k== j)) continue;
          for(l=0;l<4;l++)
          {
            if((l==i) ||(l==j) ||(l==k)) continue;
            v[0]=a[i]*10+a[j];
            v[1]=a[k]*10+a[l];
            n=v[0]*v[1];
            if(value==n) 
            {
              b = true;
            }
          }        
        }

      }
      
    }
    if(b== true)
    {
      System.out.println("It is a vampire number");
      System.out.println(value+" = "+v[0]+"*"+v[1]);
    }
    else System.out.println("Not a vamprire number");
  }
}
