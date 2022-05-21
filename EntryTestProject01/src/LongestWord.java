import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        System.out.println("Input a string from the keyboard: ");
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String[] inputs = input.split(" ");

        int index = 0;
        int lenMax = 0;
        for(int i = 0; i < inputs.length; i++){
            int len = inputs[i].length();
            if(len > lenMax){
                lenMax = len;
                index = i;
            }
        }

        System.out.println(inputs[index]);

    }

}