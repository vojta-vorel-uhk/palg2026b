package palg.Cviko08;

import palg.Messages.Message;

public class Heap implements HeapInterface
{
    private Message[] data;
    private int count;

    public Heap(int capacity)
    {
        this.data = new Message[capacity];
        count = 0;
    }
    public Message extractMin(){
        var result = data[0];
        // TODO 6: odstranit minimum "nahrubo"
        data[0] = data[count-1];
        count--;
        data[count]=null;
        // TODO 7: while cyklem opravit haldu

        return result;
    }

    public void add(Message m)
    {
        // TODO 4: přidat prvek "nahrubo"
        data[count] = m;
        count++;
        // TODO 5: metodou repairUp cyklem opravit haldu
        repairUp(count-1);
    }

    private void repairUp(int index)
    {
        if(index == 0)
            return;
        var parent = parent(index);
        if( !isOk(index,parent) ){
            swap(index,parent);
            repairUp(parent);
        }
    }

    private int lowerChildIndex(int current){
        var leftChild = leftChild(current);
        var rightChild = rightChild(current);
        if(leftChild>=count) // pokud nemám potomky, vrátím chybovou hodnotu
            return -1;
        if(rightChild>=count) // pokud mám jen levého, vrátím jeho index
            return leftChild;
        if(data[rightChild].compareTo(data[leftChild]) > 0)  // pokud mám oba, vrátím index toho, který má nižší klíč
            return leftChild;
        return  rightChild;
    }

    private boolean isOk(int child, int parent)
    {
        return data[child].compareTo(data[parent]) > 0;
    }

    private void swap(int a, int b){
        var temp = data[b];
        data[b] = data[a];
        data[a] = temp;
    }

    private static int leftChild(int index){
        return index*2+1; // TODO 3
    }

    private static int rightChild(int index){
        return index*2+2; // TODO 2
    }

    private static int parent(int index){
        return (index-1)/2; // TODO 1
    }
}
