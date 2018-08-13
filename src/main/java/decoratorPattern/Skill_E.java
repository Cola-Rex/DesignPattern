package decoratorPattern;

public class Skill_E extends Skills{
    
    private String skillName;
    
    public Skill_E(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习E技能:"+skillName);
        super.learnSkills();
    }
}