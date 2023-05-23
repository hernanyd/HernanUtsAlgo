package java1;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {      
      
       Scanner input = new Scanner(System.in); 
       System.out.print("masukan");
       double cel = input.nextDouble();
       
        double far = (cel * 9 / 5) + 32;
        
        System.out.print(cel + "cel = "+ far + "far =" );
       }
       
    }



