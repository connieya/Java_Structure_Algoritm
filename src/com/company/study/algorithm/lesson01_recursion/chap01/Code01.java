public class Code01 {
    public static void main(String[] args) {
        func(11);
    }
    public static void func(int k){
        if (k ==0) return;


        System.out.println("숫자 "+k);
        func(k-1);
    }
}
