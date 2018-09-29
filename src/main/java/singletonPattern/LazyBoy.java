package singletonPattern;

/**
 * 懒汉式，线程安全，就多了个synchronized
 * 节省内存，但效率低
 */
public class LazyBoy {

	private static LazyBoy instance;
	
	private LazyBoy() {
		
	}
	
	public static synchronized LazyBoy getInstance() {
		if(instance == null) {
			instance = new LazyBoy();
		}
		return instance;
	}
}
