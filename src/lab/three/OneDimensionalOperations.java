package lab.three;

import java.util.Arrays;

public class OneDimensionalOperations {

    public static void main(String[] args) {

        int[] arr = new int[15];

        System.out.println("Initialize array with Zeroes");
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));

        System.out.println("\nAdd 1 to Last 5 Elements");
        for(int i = 10; i < arr.length; i++){
            arr[i] += 1;
            System.out.println(i + "->" + arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("\nBest Score in Column Format");
        int[] bestScores = new int[] {58, 78, 99, 100, 45};
        System.out.println(Arrays.toString(bestScores));
        System.out.println("Sorting...");
        for (int i = 0; i < bestScores.length; i++) {
            for (int j = i + 1; j < bestScores.length; j++) {
                int tmp = 0;
                if (bestScores[i] < bestScores[j]) {
                    tmp = bestScores[i];
                    bestScores[i] = bestScores[j];
                    bestScores[j] = tmp;
                }
            }
        }
        System.out.printf("%-5s %10s %n", "Rank", "Score");
        for(int i=0; i< bestScores.length;i++){
            System.out.printf("%-5d %10d %n", (i+1), bestScores[i]);
        }

    }

}

// Output:
//
// Initialize array with Zeroes
// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//
// Add 1 to Last 5 Elements
// 10->1
// 11->1
// 12->1
// 13->1
// 14->1
// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
//
// Best Score in Column Format
// [58, 78, 99, 100, 45]
// Sorting...
// Rank       Score
// 1            100
// 2             99
// 3             78
// 4             58
// 5             45
