package palg.Cviko06;

public class RouteList implements SimplifiedList<Location>
{
    RouteListNode head; // když je seznam prázdný, head je null
    int count;
    @Override
    public void addFirst(Location item) {
        head = new RouteListNode(item, head);
        count++;
    }

    @Override
    public void addLast(Location item) {
        if(head == null){
            head = new RouteListNode(item, null);
            count++;
            return;
        }
        // 1) Najdi konec
        RouteListNode last = head;
        while (last.getNext() != null){
            last = last.getNext();
        }
        // 2) Připoj nový uzel
        last.setNext(new RouteListNode(item,null));
        count++;
    }

    // Tato metoda vyhodí IndexOutOfBoundsException
    // pokud je index mimo rozsah
    @Override
    public Location get(int index) {
        if(index < 0 || index >= count){
            throw new IndexOutOfBoundsException();
        }
        var current = head;
        for(int i=0; i<index; i++){
            current = current.getNext();
        }
        return current.getPayload();
    }

    @Override
    public int size() {
        return count;
    }
    // TODO 3:
    //  Implementuj rozhraní SimplifiedList, tak aby fungovalo jako spojový seznam. Využij třídu RouteListNode.

    // TODO 4 (na doma):
    //  Přidej možnost procházet RouteList pomocí for-each cyklu (rozhraní Iterable)
    //  a zprovozni tento cyklus v Utils.geoDistance
    //  konkrétně:
    //  - přidat RouteList implements Iterable<Location>
    //  - k tomu bude potřeba ještě založit třídu
    //    pro tzv. "iterátor" (ukazatel), např. RoutListIterator

}
