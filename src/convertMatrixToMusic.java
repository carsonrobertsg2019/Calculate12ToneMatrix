public class convertMatrixToMusic
{
    private final int[][] matrix;
    public convertMatrixToMusic(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public void printAllMelodies()
    {
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                if(matrix[i][j] == 0)
                {
                    System.out.printf("%-4s", "C");
                }
                else if(matrix[i][j] == 1)
                {
                    System.out.printf("%-4s", "Db");
                }
                else if(matrix[i][j] == 2)
                {
                    System.out.printf("%-4s", "D");
                }
                else if(matrix[i][j] == 3)
                {
                    System.out.printf("%-4s", "Eb");
                }
                else if(matrix[i][j] == 4)
                {
                    System.out.printf("%-4s", "E");
                }
                else if(matrix[i][j] == 5)
                {
                    System.out.printf("%-4s", "F");
                }
                else if(matrix[i][j] == 6)
                {
                    System.out.printf("%-4s", "Gb");
                }
                else if(matrix[i][j] == 7)
                {
                    System.out.printf("%-4s", "G");
                }
                else if(matrix[i][j] == 8)
                {
                    System.out.printf("%-4s", "Ab");
                }
                else if(matrix[i][j] == 9)
                {
                    System.out.printf("%-4s", "A");
                }
                else if(matrix[i][j] == 10)
                {
                    System.out.printf("%-4s", "Bb");
                }
                else if(matrix[i][j] == 11)
                {
                    System.out.printf("%-4s", "B");
                }
            }
            System.out.println();
        }
    }
}
