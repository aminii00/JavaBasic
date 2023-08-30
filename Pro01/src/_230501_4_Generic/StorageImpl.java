package _230501_4_Generic;

public class StorageImpl<T> implements Storage<T> {

    private T[] array; 
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		return array[index];
	}
}
