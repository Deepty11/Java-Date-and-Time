import java.util.Scanner;
import java.time.LocalDate;
public class Calender {
	private static int dd,mm,yy;
	private static String dayOfWeek;
	public static Scanner scan= new Scanner(System.in);
	public static String getDay(int mm,int dd,int yy){
		if(yy>2000 && yy<3000){
			LocalDate date=LocalDate.of(yy, mm, dd);
			 dayOfWeek=date.getDayOfWeek().toString();
			
		}
		return dayOfWeek;
	}

	public static void main(String[] args) {
		mm=scan.nextInt();
		dd=scan.nextInt();
		yy=scan.nextInt();
		System.out.println(getDay(mm,dd,yy));
		
	}

}
