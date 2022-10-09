import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to print it's table : " );
        int n = s.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
    }
}
