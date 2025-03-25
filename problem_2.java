/*Take length and breadth as input (both integers) and calculate the area of the
rectangle.*/
import java.util.Scanner;
public class problem_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of length :");
        int l = sc.nextInt();
        System.out.print("Enter the value of breadth :");
        int b = sc.nextInt();
        int area = l * b;
       System.out.println("The area of rectangle : "+area);
    }
}