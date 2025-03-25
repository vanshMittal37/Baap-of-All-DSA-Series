// Write a program to find the euclidean distance between two coordinates.Take both
// the coordinates from the user as input.
import java.util.Scanner;
import java.lang.Math;
public class problem_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point 1 (x1 , y1) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter point 2 (x2 , y2) : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int E_d = (int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The euclidean distance between two coordinates : "+E_d);
    }
}