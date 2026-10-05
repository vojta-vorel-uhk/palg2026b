package palg.Cviko02;

public class Uloha00 {
    public static void main(String[] args)
    {
        System.out.println(5 << 1 == 10); // TODO 1: Doplň operátor aby se vypsalo true

        System.out.println(5 % 10 == 5); // TODO 2: Doplň operátor aby se vypsalo true

        System.out.println(5 / 6 == 0); // TODO 3: Doplň operátor aby se vypsalo true

        System.out.println(-7 + 5 == -2); // TODO 4: Doplň operátor aby se vypsalo true

        System.out.println(9 >> 1 == 4); // TODO 5: Doplň operátor aby se vypsalo true

        int a= Integer.MAX_VALUE; // TODO 6: Doplň hodnotu a aby se vypsalo true
        System.out.println( a > a + 1 );

        int b= Integer.MIN_VALUE; // TODO 7: Doplň hodnotu b aby se vypsalo true
        System.out.println( b < 0 && Math.abs(b) == b );

        double c = 9;// TODO 8: Doplň hodnotu c aby se vypsalo true
        System.out.println( 3 * c / 10 != 0.3 * c );

        double d = Math.sqrt(-1); // TODO 9: Doplň hodnotu d aby se vypsalo true
        System.out.println( !( d >= 0 ) && !( d <= 0 ) );

        int e1 = 40; // TODO 10: Doplň hodnotu e1 aby se vypsalo true
        System.out.println( ( 8 & e1 ) == 8 );

        int e2=14; // TODO 11: Doplň hodnotu e2 aby se vypsalo true
        System.out.println( ( 6 | e2 ) == 14 );


    }
}
