package palg.Cviko07.Uloha03;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(compute(5));
    }

    // TODO: Uhodni, co metoda měla dělat a uprav ji tak, aby fungovala.
    public static long compute(long input)
    {
        if(input == 1)
            return 1;
        return input * compute(input -1);
    }
    public static long compute2(long input)
    {
        long result = 1;
        for (int i =1; i <=input;i++)
            result *=i;
        return result;
    }
}
