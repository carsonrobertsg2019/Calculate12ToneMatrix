public class createMatrix
{
    private int[] primeMelody;
    public createMatrix(int[] primeMelody)
    {
        this.primeMelody = primeMelody;
    }

    public int[][] calculateMatrixFromPrimeMelody()
    {
        //1. fill first row with prime melody
        int[][] out = new int[12][12];
        out[0] = primeMelody;

        //2. fill first column with inversion of prime melody
        for(int i = 1; i < 12; i++)
        {
            out[i][0] = 12 - out[0][i];
        }

        //3. fill out rest of matrix
        for(int i = 1; i < 12; i++)
        {
            for(int j = 1; j < 12; j++)
            {
                int temp = out[i][0] + out[0][j];
                if(temp > 11)
                {
                    temp -= 12;
                }
                out[i][j] = temp;
            }
        }
        return out;
    }
}
