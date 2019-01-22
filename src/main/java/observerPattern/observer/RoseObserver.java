package observerPattern.observer;

public class RoseObserver extends Observer {

	@Override
	public void update(String msg) {
		System.out.println(RoseObserver.class.getName() + " : " + msg);
	}
}
