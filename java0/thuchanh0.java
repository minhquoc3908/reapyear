import java.util.Scanner;
public class thuchanh0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year=sc.nextInt();
        boolean isLeapYear=false;
        boolean isDivisibleBy4= year %4==0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100=year%100==0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400=year%400==0;
                if(isDivisibleBy400){
                    isLeapYear=true;
                }
                else {
                    isLeapYear=true;
                }
            }
if (isDivisibleBy4){
    System.out.printf("%d is leap year ",year);

}else {
    System.out.printf("%d is Not a leap year",year);
}

        }
    }
}

