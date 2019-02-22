package pattern.adapter.enumeration;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 实现ArrayList适配器（拥有remove方法）
 */
public class ArrayListIterator implements Iterator {

    ArrayList arrayList;

    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {

    }

    public void remove(int index) {
        arrayList.remove(index);
    }
}
