package observerPattern;

import observerPattern.observer.JackObserver;
import observerPattern.observer.PaulObserver;
import observerPattern.observer.RoseObserver;

public class Main {

	public static void main(String[] args) {
		JackObserver jackObserver = new JackObserver();
		RoseObserver roseObserver = new RoseObserver();
		PaulObserver paulObserver = new PaulObserver();
		Subject subject = new Subject();
		
		subject.addAttach(jackObserver);
		subject.addAttach(roseObserver);
		subject.addAttach(paulObserver);
		subject.setMsg("我用双手成就你的梦想");
	}

}
