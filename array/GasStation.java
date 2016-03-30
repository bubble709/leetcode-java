/*
 * ����·������N������վ��ÿ������վ������gas[i]����
 * ÿ������վ����һվ��������cost[i]���ʴ��ĸ�����վ
 * �����ܹ��ص���ʼ�㣬����������򷵻�-1��ע�⣬����Ψһ�ģ���
 * ʱ�临�Ӷ�O(n),
 */
import edu.princeton.cs.algs4.*;
public class GasStation {
    public static int judgeComplete (int[] gas,int[] cost) {
         int sum = 0;
         int total = 0;
         int j = -1;
         for(int i = 0;i < gas.length;++i) {
              sum +=gas[i] - cost[i];
              total += gas[i] - cost[i];
              if (sum < 0) {
                   j = i;
                   sum = 0;
              }
         }
         return total>0?j+1:-1;
    }
    public static void main(String[] args) {
        int[] gas = new int[]{5,4,3,6,2,1,7,8,9};
        int[] cost = new int[]{6,2,3,4,5,6,7,8,1};
        int judge = judgeComplete(gas, cost);
        if(-1 == judge)  StdOut.println("Can't complete!!");
        else StdOut.println("Can complete from " + judge);
    }
}