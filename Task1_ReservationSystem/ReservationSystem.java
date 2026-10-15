import java.util.Scanner;
public class ReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Reservation System ===");
        System.out.print("Enter Name: "); String name = sc.nextLine();
        System.out.print("Enter Train No: "); String train = sc.nextLine();
        System.out.print("Enter PNR (random): "); int pnr = (int)(Math.random()*10000);
        System.out.println("\nBooked Successfully!");
        System.out.println("Name: "+name+" | Train: "+train+" | PNR: "+pnr);
        System.out.println("Task by Pavan Venkat");
    }
}
