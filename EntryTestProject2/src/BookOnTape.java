import java.util.Scanner;

public class BookOnTape {
    public String input;

    public void setSerial() {
        System.out.println("Input a serial of book from the keyboard: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
    }
    public void getSerial(){
        System.out.println(input);
    }
}
