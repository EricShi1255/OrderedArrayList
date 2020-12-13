import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    
    //constructor; no arguments
    public NoNullArrayList() {
        super();
    }
    public NoNullArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Null values cannot be added");
        }
        else {
            super.add(element);
            return true;
        } 
    }
    public void add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("Null values cannot be added");
        }
        else {
            super.add(index, element);
        } 
    }

    public T set(int index, T value)  {
        if (value == null) {
            throw new IllegalArgumentException("Null values cannot be added");
        }
        else {
        super.set(index, value);
        return value;
        }
    }
}