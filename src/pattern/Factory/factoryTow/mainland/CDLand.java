package pattern.Factory.factoryTow.mainland;

import pattern.Factory.factoryTow.hexo.*;

public class CDLand extends KingMainland {

    @Override
    protected Hexo createHexo(String type) {

        Hexo hexo;
        if (type.equals("辅助")){
            hexo = new CDAiderHexo();
        }else if (type.equals("射手")){
            hexo = new CDArcherHexo();
        }else if(type.equals("刺客")){
            hexo = new CDAssassinHexo();
        }else if (type.equals("法师")){
            hexo = new CDMagerHexo();
        }else if (type.equals("坦克")){
            hexo = new CDTankHexo();
        }else if (type.equals("战士")) {
            hexo = new CDWarriorHexo();
        }else {
            hexo = null;
        }

        return hexo;
    }
}
