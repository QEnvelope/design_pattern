package pattern.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 枚举适配器
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    //将枚举组合进适配器
    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    //枚举不提供remove方法，智能抛出异常
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
