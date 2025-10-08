public class Java01 {
    public static void main(String[] args) {

        // TODO (1)java语言八种数据类型

        // 4个整数类型 byte（8），short（16）,int（32）,long（64）
        // 相同点；都可以存证数
        // 不同点：存取区间从小到大
        //说明：整数的默认类型；开发中常用类型，int


        // 2个小数类型:float（32）,double（64）;
        // 相同小数，从小到大
        //默认，常用double


        // 2个特殊类型:char,boolean

        //定义变量的语法格式：
        //数据类型 变量 = 数据 ；
        // byte字节型
        byte a = 2;
        System.out.println(a);

        // short短整型
        short b = 3;
        System.out.println(b);

        // int整型
        int c = 4;
        System.out.println(c);

        // long长整型
        long d = 5;
        System.out.println(d);

        // float 单精度浮点数
        // 注意：数字必须以F/f结尾
        float e = 6.2f;
        System.out.println(e);

        //double双精度浮点数
        double f = 6.2;
        System.out.println(f);

        // char字符型
        //注意；单引号，必须一个字符
        char g = '你';
        System.out.println(g);

        // boolean布尔型
        //布尔型的值：true和false
        // true:
        //false:
        boolean h = true;
        System.out.println(h);

    }
}