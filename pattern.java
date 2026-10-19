import java.util.*;
public class pattern {
    public static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print2(int n){
       for(int i=1;i<=n;i++){
           for (int j=0;j<n-i+1;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    public static void print3(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void print4(int n){
       //space
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("-");

            }
            //stars
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }

                for(int j=0;j<n-i-1;j++){
                    System.out.print("-");

                }

         System.out.println();
        }
    }

    public static void print5(int n){
        //space
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("-");

            }
            //stars
            for(int j=1;j<=2*n-(2*i+1);j++){
                System.out.print("*");
            }

            for(int j=0;j<i;j++){
                System.out.print("-");

            }

            System.out.println();
        }
    }
    public static void print6(int n){
        for(int i=0;i<2*n-1;i++){
            int star=i;
            if(i>n){
                star=2*n-i;
            }
        for (int j=0;j<star;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void print7(int n){
        int start=1;
        for (int i=0;i<n;i++){
            if(i%2==0)start=1;
            else{start=0;}
            for (int j=0;j<=i;j++){
               System.out.print(start);
               start=1-start;
            }
            System.out.println();
        }
    }

    public static void print8(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){

            //number1
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for (int j=1;j<=space;j++){
            System.out.print("-");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void print9(int n){
        int num=1;
        for (int i=1;i<=n;i++){
            for( int j=1;j<=i;j++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();

        }
    }

    public static void print10(int n){
    for (int i=0;i<n;i++){
        for (char ch='A';ch<='A'+i;ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
    }
    public static void print11(int n){
        for(int i=0;i<n;i++){
            for (char ch='A';ch<'A'+(n-i);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void print12(int n){

        for (int i=0;i<=n;i++){
            char ch= (char) ('A'+ i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }

    public static void print13(int n){
        //space
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("-");

            }
            //stars
            char ch='A';
            int br=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=br)ch++;
                else ch--;

            }

            for(int j=0;j<n-i-1;j++){
                System.out.print("-");

            }

            System.out.println();
        }
    }

    public static void print14(int n){

        for (int i=0;i<n;i++){

            for (char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch);

            }
            System.out.println();
        }
    }

    public static void print15(int n){
        for (int i=0;i<n;i++){
            //stars
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j=n-i;j>0;j--){
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i=n;i>0;i--){
            //stars
            for (int j=0;j<=n-i;j++){
                System.out.print("*");
            }

            //space
            for(int j=2;j<2*i;j++){
                System.out.print("-");
            }
            //stars
            for (int j=n-i;j>=0;j--){
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void print16(int n){
       int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){

        //stars
            int star=i;
            if(i>n) star=2*n-i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1;j<=star;j++) {
                System.out.print("*");
            }


            if(i<n) space-=2;
            else space+=2;
            System.out.println();
        }
    }

    public static void print17(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void print18(int n){
        for ( int i=0; i<2*n-1;i++){
            for ( int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n- Math.min(Math.min(top,bottom),Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print18(n);

    }
}
