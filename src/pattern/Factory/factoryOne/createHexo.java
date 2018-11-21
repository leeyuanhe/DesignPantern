package pattern.Factory.factoryOne;

import pattern.Factory.bean.*;

public class createHexo {

    public Hexo createHexo(String type){
        Hexo hexo;

        if (type.equals("辅助")){
            hexo = new AiderHexo();
        }else if (type.equals("射手")){
            hexo = new ArcherHexo();
        }else if(type.equals("刺客")){
            hexo = new AssassinHexo();
        }else if (type.equals("法师")){
            hexo = new MageHexo();
        }else if (type.equals("坦克")){
            hexo = new TankHexo();
        }else if (type.equals("战士")) {
            hexo = new WarriorHexo();
        }else {
            hexo = new NoOneHexo();
        }

        hexo.speakSlogan();
        hexo.choseSkills();
        hexo.showClose();
        return hexo;
    }
}
