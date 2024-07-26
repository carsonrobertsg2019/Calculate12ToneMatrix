public class CreateMatrix
{
    private final int[] primeMelody;
    public CreateMatrix(int[] primeMelody)
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
            int res = out[0][i-1] - out[0][i] + out[i-1][0];
            if(res > 11)
            {
                res -= 12;
            }
            if(0 > res)
            {
                res += 12;
            }
            out[i][0] = res;
        }

        //3. fill out rest of matrix
        for(int i = 1; i < 12; i++)
        {
            int toAdd = out[i][0] - out[i-1][0];
            for(int j = 1; j < 12; j++)
            {
                int res = out[i-1][j] + toAdd;
                if(res > 11)
                {
                    res -= 12;
                }
                if(0 > res)
                {
                    res += 12;
                }
                out[i][j] = res;
            }
        }
        return out;
    }
}
