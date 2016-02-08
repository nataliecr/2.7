import java.util.Scanner;

public class FindYears {
    public static void main(String[] args){
        final int MINS_PER_YEAR = 525600;
        final int MINS_PER_DAY = 1440;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        int years = minutes / MINS_PER_YEAR;
        int days = (minutes % MINS_PER_YEAR) / MINS_PER_DAY;
        
        System.out.println(minutes + " minutes is approximately " + 
                years + " years and " + days + " days");
    } // main
} // FindYears
