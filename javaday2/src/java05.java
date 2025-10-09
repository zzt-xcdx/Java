public class java05 {
    public static void main(String[] args) {

        //todo 有返回值的方法
        //定义的语法格式
        //return关键字；返回的意思，把结果返回到方法的调用处
        //public static 返回类型 方法名（参数）{方法体 return 返回结果;}

        //调用的语法格式；
        //返回类型 变量 = 方法名（参数）
        int a= mi();
     System.out.println(a);
     boolean b= m2(9,2);
     System.out.println(b);
     char c=m3(true,'e');
     System.out.println(c);
    }

    public static int mi(){

        return 2;
    }
    public static boolean m2(int a,int b){

        return false;
    }
    public static char m3(boolean a,char b){
        return 'w';
    }
}
