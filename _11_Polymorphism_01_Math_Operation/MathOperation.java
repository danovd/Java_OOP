package _11_Polymorphism_01_Math_Operation;

public class MathOperation {

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return add(a, b) + c;
    } public static int add(int a, int b, int c, int d){
        return add(a, b, c) + d;
    }
}
