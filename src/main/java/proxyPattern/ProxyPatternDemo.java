package proxyPattern;

/**
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("dog.jpg");
		
		//图像从磁盘加载，第一次调用时，realImage为null，所以执行了一次构造方法
		image.display();
		System.out.println("");
		//图像不需要从磁盘加载，此时 realImage 不为 null，所以不需要再执行构造方法
		image.display();
	}
}
