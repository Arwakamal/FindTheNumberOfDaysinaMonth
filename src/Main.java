import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Day ;
        System.out.println("Enter your Number : ");
        Scanner scanner=new Scanner(System.in);
        Day=scanner.nextInt();

        System.out.println(GetTheDayName(Day));

    }
    public static String GetTheDayName(int Day){
        String DayName="";
        switch (Day){
            case 1: DayName="Monday";break;
            case 2: DayName="Tuesday";break;
            case 3: DayName="Wednesday";break;
            case 4: DayName="Thursday";break;
            case 5: DayName="Friday";break;
            case 6: DayName="Saturday";break;
            case 7: DayName="Sunday";break;
            default: DayName="Invalid day range";break;
        }
        return DayName;
    }
}