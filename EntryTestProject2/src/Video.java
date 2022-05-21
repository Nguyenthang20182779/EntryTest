import java.util.Scanner;

public class Video {
    public String input;

    public void setSerial() {
        System.out.println("Input a serial of video from the keyboard: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return;
    }
    public void getSerial(){
        System.out.println(input);
    }
}
