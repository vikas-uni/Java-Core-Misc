package concurrency;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import misc.Student;

//implementation of LRU(least recent used) cache
public class CustomCacheImpl {

	private Map<Integer, EmployeeCache> empCache;
	private Deque<Integer> queue;
	private int capacity;
	
	

	public Map<Integer, EmployeeCache> getEmpCache() {
		return empCache;
	}

	public Deque<Integer> getQueue() {
		return queue;
	}

	public CustomCacheImpl(int initialCapacity) {
		super();
		this.empCache = new HashMap<>(initialCapacity);
		this.queue = new LinkedList<>();
		this.capacity = initialCapacity;

	}

	public EmployeeCache getFromCache(int id) {
		if (empCache.containsKey(id)) {
			EmployeeCache emp = empCache.get(id);
			queue.remove(id);
			queue.addFirst(id);
			return emp;
		}
		return null;
	}

	public void putIntoCache(EmployeeCache emp) {
		if (empCache.containsKey(emp.getId())) {
			queue.remove(emp.getId());
			queue.addFirst(emp.getId());
		} else {
			if (empCache.size() == capacity) {
				Integer lru = queue.removeLast();
				empCache.remove(lru);
			}

			empCache.put(emp.getId(), emp);
			queue.addFirst(emp.getId());
		}
	}

	public static void main(String[] args) {
		CustomCacheImpl cacheImpl = new CustomCacheImpl(4);
		cacheImpl.putIntoCache(new EmployeeCache(1, "asd"));
		cacheImpl.putIntoCache(new EmployeeCache(2, "def"));
		cacheImpl.putIntoCache(new EmployeeCache(3, "vfs"));
		cacheImpl.putIntoCache(new EmployeeCache(4, "bgf"));
		
		System.out.println("after full cache");
		cacheImpl.getEmpCache().entrySet().forEach(e -> System.out.println(e.getKey()+ " : "+e.getValue().getName()));
		
		System.out.println("getting last added");
		System.out.println(cacheImpl.getFromCache(1).getName());
		
		
		System.out.println("after adding extra into cache");
		cacheImpl.putIntoCache(new EmployeeCache(5, "erf"));
		cacheImpl.getEmpCache().entrySet().forEach(e -> System.out.println(e.getKey()+ " : "+e.getValue().getName()));
		
	}
}

class EmployeeCache {
	private Integer id;
	private String name;

	public EmployeeCache(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

//other implementation
class MyCustomLRUcache<K,T> {

	int maxSize = -1;
	
	Deque<K> index;
	Map<K,T> entries;
	
	public MyCustomLRUcache(int size){
		this.maxSize = size;
		index = new ArrayDeque<>(size);
		entries = new HashMap<>(size);
	}
	
	public T getFromCache(K id) {
		if(index.remove(id)) {
			index.push(id);
			return entries.get(id);
		}
		return null;
	}
	
	public void addToCache(K key,T element){
		if(index.size() == maxSize) {
			K last = index.pollLast();
			entries.remove(last);
			
			index.push(key);
			entries.put(key, element);
		}else {
			index.push(key);
			entries.put(key, element);
		}
	}
	
	
	public static void main(String[] args) {
		Student st1 = new Student("erweq", 1, 14);
		Student st2 = new Student("terwe", 2, 34);
		Student st3 = new Student("bcvxcx", 3, 54);
		Student st4 = new Student("vxc", 4, 74);
		Student st5 = new Student("ffgsd", 5,15);
		
		MyCustomLRUcache<Integer, Student> myCache = new MyCustomLRUcache<>(4);
		myCache.addToCache(st1.getRollno(), st1);
		myCache.addToCache(st2.getRollno(), st2);
		myCache.addToCache(st3.getRollno(), st3);
		myCache.addToCache(st4.getRollno(), st4);
		
		myCache.getFromCache(st2.getRollno()).show();
	}
	
}


