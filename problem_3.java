/* Take two numbers as input and perform addition, subtraction, multiplication, and
division. Display the results.
*/
import java.util.Scanner;
public class problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("The addition of a and b :"+ (a+b));
        System.out.println("The subtraction of a and b :"+ (a-b));
        System.out.println("The multiplication of a and b :"+ (a*b));
        System.out.println("The division of a and b :"+ (a/b));
    }
}