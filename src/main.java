public class main
{
    public static void main(String[] args)
    {
        System.out.println("This program will help you to create a 12-tone matrix");
        System.out.println("C will be represented by the number 0. \n" +
                           "All other pitches will be represented by n," +
                           "where 1 ≤ n ≤ 11, n ∈ ℕ, and n represents the note n semitones higher than 0");
        System.out.println("Now it's time to create the prime melody. Enter 12 individual numbers between 1 and 11.");
        int[] primeMelody = new int[12];
        //TODO: add user input here using loop below
        /*
        for(int i = 0; i < 12; i++)
        {

        }
         */
        //just using 0 2 7 11 1 5 10 3 4 6 9 8 for now
        primeMelody[0] = 0;
        primeMelody[1] = 2;
        primeMelody[2] = 7;
        primeMelody[3] = 11;
        primeMelody[4] = 1;
        primeMelody[5] = 5;
        primeMelody[6] = 10;
        primeMelody[7] = 3;
        primeMelody[8] = 4;
        primeMelody[9] = 6;
        primeMelody[10] = 9;
        primeMelody[11] = 8;

        //making sure at least the basics are working
        System.out.print("The prime melody is as follows: ");
        for(int i = 0; i < 12; i++)
        {
            System.out.printf("%-4s", primeMelody[i]);
        }
        System.out.println();
    }
}
