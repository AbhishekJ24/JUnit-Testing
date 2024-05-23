package src.main.java;
public class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a>b?a-b:b-a;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public double divide(int a, int b){
        if(a!=0 && b!=0)
        return a/b;
        else
        throw new ArithmeticException();
    }
}