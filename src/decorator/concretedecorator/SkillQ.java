package decorator.concretedecorator;

import decorator.component.Hero;
import decorator.decorator.Skill;

/**
 * @author zjq
 * @date 2020/3/15 11:28
 */
public class SkillQ extends Skill {

    private String skillName;

    public SkillQ(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        System.out.println(hero.getName()+" learn the q skill ("+this.skillName+")");
        hero.learnSkill();
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
