import java.util.Scanner;

public class Poengsum {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

     
     for (int elev = 1; elev <=10; elev++) {
         
      int poengsum; //må deklarere "poengsum"
      
      while (true) {
          System.out.println("Poengsum for student " + elev + ": ");
          poengsum = in.nextInt();
          
      if (poengsum < 0 || poengsum > 100) {
          System.out.println("Ugyldig poengsum"); //kjører evig om ugyldig poengsum
    } else {
          break; //hopper over til neste student om gyldig sum
      }
     }
     
    
      
     
      if (poengsum <= 39) {
        System.out.println("STRYK!");
    } else if (poengsum <= 49) {
        System.out.println("Karakter: E");
    } else if (poengsum <= 59) {
        System.out.println("Karakter: D");
    } else if (poengsum <= 79) {
        System.out.println("Karakter: C");
    } else if (poengsum <= 89) {
        System.out.println("Karakter: B");
    } else {
        System.out.println("Karakter: A");
    }
     }
     
     in.close();   
    
     
}
  }