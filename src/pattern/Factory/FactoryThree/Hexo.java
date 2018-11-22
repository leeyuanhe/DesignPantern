package pattern.Factory.FactoryThree;

import pattern.Factory.FactoryThree.Attributes.Address;
import pattern.Factory.FactoryThree.Attributes.Gender;
import pattern.Factory.FactoryThree.Attributes.Name;
import pattern.Factory.FactoryThree.Attributes.Slogan;

public abstract class Hexo {
    String remark;

    Name name;
    Gender gender;
    Address address;
    Slogan slogan[];


    abstract void prepare();


    public void speakSlogan(){
        System.out.println("我是xxxxxx");
        System.out.println("我的性别是xxxxxx");
        System.out.println("我家在xxxxxxx");
    }


    /**
     * 装配技能
     */
    public void choseSkills(){
        System.out.println("xxxxx在装配技能");
    }


    /**
     *  展示皮肤
     */
    public void showClose(){
        System.out.println("xxxxxxx在换皮肤");
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
