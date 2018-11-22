package pattern.Factory.FactoryThree;



public class GHLand extends KingMainland {

    @Override
    protected Hexo createHexo(String type) {

        Hexo hexo;

        AttributeFactory attributeFactory = new GHAttributeFactory();

        if (type.equals("辅助")){
            hexo = new AiderHexo(attributeFactory);
            hexo.setRemark("我是长城守卫军团的辅助");

        }else if (type.equals("射手")){
            hexo = new ArcherHexo(attributeFactory);
            hexo.setRemark("我是长城守卫军团的射手");
        }else {
            hexo = null;
        }

        return hexo;
    }
}
