package pattern.Factory.factoryTow.mainland;

import pattern.Factory.factoryTow.hexo.*;

public class GHLand extends KingMainland {

    @Override
    protected Hexo createHexo(String type) {

        Hexo hexo;
        if (type.equals("辅助")){
            hexo = new GHAiderHexo();
        }else if (type.equals("射手")){
            hexo = new GHArcherHexo();
        }else if(type.equals("刺客")){
            hexo = new GHAssassinHexo();
        }else if (type.equals("法师")){
            hexo = new GHMagerHexo();
        }else if (type.equals("坦克")){
            hexo = new GHTankHexo();
        }else if (type.equals("战士")) {
            hexo = new GHWarriorHexo();
        }else {
            hexo = null;
        }

        return hexo;
    }
}
