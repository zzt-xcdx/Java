public class java06 {
    public static void main(String[] args) {

        // todo java流程控制语句
        // 分支； if分支，switch分支
        //循环；for循环，while循环，do while循环
        // 关键字； continue关键字，break关键字

        //单分支
        if (true) {
            System.out.println(1);
        }
        if (false) {
            System.out.println(1);
        }

        // 两分支的if语句
        // true 就第一个
        if (true) {
            System.out.println(1);

        }else {
            System.out.println(4);

        }

        //多分支的if语句
        //true执行，false下一个
        if (false) {
            System.out.println(5);
        } else if (false) {
            System.out.println(6);
        }else {
            System.out.println(7);
        }

    }
}
