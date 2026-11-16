package palg.Cviko07.Uloha05;

public class Main {
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        //System.out.println(fibonacci(42));
        System.out.println(fibonacci2(42));
        System.out.println("Trvalo to " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println(c);
    }
    static int c=0;
    // TODO: Zrychli metodu
    public static long fibonacci(long index)
    {
        c++;
        if(index == 0 || index == 1)
            return 1;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
    public static long fibonacci2(long index){
        long a=1;
        long b=1;
        for(int i=0; i<index-1; i++){
            var oldA=a;
            a=b;
            b=oldA+b;
        }
        return b;
    }

}
