import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void start()
    {
        System.out.println("This program will help you to create a 12-tone matrix");
        System.out.println("C will be represented by the number 0. \n" +
                "All other pitches will be represented by n," +
                "where 1 ≤ n ≤ 11, n ∈ ℕ, and n represents the note n semitones higher than 0");
        System.out.println("Now it's time to create the prime melody. Enter 12 individual numbers between 1 and 11.");
        //user inputs the prime melody, note by note
    }

    public static int[] createNullMelody()
    {
        int[] primeMelody = new int[12];
        //array is initialized to 0s, makes hard to determine uniqueness of 0 as input
        Arrays.fill(primeMelody,-1);
        return primeMelody;
    }

    public static int[] scanInput(int[] primeMelody)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 12; i++)
        {
            try
            {
                //check if input is numeric
                int in = scanner.nextInt();
                //check if input is valid number
                checkIfValid(in);
                //check if input has been entered before
                checkUnique(primeMelody, in);
                primeMelody[i] = in;
            }
            catch (Exception e)
            {
                System.out.println("input failure");
                System.exit(1);
            }
        }
        return primeMelody;
    }

    public static void checkIfValid(int numToCheck)
    {
        if(numToCheck < 0 || numToCheck > 11)
        {
            throw new RuntimeException();
        }
    }

    public static void checkUnique(int[] primeMelody, int toCheck)
    {
        for(int i = 0; i < 12; i++)
        {
            if(primeMelody[i] == toCheck)
            {
                throw new RuntimeException();
            }
        }
    }

    public static void main(String[] args)
    {
        start();
        int[] nullMelody = createNullMelody();
        int[] primeMelody = scanInput(nullMelody);

        CreateMatrix cm = new CreateMatrix(primeMelody);
        int[][] matrix = cm.calculateMatrixFromPrimeMelody();

        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                System.out.printf("%-4s", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        ConvertMatrixToMusic cmtm = new ConvertMatrixToMusic(matrix);
        cmtm.printAllMelodies();
    }
}