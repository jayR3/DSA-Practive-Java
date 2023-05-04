public class Overloadiing {
    public static void main(String[] args) {
    fun("kunal");  // at compiled time, it decides which funtion to run
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
