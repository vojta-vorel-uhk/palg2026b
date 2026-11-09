package palg.Cviko07.Uloha01;

public class Main {
    public static void main(String[] args) {
        Item[] db = Utils.getDatabase();
        int[] queries = Utils.getQueries();
        long startTime = System.currentTimeMillis();
        System.out.println("DB size: "+ db.length+" items");
        System.out.println("Queries count: "+ queries.length);
        int successCount = 0;
        for (var q : queries) {
            if(find(db,q,0,db.length))
                successCount++;
        }
        System.out.println("Successful queries count: "+ successCount);
        System.out.print("Trvalo to " + (System.currentTimeMillis() - startTime) + " milisekund");
    }

    // TODO: Pokud db obsahuje položku s klíčem q, vrať true.
    //       - Metoda musí fungovat rychle
    //       - Hlavičku metody je dovoleno měnit
    public static boolean find(Item[] db, int q, int start, int count)
    {
        if(count <= 1){
            return db[start].Key == q;
        }
        // ujasnit co je levá a pravá půlka
        int leftCount = count / 2;
        // zavolat opět find, ale jen pro jednu půlku
        if(db[start+leftCount].Key > q ) {
            return find(db,q,start,leftCount);
        } else {
            return find(db,q,start+leftCount,count-leftCount);
        }
    }
}