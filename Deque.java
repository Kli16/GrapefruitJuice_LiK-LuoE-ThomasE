// GrapefruitJuice: Kevin Li, Edward Luo, and Eugene Thomas
// APCS2 pd4
// LAB #02 -- All Hands on Deque 
// 2017-03-31


// Interface for Deque: 

public interface Deque<D> { 

    public int size(); // return size
    public void addFirst(); // adds at front
    public void addLast(); // adds at end
    public D removeFirst(); // removes at front, returns removed value
    public D removeLast(); // removes at end, returns removed value
    public D peekFirst(); // returns value at front, does not remove it
    public D peekLast(); // returns value at end, does not remove it
 
}  