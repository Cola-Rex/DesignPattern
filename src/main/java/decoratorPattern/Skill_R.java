package decoratorPattern;

public class Skill_R extends Skills{    
    
    private String skillName;
    
    public Skill_R(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }
    
    @Override
    public void learnSkills() {
        System.out.println("学习R技能:" +skillName );
        super.learnSkills();
    }
}