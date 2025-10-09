public class test02 {
    public static void main(String[] args) {
        int a = m1('你');{
        System.out.println(a);}
        double b = m2(9,3.2);{
        System.out.println(b);}
        boolean v= m3(9,2,4f);{
            System.out.println(v);
        }
        int []o = m4();{
            System.out.println(o);
            for (int i:o){
                System.out.println(i);
            }
        }


    }
    public static int m1(char c){
        return 100;
    }
    public static double m2(int a,double b){
        return 3.14D;
    }
    public static boolean m3(int a,int b,float c){
        return true;
    }
    public static int[] m4(){
        int[] a = {1,2};
        return a;
    }



}
