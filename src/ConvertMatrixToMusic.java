public class ConvertMatrixToMusic
{
    private final int[][] matrix;
    public ConvertMatrixToMusic(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public void printAllMelodies()
    {
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                int m = matrix[i][j];
                switch (m) {
                    case 0: {
                        System.out.printf("%-4s", "C");
                    } case 1: {
                        System.out.printf("%-4s", "Db");
                    } case 2: {
                        System.out.printf("%-4s", "D");
                    } case 3: {
                        System.out.printf("%-4s", "Eb");
                    } case 4: {
                        System.out.printf("%-4s", "E");
                    } case 5: {
                        System.out.printf("%-4s", "F");
                    } case 6: {
                        System.out.printf("%-4s", "Gb");
                    } case 7: {
                        System.out.printf("%-4s", "G");
                    } case 8: {
                        System.out.printf("%-4s", "Ab");
                    } case 9: {
                        System.out.printf("%-4s", "A");
                    } case 10: {
                        System.out.printf("%-4s", "Bb");
                    } case 11: {
                        System.out.printf("%-4s", "B");
                    }
                }
            }
            System.out.println();
        }
    }
}