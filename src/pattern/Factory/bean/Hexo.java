package pattern.Factory.bean;

public class Hexo {

    /**
     *英雄名称
     */
    private String name;

    /**
     *英雄类型
     */
    private String type;


    public void  slogan(){
        System.out.println("英雄的口号！");
    }

    public void addSkills(){
        System.out.println("装配技能");
    }

    public void changeCloses(){
        System.out.println("展示皮肤");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
