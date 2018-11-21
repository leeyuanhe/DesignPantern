package pattern.Factory.factoryTow.mainland;

import pattern.Factory.factoryTow.hexo.*;

public class CALand extends KingMainland {

    @Override
    protected Hexo createHexo(String type) {

        Hexo hexo;
        if (type.equals("辅助")){
            hexo = new CAAiderHexo();
        }else if (type.equals("射手")){
            hexo = new CAArcherHexo();
        }else if(type.equals("刺客")){
            hexo = new CAAssassinHexo();
        }else if (type.equals("法师")){
            hexo = new CAMageHexo();
        }else if (type.equals("坦克")){
            hexo = new CATankHexo();
        }else if (type.equals("战士")) {
            hexo = new CAWarriorHexo();
        }else {
            hexo = null;
        }

        return hexo;
    }
}
