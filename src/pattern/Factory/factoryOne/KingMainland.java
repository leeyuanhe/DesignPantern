package pattern.Factory.factoryOne;

import pattern.Factory.bean.*;

/**
 * 王者大陆
 */
public class KingMainland {

    SimpleHexoFactory simpleHexoFactory;

    public KingMainland(SimpleHexoFactory simpleHexoFactory){
        this.simpleHexoFactory = simpleHexoFactory;
    }

    public Hexo birthHexo(String type){
        Hexo hexo;

        hexo = simpleHexoFactory.createHexo(type);

        hexo.speakSlogan();
        hexo.choseSkills();
        hexo.showClose();
        return hexo;
    }

}
