/**
 * @param <T> The type of the satellite data of the elements in the dynamic-set.
 */
public class MyDynamicSet<T> {
	private MySortedArray<T> array;
	/*
     * You may add any fields that you wish to add.
     * Remember that the use of built-in Java classes is not allowed,
     * the only variables types you can use are: 
     * 	-	the given classes in the assignment
     * 	-	basic arrays
     * 	-	primitive variables
     */
	
	/***
     * The constructor should initiate an empty dynamic-set.
     */
	public MyDynamicSet() {
		this.array = new MySortedArray<>();
	}

	public Element<T> search(int k) {
		return this.array.search(k);

	}
	
	public void insert(Element<T> x) {
		this.array.insert(new ArrayElement<>(x));
	}
	
	public void delete(Element<T> x) {
		this.array.delete((ArrayElement<T>) x);
	}
	
	public Element<T> minimum() {
		return array.get(0);
	}
	
	public Element<T> maximum() {
		return array.get(array.size() - 1);
	}
	
	public Element<T> successor(Element<T> x) {
		if(((ArrayElement<T>) x).index() == array.size() - 1)
			return null;
		else
			return array.get(((ArrayElement<T>) x).index() + 1);
	}
	
	public Element<T> predecessor(Element<T> x) {
		if(((ArrayElement<T>) x).index() == 0)
			return null;
		else
			return array.get(((ArrayElement<T>) x).index() - 1);
	}

	public String toString() {
		String s = "";
		Element<T> curr = minimum();
		while(curr != null) {
			s = s + curr.toString();
			curr = successor(curr);
		}
		return s;
	}
}
