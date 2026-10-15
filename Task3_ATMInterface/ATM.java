import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000; int pin = 1234;
        System.out.print("Enter PIN: "); if(sc.nextInt()!=pin){ System.out.println("Wrong PIN"); return; }
        while(true){
            System.out.println("\n1.Check Balance 2.Deposit 3.Withdraw 4.Exit");
            int ch=sc.nextInt();
            if(ch==1) System.out.println("Balance: Rs."+balance);
            if(ch==2){ System.out.print("Deposit Amount: "); balance+=sc.nextInt(); }
            if(ch==3){ System.out.print("Withdraw Amount: "); int w=sc.nextInt(); if(w<=balance) balance-=w; else System.out.println("Insufficient Balance"); }
            if(ch==4) break;
        }
    }
}
