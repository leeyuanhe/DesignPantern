package pattern.Factory.factoryTow.hexo;

public class CDAssassinHexo extends  Hexo{
    public CDAssassinHexo(){
        name = "韩信";
        gender = "男";
        address = "起源之地";
        sloganList.add("不做无法实现的梦。");
        sloganList.add("到达胜利之前，无法回头。");
        sloganList.add("必将百倍奉还。");
        sloganList.add("颠覆无趣的世道。");
        sloganList.add("举世无双!");
        sloganList.add("忍无可忍，无需再忍！");
    }

    @Override
    public void showClose() {
        System.out.println("拥有琢梦之影的限定皮肤");
    }
}
