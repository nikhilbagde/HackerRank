package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/23/2016.
 */
public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if(x1>=0 && x1<x2 && x2 <=(int) Math.pow(10,4)
                && v1>=1 && v1<=(int)Math.pow(10,4)
                && v2>=1 && v2<=(int)Math.pow(10,4)
                && (x1<x2 && v1>v2)){

            while(x1 != x2 && x1<x2){
                x1 = x1 + v1;
                x2 = x2 + v2;
            }
            if(x1 == x2) {
                System.out.print("YES");
            }else{
                System.out.print("NO");
            }
        }else{
            System.out.print("NO");
        }
    }
}

/*Failed test cases

21 6 47 3
EO: NO
 */
