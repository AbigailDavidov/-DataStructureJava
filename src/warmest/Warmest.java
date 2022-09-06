package warmest;

import java.util.Hashtable;
import java.util.Stack;

public class Warmest<K,V> {
	
	private Hashtable<K,V> map = new Hashtable<K,V>();
	private Stack<V> warmest = new Stack<V>();
	
	public void put(K k, V v) { 
		warmest.push(v);
		map.put(k,v);
	}
	
	public V get(K k) {
		if(map.containsKey(k)) {
			warmest.push(map.get(k));
			return map.get(k);
		}
		else {
			return null;
		}
		
	}
	
	public V remove(K k) {
		if(map.containsKey(k)) {
			if(map.get(k) == warmest.peek())
				warmest.pop();
			return map.remove(k);		
		}
		else 
			return null;
	}
	
	public V getWarmest() {
		if(map.isEmpty()) 
			return null;
		else
			return warmest.peek();
	}
	
}
