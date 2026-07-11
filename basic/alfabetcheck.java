package basic;
import java.util.*;
public class alfabetcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){

        char ch=sc.next().trim().charAt(0);
        if(ch=='0'){
            break;
        }
        if(ch>='a'&&ch<='z'){
            System.out.println("lower case");

        }else{
            System.out.println("upper case");
        }
        }
    }
}
