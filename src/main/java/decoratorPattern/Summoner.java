package decoratorPattern;

/**
 * 这是一个“装饰器模式”的简单实现
 * 逻辑有点不那么直观，说实话我也有点慌
 */
public class Summoner {

	public static void main(String[] args) {
		//选择英雄
		Hero hero = new BlindMonk("龙瞎");
		
		Skills skills = new Skills(hero);
		Skills r = new Skill_R(skills, "猛龙摆尾");
		Skills e = new Skill_E(r, "天雷破");
		Skills w = new Skill_W(e, "金钟罩");
		Skills q = new Skill_Q(w, "天音波");
		//学习技能
		q.learnSkills();
	}

}
