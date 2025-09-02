import java.util.Scanner;

public class nFakultet {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

 
        System.out.println("Skriv et heltall over 0: ");
        int n = in.nextInt();
        
        if (n <= 0) {
            System.out.println("Ugyldig. n må være > 0");
        } else {
            long fakt = 1;
            for (int i = 2; i <=n; i++) {
            fakt = fakt * i;
        }
            System.out.println(n + "! = " + fakt);
    
}
        in.close();
}
}
