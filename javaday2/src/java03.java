public class java03 {
    public static void main(String[] args) {

        //todo 数组的遍历方式1
        //length;数组长度的属性，元素个数的属性
        int[] a={1,2,3,4,5};
        for (int i = 0;i<a.length;i++){
          System.out.println(a[i]);
        }
//        double[] e={1.2,2,3.4,4,5};
//        for (int i = 0;i<e.length;i++){
//            System.out.println(e[i]);
//        }
        double[] e={3.3,2.3,3.4};
        for (int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }
        System.out.println(e);
        //todo 数组的遍历方式2
        //通过元素自动遍历
        for(double p:e){
            System.out.println(p);

        }
    }
}
