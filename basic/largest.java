package basic;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number a");
        int a=sc.nextInt();
        System.out.println("Enter your Number b");
        int b=sc.nextInt();
        System.out.println("Enter your Number c");
        int c=sc.nextInt();

        int lar=a;

        if(lar<b){
            lar=b;
        }if (lar<c) {
            lar=c;
        }
        System.out.println(lar);

    }
}
