import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for ( a = a;a > 0; a--){
            System.out.println(a);
        }
    }
}
