
class Practical2_q1 {
    public static int[][] create_fill_matrix() {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) ((Math.random() * 5) % 2);

            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        System.out.println("\n Matrix vlaue\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int my_matrix[][];
        int cnt;
        my_matrix = create_fill_matrix();
        displayMatrix(my_matrix);
        System.out.println("\nRows Have Odd no of 1s");
        for (int i = 0; i < 6; i++) {
            cnt = 0;
            for (int j = 0; j < 6; j++) {
                if (my_matrix[j][i] == 1) {
                    cnt++;
                }
            }
            if (cnt % 2 != 0) {
                System.out.println("Column " + (i + 1) + " have Odd no of 1s");

            }

        }
    }
}
