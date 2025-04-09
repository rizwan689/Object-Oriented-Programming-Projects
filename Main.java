import java.util.Scanner;

//i figured it out user prompt i.e scanner.next int should be inside do while loop in order //to scucessfully run it otherwise it has a fixed choice value and it will always choose that //case because it is outisde of do while loop

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        library.library();



        
        
        
        scanner.close();
    }

}
