package decorator.test;

import decorator.component.Hero;
import decorator.concretecomponent.Timor;
import decorator.concretedecorator.SkillQ;

/**
 * @author zjq
 * @date 2020/3/15 11:35
 */
public class Test {
    public static void main(String[] args) {
        Hero timor = new Timor("提莫");

        SkillQ qKill = new SkillQ(timor,"致盲吹箫");

        qKill.learnSkill();
    }
}
