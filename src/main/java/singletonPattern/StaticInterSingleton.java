package singletonPattern;

/**
 * 对于内部类SingletonHolder，它是一个饿汉式的单例实现，在SingletonHolder初始化的时候会由ClassLoader来保证同步
 *
 * 由于SingletonHolder是一个内部类，
 * 只在外部类的Singleton的getInstance()中被使用，
 * 所以它被加载的时机也就是在getInstance()方法第一次被调用的时候
 * 
 * 利用了ClassLoader来保证了同步，
 * 同时又能让开发者控制类加载的时机。
 * 从内部看是一个饿汉式的单例，但是从外部看来，又的确是懒汉式的实现。
 * 
 * --简直是神乎其技
 */
public class StaticInterSingleton {

	//静态内部类
	private static class SingletonHolder {
		private static final StaticInterSingleton INSTANCE = new StaticInterSingleton();
	}
	
	private StaticInterSingleton () {
	}
	
	public static final StaticInterSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
