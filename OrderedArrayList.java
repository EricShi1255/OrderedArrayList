public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }
    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    //First find the index where the new element should be added
    //add() the new element into that position.
    public boolean add(T element) {
        
        if (size() == 0) {
            super.add(element);
            return true;
        }
        
        if (element == null) {
            throw new IllegalArgumentException("Null values cannot be added");
        }
        if (element.compareTo(get(0)) <= 0) {
            super.add(0, element);
            return true;
        }
        for (int i = 0; i < size()-1; i++) {
            T left = get(i);
            T right = get(i+1);
            if (element.compareTo(left) >= 0 && element.compareTo(right) <= 0) {
                super.add(i+1, element);
                return true;
            }
        }
        super.add(element);
        return true;
    }
    
    public void add (int index, T element) {
        add(element);
    }
    
    public T set (int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        T temp = get(index);
        super.remove(index);
        add(element);
        return temp;
    }
    //Done, Tested
    


}