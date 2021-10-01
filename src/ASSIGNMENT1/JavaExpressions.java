package ASSIGNMENT1;

import java.util.Scanner;

public class JavaExpressions {
    public static void main(String[]args){
        int A,B,C,X,Y;
        double result1,result2,result3,area,R;
        final double PI =3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers");
        A= input.nextInt();
        B= input.nextInt();
        C=input.nextInt();
        result1=Math.sqrt(B*B + 4*A*C);
        System.out.println("result1 = " + result1);
        System.out.println("Enter two numbers");
        X=input.nextInt();
        Y=input.nextInt();
        result2=Math.sqrt(X+4*Y*Y);
        result3=Math.cbrt(X*Y);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.print("Enter the radius of the circle");
        R=input.nextDouble();
        area=PI*R*R;
        System.out.println("area of the circle is : " + area);
    }
}
