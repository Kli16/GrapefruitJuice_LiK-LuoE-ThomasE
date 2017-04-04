//Team GrapefruitJuice: Kevin Li, Edward Luo, Eugene Thomas
//APCS2 pd4
//Lab02 -- All Hands on Deque!
//2017-04-04

import java.util.ArrayList; 

public class ALDeque<D> implements Deque<D> {
    
    // PRIVATE VARIABLES 

    private ArrayList<D> arr;
    private int size;

    // DEFAULT CONSTRUCTOR
 
    public ALDeque() {
	arr = new ArrayList<D>(); 
	size = 0;
    }

    // SIZE ACCESSOR 

    public int size() {
	return size; 
    } // O(1) 

    // CHECKS IF ARRAY IS EMPTY

    public boolean isEmpty() {
	return size == 0; 
    } // O(1)

    // Adds to the front... 

    public void addFirst( D d ) {
	arr.add(0,d); 
	size++; // increments size
    } // O(n) 

    // Adds to the end... 

    public void addLast( D d ) {
	arr.add(d); 
	size++; // increments size
    } // O(1)

    // Removes from the front...

    public D removeFirst() {
	size--; // decrements size
	D hold = arr.get(0); 
        arr.remove(0); // utilizes the fact that .remove() returns the removed value
	return hold;
    } // O(n) 

    // Removes from the end... 

    public D removeLast() {
	size--; // decrements size
	D hold = arr.get(size); 
        arr.remove(size); // utilizes the fact that .remove() returns the removed value
	return hold; 
    } // O(1)

    // Returns the value at the front... 

    public D peekFirst() {
	return arr.get(0); 
    } // O(1)

    // Returns the value at the end... 

    public D peekLast() {
	return arr.get(size()-1); 
    } // O(1)
    
    // Checks if a value is in the deque... 

    public boolean contains (D d) { 
	for (D i: arr) { // for each D in arr...
	    if (d.equals(i)) {return true;} // if the value is there, retrurn to true 
	} 
	return false; // otherwise, return false. 
    } // O(n) 

    // Removes a value at its closest index to the front... 
    // if a removal is done: true
    // if the value is not in the deque: false

    public boolean removeFirstOccurence(D d) { 
	if (!contains(d)) {return false;} // if the value isn't there, return false
	for (int i = 0; i < arr.size(); i++) { 
	    if (arr.get(i).equals(d)) { 
		arr.remove(i); // removes
		break; // breaks loop to return true 
	    } 
	} 
	return true; 
    } // O(n) --> amortized at n/2
    
    // Removes a value at its closest index to the front... 
    // if a removal is done: true
    // if the value is not in the deque: false

    public boolean removeLastOccurence (D d) { 
	if (!contains(d)) {return false;} 
	for (int i = arr.size()-1; i >= 0; i--) { 
	    if (arr.get(i).equals(d)) { 
		arr.remove(i); // removes
		break; // breaks loop to return true 
	    } 
	} 
	return true; 
    } // O(n) --> amortized at n/2

    // TO STRING

    public String toString() { 
	String retStr = ""; 
	for (D d: arr) { 
	    retStr += d + " "; 
	}
	return retStr; 
    } // O(n) 

