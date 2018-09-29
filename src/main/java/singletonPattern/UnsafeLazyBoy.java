package singletonPattern;

/**
 * 懒汉式，非线程安全，谁用这玩意？？
 */
public class UnsafeLazyBoy {

	private static UnsafeLazyBoy instance;
	
	private UnsafeLazyBoy() {
		
	}
	
	public static UnsafeLazyBoy getInstance() {
		if(instance == null) {
			instance = new UnsafeLazyBoy();
		}
		return instance;
	}
}
