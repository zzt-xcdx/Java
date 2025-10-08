public class java07 {
    public static void main(String[] args) {

        //todo switch分支
        //注意；if分支是根据布尔值执行不同的分支
        //注意；switch是根据常量数值执行不同分支
        //switch条件括号中只能写；byte short int char
        //break关键字；表示退出
        int a=2;
        switch (a) {

            case 1:{System.out.println("1");break;}
            case 2:{System.out.println("2");break;}
            case 3:{System.out.println("3");break;}
            default:{System.out.println("4");}

        }
    }
}
