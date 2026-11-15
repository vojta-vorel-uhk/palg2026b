package palg.Cviko08;
import palg.Messages.Message;

import java.time.Instant;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        var heap = new Heap(1_000_000);
        heap.add(new Message(Instant.parse("2018-11-30T18:31:00Z"),"Ahoj 3"));
        heap.add(new Message(Instant.parse("2018-11-30T19:35:00Z"),"Ahoj 4"));
        heap.add(new Message(Instant.parse("2018-11-30T11:25:00Z"),"Ahoj 1"));
        heap.add(new Message(Instant.parse("2018-11-30T16:16:00Z"),"Ahoj 2"));
    }
}
