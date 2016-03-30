import edu.princeton.cs.algs4.*;
public class SetZeros {  
    public static void setZeroes(int[][] matrix) {  
        int m = matrix.length;  
        int n = matrix[0].length;  
        int i, j;  
          
        //�ȱ�ǵ�һ�к͵�һ���Ƿ���0  
        boolean firstRow = false, firstCol = false;  
        for (j = 0; j < n; j++) {  
            if (0 == matrix[0][j]) {  
                firstRow = true;  
                break;  
            }  
        }  
        for (i = 0; i < m; i++) {  
            if (0 == matrix[i][0]) {  
                firstCol = true;  
                break;  
            }  
        }  
           
        //�ӵڶ��еڶ��л��Ǳ������������0������������к��еĵ�һ��ֵ��Ϊ0     
        for (i = 1; i < m; i++) {  
            for (j = 1; j < n; j++) {  
                if (0 == matrix[i][j]) {  
                    matrix[i][0] = 0;  
                    matrix[0][j] = 0;  
                }  
            }  
        }  
          
        //�ѵ�һ�е�0�����ж���Ϊ0���ѵ�һ�е�0�����ж���Ϊ0  
        for (i = 1; i < m; i++) {  
            if (0 == matrix[i][0]) {  
                for (j = 1; j < n; j++) {  
                    matrix[i][j] = 0;  
                }  
            }  
        }  
        for (j = 1; j < n; j++) {  
            if (0 == matrix[0][j]) {  
                for (i = 1; i < m; i++) {  
                    matrix[i][j] = 0;  
                }  
            }  
        }  
          
        //���ݱ�Ǿ�����һ�к͵�һ���Ƿ�ȫ��Ϊ0  
        if (firstRow) {  
            for (j = 0; j < n; j++) {  
                matrix[0][j] = 0;  
            }  
        }  
        if (firstCol) {  
            for (i = 0; i < m; i++) {  
                matrix[i][0] = 0;  
            }  
        }  
    } 
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,1,0,1},{0,1,1,1},{1,1,1,1}};
        setZeroes(matrix);
        for(int i = 0 ;i < 3; ++i) {
            for(int j = 0;j < 4;++j) {
                 if(j == 3) StdOut.println(matrix[i][j]);
             else 
                 StdOut.print(matrix[i][j] + " ");
            }
        }        
    }
}