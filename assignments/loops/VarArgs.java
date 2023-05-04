import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 47, 8, 3, 6, 7, 8, 8, 90, 70, 57);
        multiple(1, 3,"kunal", "rahul");
    }
    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
}
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
