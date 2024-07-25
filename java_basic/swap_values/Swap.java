package gfg_java.java_basic.swap_values;
public class Swap {
    public static void swap(int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
        swap(10, 20);
    }
}