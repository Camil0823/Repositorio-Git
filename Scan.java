import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        String Num = sc.nextLine();
        
        System.out.println("Epa el número " + Num);
        sc.close();
    }


}
