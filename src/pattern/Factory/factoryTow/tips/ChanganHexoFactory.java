package pattern.Factory.factoryTow.tips;

import pattern.Factory.bean.Hexo;
import pattern.Factory.factoryOne.SimpleHexoFactory;

public class ChanganHexoFactory extends SimpleHexoFactory {

    @Override
    public Hexo createHexo(String type) {
        return super.createHexo(type);
    }
}
