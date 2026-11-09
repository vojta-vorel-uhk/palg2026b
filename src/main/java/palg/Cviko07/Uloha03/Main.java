package palg.Cviko07.Uloha03;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(compute(5));
    }

    // TODO: Uhodni, co metoda měla dělat a uprav ji tak, aby fungovala.
    public static long compute(long input)
    {
        return input * compute(input -1);
    }
}
