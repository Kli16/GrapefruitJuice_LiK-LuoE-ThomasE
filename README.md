# GrapefruitJuice
<p> Kevin Li, Edward Luo, Eugene Thomas </p>

<h2> RUNNING LIST OF METHODS TO IMPLEMENT, BY PRIORITY: </h2>
<ol> 
<li> <code> ALDeque() </code> </li>
<li> <code> int size() </code> </li>
<li> <code> boolean isEmpty() </code> </li>
<li> <code> void addFirst(E e) </code> </li>
<li> <code> void addLast(E e) </code> </li>
<li> <code> E removeFirst() </code> </li>
<li> <code> E removeLast() </code> </li>
<li> <code> E peekFirst() </code> </li>
<li> <code> E peekLast() </code> </li>
<li> <code> E getFirst() </code> </li>
<li> <code> E getLast() </code> </li>
<li> <code> boolean contains(Object o) </code> </li>
<li> <code> boolean removeFirstOccurence(Object o) </code> </li>
<li> <code> boolean removeLastOccurence(Object o) </code> </li>
</ol>

<h2> METHOD SELECTIONS: EXPLANATION </h2>
<p> We chose to start with size() since we figured it would be useful for the rest of the methods, which is the same reason we implemented isEmpty() next. Then, we added the addFirst and addLast, the two removes, the two peeks, and the two gets. We thought these were all of roughly the same importance. For Monday's (4/3) class, we added three more methods that we thought could be useful. Besides these, the other methods of the interface were mostly redundant. </p>

<h2> ARCHITECTURE</h2>
<p> We chose to make a Deque with an ArrayList-based queue, because they were the easiest for our group to understand in our heads, and we couldn't think of any significant pros or cons to any of the three options. </p>
<h2> </h2>
