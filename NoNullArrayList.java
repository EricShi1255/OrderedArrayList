import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    private ArrayList<T> data;
    
    //constructor; no arguments
    public NoNullArrayList() {
        data = new ArrayList<T>();
    }
    public NoNullArrayList(int n) {
        data = new ArrayList<T>(n);
    }
    public boolean add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("Null values cannot be added");
        }    
        else {
            data.add(index, element);
        }
    }
    public T set(int index, T value)  {

    }
}