/**
 * This is a math Trick 
 * you just have to do what is being told and click enter
 */

import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose any three digit no in your mind :");
        String s=sc.nextLine();

        System.out.println("Reverse the No. and subtract it with the original No.:");
        s=sc.nextLine();

        System.out.println("reveal the last digit");
        int n=sc.nextInt();
        //System.out.println("Is it 0");
        if(n==0)
        {
            System.out.println("Is it zero");
        }
        else
        {
            System.out.print("Is It:");

            int no=(9-n)*100+90+n;
            System.out.print(no);

        }

       
    }
}
