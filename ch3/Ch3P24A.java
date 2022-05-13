//Chapter 3 Question 24
import java.util.*;
class Ch3P24A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start date of semester(in dd/mm/yyyy format): ");
		String startDate = sc.nextLine();
		System.out.println("Enter the end date of semester(in dd/mm/yyyy format): ");
		String endDate = sc.nextLine();

		//To keep track of number of days
		int nDays=0,curYear,x;

		//Array for number of days in every month
		int noDaysMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		//Getting the Starting date,month,year
		int startDay = Integer.parseInt(startDate.substring(0,2));
		int startMonth = Integer.parseInt(startDate.substring(3,5));
		int startYear = Integer.parseInt(startDate.substring(6));

		//Getting the end date,month,year
		int endDay = Integer.parseInt(endDate.substring(0,2));
		int endMonth = Integer.parseInt(endDate.substring(3,5));
		int endYear = Integer.parseInt(endDate.substring(6));

		//System.out.println(startDay+" "+startMonth+" "+startYear+" ");
		//System.out.println(endDay+" "+endMonth+" "+endYear+" ");

		nDays=noDaysMonth[startMonth-1]-startDay+1;
		if(endMonth<startMonth) x=12+endMonth;
		else x=endMonth;
		for(int i=startMonth;i<=x-2;i++)
		{
			nDays+=noDaysMonth[i%12];
		}
		nDays+=endDay;
		if((startYear%100!=0 && startYear%4==0)||(startYear%400==0))
		{
			if(startMonth<=2 && endMonth>2) nDays+=1;
		}
		else if((endYear%100!=0 && endYear%4==0)||(endYear%400==0))
		{
			if(endMonth>2) nDays+=1;
		}
		System.out.println("Number of days: "+nDays);
	}
}