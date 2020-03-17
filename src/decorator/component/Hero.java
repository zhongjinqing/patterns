package decorator.component;

import decorator.decorator.Skill;

import java.util.List;

/**
 * @author zjq
 * @date 2020/3/15 11:17
 */
public abstract class Hero {
    protected String name;
    public abstract void learnSkill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
