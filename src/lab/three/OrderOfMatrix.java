package lab.three;

public class OrderOfMatrix {

    public static void displayArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("===================");
    }

    public static void main(String[] args) {

        int[][] sales = {
                {11, 0, 0, 14, 15},
                {21, 0, 23, 0, 25},
                {31, 32, 0, 34, 0}
        };

        System.out.println("Order of the Sales Matrix:");
        displayArray(sales);

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                if (sales[row][col] == 0) {
                    System.out.println("sales[" + row + "][" + col + "] is already Zero");
                    continue;
                }
                sales[row][col] = 0;
                System.out.println("sales[" + row + "][" + col + "] = 0");
                displayArray(sales);
            }
        }

    }

}

//Output:
//
//Order of the Sales Matrix:
//11 12 13 14 15
//21 22 23 24 25
//31 32 33 34 35
//===================
//sales[0][0] = 0
//0 12 13 14 15
//21 22 23 24 25
//31 32 33 34 35
//===================
//sales[0][1] = 0
//0 0 13 14 15
//21 22 23 24 25
//31 32 33 34 35
//===================
//sales[0][2] = 0
//0 0 0 14 15
//21 22 23 24 25
//31 32 33 34 35
//===================
//sales[0][3] = 0
//0 0 0 0 15
//21 22 23 24 25
//31 32 33 34 35
//===================
//sales[0][4] = 0
//0 0 0 0 0
//21 22 23 24 25
//31 32 33 34 35
//===================
//sales[1][0] = 0
//0 0 0 0 0
//0 22 23 24 25
//31 32 33 34 35
//===================
//sales[1][1] = 0
//0 0 0 0 0
//0 0 23 24 25
//31 32 33 34 35
//===================
//sales[1][2] = 0
//0 0 0 0 0
//0 0 0 24 25
//31 32 33 34 35
//===================
//sales[1][3] = 0
//0 0 0 0 0
//0 0 0 0 25
//31 32 33 34 35
//===================
//sales[1][4] = 0
//0 0 0 0 0
//0 0 0 0 0
//31 32 33 34 35
//===================
//sales[2][0] = 0
//0 0 0 0 0
//0 0 0 0 0
//0 32 33 34 35
//===================
//sales[2][1] = 0
//0 0 0 0 0
//0 0 0 0 0
//0 0 33 34 35
//===================
//sales[2][2] = 0
//0 0 0 0 0
//0 0 0 0 0
//0 0 0 34 35
//===================
//sales[2][3] = 0
//0 0 0 0 0
//0 0 0 0 0
//0 0 0 0 35
//===================
//sales[2][4] = 0
//0 0 0 0 0
//0 0 0 0 0
//0 0 0 0 0
//===================