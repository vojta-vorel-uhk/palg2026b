package palg.Cviko03;

public class Uloha03
{
    public static void main(String[] args)
    {
    }

    // TODO: Doplň metodu, která spočítá součet všech prvků 2D pole
    public static double sum(double[][] matrix)
    {
        double sum = 0;
        for(int row=0; row<matrix.length; row++)
        {
            for(int col=0;col<matrix[row].length; col++)
            {
                sum += matrix[row][col];
            }
        }
        return sum;

    }
}