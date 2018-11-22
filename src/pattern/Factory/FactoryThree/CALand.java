package pattern.Factory.FactoryThree;

public class CALand extends KingMainland {

    @Override
    protected Hexo createHexo(String type) {

        Hexo hexo;

        AttributeFactory attributeFactory = new CAAttributeFactory();

        if (type.equals("辅助")){
            hexo = new AiderHexo(attributeFactory);
            hexo.setRemark("我是一名长安的辅助");
            hexo.prepare();
            System.out.println(hexo.getRemark());
        }else if (type.equals("射手")){
            hexo = new ArcherHexo(attributeFactory);
            hexo.setRemark("我是一名长安的射手");
            hexo.prepare();
            System.out.println(hexo.getRemark());
        }else {
            hexo = null;
        }

        return hexo;
    }
}
