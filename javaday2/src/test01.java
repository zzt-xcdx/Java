public class test01 {
    public static void m1(int a,float b) {
        System.out.println(a+b);
    }
    public static void m2(char a,double b,short c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void m3(boolean a,int b,char c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {

        m1(7,2.3f);
        m2('你',2.2,(short)8);
        m3(true,8,'你');

    }
}
