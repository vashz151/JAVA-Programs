import java.util.*;
class Rectangle {
    int length;
    int breadth;
    //Default constructor
    Rectangle() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        Rectangle r = new Rectangle(length,breadth);
    }
    //Parameterized constructor
    Rectangle(int length, int breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }
    //area method
    int area()
    {
        int a=length*breadth;
        return a;
    }
}

class Cube 
{
    int side;
    //Default constructor
    Cube() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of a cube:");
        side=sc.nextInt();
        Cube c = new Cube(side);    
    }
    //Parameterized constructor
    Cube(int side) 
    {
        this.side = side;
    }
    //volume method
    int volume() 
    {
        int vol=side*side*side;
        return vol;
    }
}

class Size {
    //size method which accepts reference object
    static int size_Check(Object z) 
    {
        if(z instanceof Cube) 
        { 
            return ((Cube)z).volume(); //typecasting object to Cube object
        }
        else if(z instanceof Rectangle) 
        { 
            return ((Rectangle)z).area(); //typecasting object to Rectangle object
        }
        else 
        {
            return -1;
        }
    }
    public static void main(String args[]) 
    {
        Rectangle r = new Rectangle();
        Cube c = new Cube();
        if(size_Check(r)!=-1)
        {
            System.out.print("Area of rectangle=");
            System.out.println(size_Check(r));
    
        }
        if(size_Check(c) !=-1)
        {
            System.out.print("Volume of cube =");
            System.out.println(size_Check(c));
        }   
    }
}
