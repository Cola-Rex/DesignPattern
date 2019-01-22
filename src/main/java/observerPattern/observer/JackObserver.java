package observerPattern.observer;

public class JackObserver extends Observer {

	@Override
	public void update(String msg) {
		System.out.println(JackObserver.class.getName() + " : " + msg);
	}

}
