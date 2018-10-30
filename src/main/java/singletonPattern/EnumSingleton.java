package singletonPattern;

/**
 * 奇淫巧技，使用枚举实现，绝对防止对此实例化，写法简洁
 * 
 * 创建枚举实例的过程是线程安全的，
 * 所以这种写法没有同步的问题。
 *
 * 单元素的枚举类型是目前实现Singleton的最佳方法
 * 
 * 使用方式：EnumSingleton.INSTANCE.fun();
 */
public enum EnumSingleton {

	INSTANCE;
	
	public void fun() {
		System.out.println("我不想这么帅");
	}
	
}
