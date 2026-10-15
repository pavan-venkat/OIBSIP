import java.util.*;
public class Library {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(Arrays.asList("Java by Pavan", "DSA Book", "Python Book"));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n1.View Books 2.Add Book 3.Issue Book 4.Exit"); int ch=sc.nextInt(); sc.nextLine();
            if(ch==1) System.out.println(books);
            if(ch==2){ System.out.print("Enter Book Name: "); books.add(sc.nextLine()); System.out.println("Added!"); }
            if(ch==3){ System.out.print("Enter Book to Issue: "); books.remove(sc.nextLine()); System.out.println("Issued!"); }
            if(ch==4) break;
        }
    }
}
