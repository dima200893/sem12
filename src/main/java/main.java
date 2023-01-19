import java.util.Arrays;
import java.util.Random;

//    Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!
public class main {
    public static void main(String[] args){

        int k=2001;
        int i = new Random().nextInt(k);
        print(Integer.toString(i));
        int n =Integer.toBinaryString(i).length();
        print(String.valueOf(n));
        int c = 0;
        for (int j = Short.MIN_VALUE; j <i ; j++) {
            if (j%n == 0) c++;
        }
        int[] m1= new int[c];
        c=0;
        for (int j = Short.MIN_VALUE; j <i ; j++) {
            if (j%n == 0) m1[c++]=j;
        }
        System.out.println(Arrays.toString(m1));

        c=0;
        for (int j = i; j <Short.MAX_VALUE ; j++)  {
            if (j % n != 0) c++;
        }
        int[] m2= new int[c];
        c=0;
        for (int j = i; j <Short.MAX_VALUE ; j++) {
            if (j%n != 0) m2[c++]=j;
        }
        System.out.println(Arrays.toString(m2));




    }
    private static void print(String str){
        System.out.println(str);
    }
}
