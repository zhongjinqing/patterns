package decorator.concretecomponent;

import decorator.component.Hero;
import decorator.decorator.Skill;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjq
 * @date 2020/3/15 11:25
 */
public class Timor extends Hero {

    public Timor(String heroName){
        this.name = heroName;
    }


    @Override
    public void learnSkill() {
        System.out.println("Timor:"+this.name+",learn Skill");
    }

}
