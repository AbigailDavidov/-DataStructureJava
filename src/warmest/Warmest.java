package warmest;

import java.util.Hashtable;

public class Warmest<K,V> {
	
	private Hashtable<K,V> map = new Hashtable<K,V>();
	private V warmest;
	
	public void put(K k, V v) { 
		warmest = v;
		map.put(k,v);
	}
	
	public V get(K k) {
		if(map.containsKey(k)) {
			warmest = map.get(k);
			return warmest;
		}
		else {
			return null;
		}
		
	}
	
	public V remove(K k) {
		if(map.containsKey(k)) {
			if(map.get(k) == warmest && !map.isEmpty())
				warmest = map.values().iterator().next();
			return map.remove(k);		
		}
		else 
			return null;
	}
	
	public V getWarmest() {
		if(map.isEmpty()) 
			return null;
		else
			return warmest;
	}
	

}
