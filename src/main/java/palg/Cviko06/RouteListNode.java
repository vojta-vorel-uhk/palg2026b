package palg.Cviko06;

public class RouteListNode
{
    Location payload;
    RouteListNode next;

    public RouteListNode(Location payload, RouteListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Location getPayload() {
        return payload;
    }

    public RouteListNode getNext() {
        return next;
    }

    public void setPayload(Location payload) {
        this.payload = payload;
    }

    public void setNext(RouteListNode next) {
        this.next = next;
    }
}
