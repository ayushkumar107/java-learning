package basic;
import java.util.*;
public class fabon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=num){
            int temp=a;
            a=b+a;
            b=temp;
            count++;
        }
        for (int i=0;)

    }
}
