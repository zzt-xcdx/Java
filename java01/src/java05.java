public class java05 {
    public static void main(String[] args) {

        // TODO java运算符
        // 逻辑运算符；3个
        // 逻辑与； &&
        // 逻辑或； ||
        // 逻辑非： ！

        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && true);
        System.out.println(false && false);

        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);
        System.out.println(false || false);

        System.out.println(!false);
        System.out.println(!true);

        // 自增自减运算符；2个
        //++自增一
        //--自减一
//        int a = 3;

//        a++;
//        System.out.println(a);
//        a--;
//        System.out.println(a);

        // 三目运算符
        // (true/false)?结果A:结果B
        int a = (false ? 5: 3);
        System.out.println(a);

    }
}
