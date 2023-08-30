package _230501_4_Generic;

public interface Storage<T> {
	
	public void add(T item, int index);
	public T get(int index);
}
