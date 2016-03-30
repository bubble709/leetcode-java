import edu.princeton.cs.algs4.*;
public class Candy {  
    public static int candy(int[] ratings) {  
        int size = ratings.length;  
        if (size == 0) return -1;  
        if (size == 1) return 1;  
          
        int[] cans = new int[size];  
        cans[0] = 1;  
        //����ɨ��һ�飬����ұߵ�rating����߸ߣ���ô�ұߵ��ǹ����ͱ���߶�һ��������ֻ��һ���ǹ�  
        for (int i = 1; i < size; i++) {  
            if (ratings[i] > ratings[i - 1]) cans[i] = cans[i - 1] + 1;  
            else cans[i] = 1;  
        }  
        //����ɨ��һ�飬�����ߵ�rating���ұ߸ߣ�������ߵ��ǹ������ұ��٣���ô��ߵ��ǹ���Ӧ���ұ߶�һ  
        for (int i = size - 2; i >= 0; i--) {  
            if (ratings[i] > ratings[i + 1] && cans[i] <= cans[i + 1]) {  
                cans[i] = cans[i + 1] + 1;  
            }  
        }  
          
        int ret = 0;  
        for (int i = 0; i < size; i++) {  
            ret += cans[i];  
        }  
          
        return ret;  
    }  
    public static void main(String[] args){
        int[] rating = new int[]{4,5,4,4,3,2,3};
        int total = candy(rating);
        StdOut.println("The least total is " + total);
    }
}  
