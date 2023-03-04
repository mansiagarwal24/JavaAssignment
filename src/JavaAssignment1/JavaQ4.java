/*
    Create a two dimensional array of integers and display:

    sum of all elements of each column
    sum of all elements of each row

 */

package JavaAssignment1;
public class JavaQ4 {

    public static void main(String[] args){
        int[][] array={{1,2,3},
                       {3,4,5},
                       {5,6,7}};

        for(int i=0;i<array.length;i++){
            int rowSum=0;
            for(int j=0;j<array.length;j++){
                rowSum+=array[i][j];
            }
            System.out.println("Sum of row is: "+rowSum);
        }

        for(int i=0;i<array[0].length;i++){
            int colSum=0;
            for(int j=0;j<array.length;j++){
                colSum+=array[j][i];
            }
            System.out.println("Sum of column is: "+colSum);
        }
    }
}

