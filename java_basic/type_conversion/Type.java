package gfg_java.java_basic.type_conversion;

public class Type {
    public static void main(String[] args){
        typecast(10.23);
    }
    public static int typecast(double d){
        int d_ = (int) d;
        System.out.println(d_);
        return d_;
    }
}