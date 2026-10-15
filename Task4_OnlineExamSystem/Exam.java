import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=0;
        System.out.println("Q1. Java is OOP? a)Yes b)No"); if(sc.next().equals("a")) score++;
        System.out.println("Q2. 2+2=? a)3 b)4"); if(sc.next().equals("b")) score++;
        System.out.println("Q3. Size of int? a)4 byte b)2 byte"); if(sc.next().equals("a")) score++;
        System.out.println("\nFinal Score: "+score+"/3 - Submitted by Pavan Venkat");
    }
}