    public static void main (String[] args) { 

	// creates three deques to test methods on: 

	Deque<String> Eddie = new ALDeque<String>(); 
	Deque<String> Eugene = new ALDeque<String>(); 
	Deque<String> Kli6 = new ALDeque<String>();

	// TEST ONE: ADDING AND REMOVING 

	System.out.println("\n\nTEST ONE: ADDING AND REMOVING\n\n"); 

	System.out.println("Adding to Eddie... ");
	Eddie.addFirst("Luo!"); 
	Eddie.addFirst("Edward"); 
	Eddie.addFirst("is"); 
	Eddie.addFirst("name"); 
	Eddie.addFirst("My"); 
	System.out.println(Eddie); // "My name is Edward Luo!"

	System.out.println("Adding to Eugenio... ");
	Eugene.addFirst("Thomas!"); 
	Eugene.addFirst("Eugene"); 
	Eugene.addFirst("is"); 
	Eugene.addFirst("name"); 
	Eugene.addFirst("My"); 
	System.out.println(Eugene);  // "My name is Eugene Thomas!"

	System.out.println("Adding to Kli6");
	Kli6.addFirst("Li!"); 
	Kli6.addFirst("Kevin"); 
	Kli6.addFirst("is"); 
	Kli6.addFirst("name"); 
	Kli6.addFirst("My"); 
	System.out.println(Kli6);  // "My name is Kevin Li!"
	
	// Removes our names from the deque using removeLast: 

	System.out.println("Removing....."); 
	Eddie.removeLast(); 
	Eugene.removeLast(); 
	Kli6.removeLast();
	Eddie.removeLast(); 
	Eugene.removeLast(); 
	Kli6.removeLast();  
	System.out.println(Eddie); // "My name is"
	System.out.println(Eugene); // "My name is" 
	System.out.println(Kli6); // "My name is" 

	// Adds nicknames to each deque using addLast: 

	System.out.println("Adding nicknames..."); 
	Eddie.addLast("E-Luo!"); 
	Eugene.addLast("Eugenio!"); 
	Kli6.addLast("Kli6!");
	System.out.println(Eddie); // "My name is E-Luo!"
	System.out.println(Eugene); // "My name is Eugenio!" 
	System.out.println(Kli6); // "My name is Kli6!"
	
	// Gets only the nickname by using removeFirst:
 
	System.out.println("Removing greetings..."); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	System.out.println(Eddie); // "E-Luo!"
	System.out.println(Eugene); // "Eugenio!" 
	System.out.println(Kli6); // "Kli6!"

	// TEST TWO: PEEKING AND EMPTINESS 

	System.out.println("\n\nTEST TWO: PEEKING AND EMPTINESS\n\n");

	System.out.println("Nicknames^2..."); 
	System.out.println(Eddie.peekFirst()); // "E-Luo!"
	System.out.println(Eugene.peekFirst()); // "Eugenio!" 
	System.out.println(Kli6.peekFirst()); // "Kli6!"
	System.out.println(Eddie.peekLast()); // "E-Luo!"
	System.out.println(Eugene.peekLast()); // "Eugenio!" 
	System.out.println(Kli6.peekLast()); // "Kli6!"

	// Removes the nicknames by using removeFirst.
	// Tests isEmpty: 

	System.out.println("isEmpty pre-removal..."); 
        System.out.println(Eddie.isEmpty()); // false
	System.out.println(Eugene.isEmpty()); // false 
	System.out.println(Kli6.isEmpty()); // false
	System.out.println("Removing..."); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	System.out.println("isEmpty post-removal..."); 
        System.out.println(Eddie.isEmpty()); // true
	System.out.println(Eugene.isEmpty()); // true
	System.out.println(Kli6.isEmpty()); // true
       	

	// TEST THREE: CONTAINS AND OCCURENCE-BASED REMOVAL
	
	System.out.println("\n\nTEST THREE: CONTAINS AND OCCURENCE-BASED REMOVAL\n\n"); 

	Deque<String> TBM = new ALDeque<String>(); 
	System.out.println("Filling TBM..."); 
	TBM.addLast("Digital"); 
	TBM.addLast("Feedback");	
	TBM.addLast("Analog");
	TBM.addLast("Feedback");
	System.out.println(TBM); // "Digital Feedback Analog Feedback"
	System.out.println("Testing contains..."); 
	System.out.println(TBM.contains("Digital")); // true
	System.out.println(TBM.contains("Thumbs?")); // false 	
	System.out.println("RFO of Feedback...");
	TBM.removeFirstOccurence("Feedback"); 
	System.out.println(TBM); // "Digital Analog Feedback" 
	System.out.println("RLO of Feedback..."); 
	TBM.removeLastOccurence("Feedback"); 
	System.out.println(TBM); // "Digital Analog" 

	// TEST FOUR: TO GET AN ERROR
	
	System.out.println("\n\nRemoving from an empty deque (an error should be returned)...\n\n"); 
	Eddie.removeFirst(); // ERROR
	Eugene.removeFirst(); // ERROR
	Kli6.removeFirst(); // ERROR	
    } 
}
