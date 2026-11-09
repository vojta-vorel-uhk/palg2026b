package palg.Cviko07.Uloha04;

public class Main {
    public static void main(String[] args)
    {
        printNumbers(90_000_000_000L);
    }

    public static void printNumbers(long start)
    {
        System.out.println(start);
        if(start <= 1)
            return;

        if(start % 2 == 0)
            printNumbers(start /2);
        else
            printNumbers(start*3+1);
    }

    // TODO: Doplň druhou metodu tak, aby dělala totéž, ale bez rekurze
    public static void printNumbers2(long input)
    {
        while (input > 1)
        {
            System.out.println(input);
            if(input % 2 == 0)
                input /=2;
            else
                input = input*3+1;
        }
    }
}
