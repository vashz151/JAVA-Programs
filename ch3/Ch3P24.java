//Chapter 3 Question 24
import java.util.*;
class Ch3P24
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start date of semester: ");
		String startDate = sc.nextLine();
		System.out.println("Enter the end date of semester: ");
		String endDate = sc.nextLine();

		//To keep track of number of days
		int nDays=0,curYear;

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

		while(!((startDay==endDay)&&(startMonth==endMonth)&&(startYear==endYear)))
		{
			curYear = startYear<endYear ? startYear: endYear;
			if((curYear%4==0&&curYear%100!=0)||curYear%400==0)
				noDaysMonth[1] = 29;
			else
				noDaysMonth[1] = 28;
			if((startMonth==endMonth)&&(startYear==endYear))
			{
					nDays += endDay;
					startDay = endDay;
			}
			else if(startMonth==12)
			{
				startMonth = 1;
				startYear += 1;
				nDays += noDaysMonth[11];
			}
			else
			{
				nDays += noDaysMonth[startMonth-1]-startDay;
				startMonth += 1;
				startDay = 0;
			}
		}
		System.out.println("Number of days: "+nDays);
	}
}