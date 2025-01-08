import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args){
        Scanner myobj= new Scanner(System.in);

        System.out.print("Enter the temp in Celsius: ");
        int Celsius = myobj.nextInt();

        System.out.println((Celsius * 9/5) + 32.);
        myobj.close();
    }
}
