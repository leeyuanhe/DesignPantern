package pattern.Factory.factoryTow.hexo;

public class CDTankHexo extends  Hexo{
    public CDTankHexo(){
        name = "妲己";
        gender = "女";
        address = "起源之地";
        sloganList.add("请尽请吩咐妲己，主人~");
        sloganList.add("鸡棒是什么意思?");
        sloganList.add("妹有心，就不会手上");
        sloganList.add("为什么要伤心呢?一直微笑就好了");
        sloganList.add("妲己一直爱主人，因为被设定成这样");
        sloganList.add("尾巴~不止可以用来挠痒痒哦~");
    }

    @Override
    public void showClose() {
        System.out.println("拥有热情桑巴的限定皮肤");
    }
}
