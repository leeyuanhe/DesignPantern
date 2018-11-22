package pattern.Factory.FactoryThree;

public class ArcherHexo extends Hexo {

    AttributeFactory attributeFactory;

    public ArcherHexo(AttributeFactory attributeFactory){
        this.attributeFactory = attributeFactory;
    }

    @Override
    void prepare() {
        System.out.println("射手在装配属性");
        attributeFactory.createName();
        attributeFactory.createGender();
        attributeFactory.createAddress();
        attributeFactory.createSlogan();
        attributeFactory.canShoot();
    }
}
