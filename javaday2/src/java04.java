public class java04 {
    //主方法，Java应用的入口
    public static void main(String[] args) {
        //java方法分类，两类
        //方法；功能
        //第一种；没有返回值的方法
        //第二种；有返回值的方法
//调用的语法格式；
        //方法名（参数）；
        //注意；参数的个数，类型，顺序要完全一至

        //todo 没有返回值的方法
        //定义的语法
        //puilic static void 方法的名字（参数） {方法体}
m1();
m2( 2);
m3(3,3.2,'你',true);
    }

    public static void m1(){

        System.out.println(1);
    }
    public static void m2(int a){
        System.out.println(2);
    }
    public static void m3(int a,double b,char c,boolean d  ){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
