import java.util.Scanner;
public class Sumof2Number{
    public static void main(String[] args){
              Scanner myObj= new Scanner(System.in);

              System.out.print("Enter First Number: ");
              int a= myObj.nextInt();

              System.out.print("Enter Second Number: ");
              int b= myObj.nextInt();

              System.out.println("Sum: " + (a+b));
         myObj.close();
    }
}
