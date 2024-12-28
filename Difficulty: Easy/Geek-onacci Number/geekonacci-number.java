/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i=0;i<times;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(geekonnaki(n, a, b, c));
        }
    }
    public static int geekonnaki(int n, int a, int b, int c){
        if(n == 1) return a;
        if(n == 2) return b;
        if(n == 3) return c;

        int last = geekonnaki(n-1, a, b, c);
        int secondLast = geekonnaki(n-2, a, b, c);
        int thirdLast = geekonnaki(n-3, a, b, c);
        return last+secondLast+thirdLast;
    }
}