package pattern.Factory.factoryTow.hexo;

import java.util.ArrayList;

public abstract class Hexo {
    String name;
    String gender;
    String address;

    ArrayList sloganList = new ArrayList();

    public void speakSlogan(){
        System.out.println("我是"+name);
        System.out.println("我的性别是"+gender);
        System.out.println("我家在"+address);
        for (int i = 0; i < sloganList.size(); i++) {
            System.out.println("我的口号是=>"+sloganList.get(i));
        }

    }

    /**
     * 装配技能
     */
    public void choseSkills(){
        System.out.println(name+"在装配技能");
    }


    /**
     *  展示皮肤
     */
    public void showClose(){
        System.out.println(name+"在换皮肤");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList getSloganList() {
        return sloganList;
    }

    public void setSloganList(ArrayList sloganList) {
        this.sloganList = sloganList;
    }
}
