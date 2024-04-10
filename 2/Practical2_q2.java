import java.util.Scanner;

 public class Practical2_q2{
    public static int[][] getMinelementsAndIndices(int[][] arr){
        int min = Integer.MAX_VALUE;
        int[][] result = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    result = new int[][]{{i,j}};
                }
                else if (arr[i][j] ==  min){
                    result = appendIndex(result,new int[]{i,j} );

                }
                
            }
        }
        return result;
    }
   private static int[][] appendIndex(int[][] arr, int[]newIndex){
    int[][] newArr = new int[arr.length + 1][2];
    for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
    }
    newArr[arr.length] = newIndex;
    return newArr;
   }
   
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enterf the number of rows:");
    int rows = scanner.nextInt();
    System.out.println("Enter the number of columns:");
    int column = scanner.nextInt();

    int[][] array = new int[rows][column];
    System.out.println("Enter the elements of array:");
    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                    array[i][j] = scanner.nextInt();

            }
    }
    int[][] minElementsAndIndices = getMinelementsAndIndices(array);
    System.out.println("Minimum element(s):" + array[minElementsAndIndices[0][0]][minElementsAndIndices[0][1]]);
    System.out.println("At index/indices:");
    for (int i = 0; i < minElementsAndIndices.length; i++) {
            System.out.println("(" + minElementsAndIndices[i][0] + "," + minElementsAndIndices[i][1] + ")");
    }
    scanner.close();
   }
 }
