package decoratorPattern;

/**
 * 盲僧-回旋踢大家都懂的
 * Q起手 -> 二段Q近身 -> 在空中插眼 -> W眼 -> 回头就是一jio
 */

public class BlindMonk implements Hero{
	
	private String name;
	
	public BlindMonk(String name) {
		this.name = name;
	}
	
	@Override
	public void learnSkills() {
		System.out.println(name + "获得了以上技能！");
	}

}
