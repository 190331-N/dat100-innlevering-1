import java.util.Scanner;

public class Trinnskatt {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    System.out.println("Bruttoinntekt: ");
     int inntekt = in.nextInt();
   
    double skatt = 0.0;

    if (inntekt <= 217400) {
        skatt = 0; //ingen skatt
        System.out.println("Ingen trinnskatt");
    } else if (inntekt <= 306050) {
        skatt = inntekt * 0.017; //1,7% trinnskatt
        System.out.println("Trinnskatt 1: (1.7%)");
    } else if (inntekt <= 697150) {
        skatt = inntekt * 0.04; //4% trinnskatt
        System.out.println("Trinnskatt 2: (4%)");
    } else if (inntekt <= 942400) {
        skatt = inntekt * 0.137; //13,7% trinnskatt
        System.out.println("Trinnskatt 3: (13.7%)");
    } else if (inntekt <= 1410750) {
        skatt = inntekt * 0.167; //16,7% trinnskatt
        System.out.println("Trinnskatt 4: (16,7%");
    } else {
        skatt = inntekt * 0.177; //17.7%% trinnskatt
        System.out.println("høyeste trinnskatt: (17.7%)");
    }
    
    System.out.println("Skatt å betale: " + skatt + " kr");
    
    in.close();
    
 }
}

