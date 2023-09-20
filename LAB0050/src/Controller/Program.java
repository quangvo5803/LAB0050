package Controller;

import Common.Validation;
import View.Menu;

public class Program extends Menu<String> {
    static String[] mainChoice = { "Superlative Equation", "Quadratic Equation", "Exit" };

    public Program() {
        super("========== Equation Program ==========", mainChoice);
    }

    public void execute(int n) {
        switch (n) {
            case 1: {
                superlativeEquation();
                break;
            }
            case 2: {
                quadraticEquation();
                break;
            }
            case 3: {
                return;
            }
        }
    }

    public void superlativeEquation() {
        System.out.println();
        System.out.println("------ Calculate Superlative Equation ------");
        System.out.println("Please input number");
        double a = Validation.getDouble("Enter A: ");
        double b = Validation.getDouble("Enter B: ");
        if(a==0){
            System.out.println("The equation has no solution");
            double[] arr ={a,b};
            print(arr);
        }else{
            double x = -b / a;
            System.out.println("Solution x= " + x);
            double[] arr ={a,b,x};
            print(arr);
        }
    }

    public void quadraticEquation() {
        System.out.println();
        System.out.println("------ Calculate Quadratic Equation ------");
        System.out.println("Please input number");
        double a = Validation.getDouble("Enter A: ");
        double b = Validation.getDouble("Enter B: ");
        double c = Validation.getDouble("Enter C: ");
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("The equation has no solution");
            double [] arr = {a,b,c};
            print(arr);
        }
        if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Solution x1 = x2 = " + x);
            double[] arr = {a,b,c,x};
            print(arr);
        }
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Soulution x1 = " + x1 + " and x2 = " + x2);
            double[] arr = {a,b,c,x1,x2};
            print(arr);
        }
    }

    public void print(double [] a){
        System.out.print("Number is Odd: ");
        for(int i = 0;i<a.length;i++){
            if(a[i] % 2 != 0){
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Number is Even: ");
        for(int i = 0;i<a.length;i++){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Number is Perfect Square: ");
        for(int i = 0;i<a.length;i++){
            if(Validation.checkSquareNumber(a[i])){
                System.out.print(a[i] + ",");
            }
        }
        System.out.println();
    }
}
