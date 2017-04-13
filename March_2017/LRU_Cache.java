package tPractice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class LRU_Cache<T, E> {
		
	private Map<T, E> map;
	private int capacity;
		
	public LRU_Cache(int capacityIn){
		this.capacity = capacityIn;
		map = new LinkedHashMap<T, E>(capacity+1);
	}

	
	public E getValue(T key){
		if(key != null){
			E val = map.get(key);
			map.remove(key);
			map.put(key, val);
			return val;
		}
		return null;
	}

	// Hash table and linked list implementation of the Map interface, 
	// with predictable iteration order
	public boolean set(T key, E valIn){
		
		if(key != null){
			if(map.size() < capacity){
				map.remove(key);
				map.put(key, valIn);
				return true;
			}
			else{
				map.remove(map.entrySet().iterator().next().getKey());
				map.put(key, valIn);
				return true;
			}
		}
		return false;
	}
}
