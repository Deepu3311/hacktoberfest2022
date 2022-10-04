/*
 * Author: DmitriyShum
 * Date: 10/4/22
 * Title: BMICalculator
 * Desc: This calculator can be used to find your body mass index by using a simple calculation which is:
 *  703 * weight(in LBS)/height(in inches) to the second power.
 */
import java.util.Scanner;
import java.math.*;
public class BMICalculator{
    public static float height = 0;//in Inches.
    public static float weight = 0;//in LBS(Pounds).

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your height in inches :  ");
        height = keyboard.nextFloat();
        System.out.println("Please enter your weight in pounds(lbs) : ");
        weight = keyboard.nextFloat();
        //Output calculation.
        System.out.println("Your BMI(Body Mass Index) is " + 703 * weight/Math.pow(height, 2) + ".");
    }
}
