package decoratorPattern;
/*
 * Q技能：回音波
 */
public class Skill_Q extends Skills{

	private String skillName;
	
	public Skill_Q(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}
	
	@Override
	public void learnSkills() {
		System.out.println("学习Q技能：" + skillName);
		super.learnSkills();
	}
}
