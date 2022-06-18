import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Month ,year;
        System.out.println("Enter the Month Number : ");
        Scanner scanner=new Scanner(System.in);
        Month =scanner.nextInt();
        System.out.println("Enter the year Number : ");
        year=scanner.nextInt();

        String MonthName="",NumOfDays="";
        switch (Month){

            case 1: MonthName="January";
                NumOfDays="31";
                break;
            case 2: MonthName="February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    NumOfDays= "29";
                } else {
                    NumOfDays = "28";
                }
                break;
            case 3: MonthName="March";
                NumOfDays="31";
                break;
            case 4: MonthName="April";
                NumOfDays="30";
                break;
            case 5: MonthName="May";
                NumOfDays="31";
                break;
            case 6: MonthName="June";
                NumOfDays="30";
                break;
            case 7: MonthName="July";
                NumOfDays="31";
                break;
            case 8: MonthName="August";
                NumOfDays="31";
                break;
            case 9: MonthName="September";
                NumOfDays="30";
                break;
            case 10: MonthName="October";
                NumOfDays="31";
                break;
            case 11: MonthName="November";
                NumOfDays="30";
                break;
            case 12: MonthName="December";
                NumOfDays="31";
                break;

        }
        System.out.println(MonthName+" "+ year+ " has " +NumOfDays+" Days.");

    }

}