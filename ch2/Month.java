import java.util.*;
public class Month
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);	
		System.out.println("1.Jan\n2.Feb\n3.Mar\n4.Apr\n5.May\n6.Jun\n7.Jul\n8.Aug\n9.Sep\n10.Oct\n11.Nov\n12.Dec\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.print("January");
                        break;
			case 2:System.out.print("February");
                        break;
			case 3:System.out.print("March");
			break;
			case 4:System.out.print("April");
			break;
			case 5:System.out.print("May");
			break;
			case 6:System.out.println("June");
			break;
			case 7:System.out.print("July");
                        break;
			case 8:System.out.print("August");
                        break;
			case 9:System.out.print("September");
                        break;
			case 10:System.out.print("October");
                        break;
                        case 11:System.out.print("November");
                        break;
                        case 12:System.out.print("December");
			break;
			default:System.out.print("Invalid month number");
		}
	}
}