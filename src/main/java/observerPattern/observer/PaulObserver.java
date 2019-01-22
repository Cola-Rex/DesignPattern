package observerPattern.observer;

public class PaulObserver extends Observer {

	@Override
	public void update(String msg) {
		System.out.println(PaulObserver.class.getName() + " : " + msg);
	}
}
