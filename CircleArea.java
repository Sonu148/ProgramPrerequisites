import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        Scanner myobj= new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = myobj.nextInt();

        System.out.println( 3.14 * radius*radius);
        myobj.close();
    }
}
