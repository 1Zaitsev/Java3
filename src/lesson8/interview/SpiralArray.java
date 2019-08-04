package lesson8.interview;



public class SpiralArray {

    public static void printArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] feelInBySpiral(int x, int y) {
        int[][] array = new int[x][y];
        int minX = 0, maxX = x - 1, minY = 0, maxY = x - 1;
        int count = 0;
        int max = x * y;
        while (count < max && minX >=0) {
            for (int i = minY; i <= maxY; i++) {
                array[minX][i] = count;
                count++;
            }
            minX = minX + 1;
            for (int i = minX; i <= maxX; i++) {
                array[i][maxY] = count;
                count++;
            }
            maxY = maxY - 1;
            for (int i = maxY; i >= minY; i--) {
                array[maxX][i] = count;
                count++;
            }
            maxX = maxX - 1;
            for (int i = maxX; i >= minX; i--) {
                array[i][minY] = count;
                count++;
            }
            minY = minY + 1;
        }
        return array;
    }
}
