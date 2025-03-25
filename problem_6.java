// Take a floating-point number as input, typecast it into an integer, and print both
//values.
import java.util.Scanner;
public class problem_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the floating point value : ");
        float n1 = sc.nextFloat();
        int n2 = (int)n1;
        System.out.println("The floating point value you have Entered : "+ n1);
        System.out.println("After conversion into int the value is : "+n2);
    }
}