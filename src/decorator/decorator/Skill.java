package decorator.decorator;

import decorator.component.Hero;

/**
 * @author zjq
 * @date 2020/3/15 11:23
 */
public class Skill extends Hero {

    protected  Hero hero;

    public Skill(Hero hero){
        this.hero = hero;
    }

    @Override
    public void learnSkill() {
        hero.learnSkill();
    }
}
