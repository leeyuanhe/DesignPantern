package pattern.Factory.FactoryThree;

public class AiderHexo extends Hexo{

    AttributeFactory attributeFactory;


    public AiderHexo(AttributeFactory attributeFactory){
        this.attributeFactory = attributeFactory;
    }

    @Override
    void prepare() {
        System.out.println("辅助在装配属性");
        attributeFactory.createName();
        attributeFactory.createGender();
        attributeFactory.createAddress();
        attributeFactory.createSlogan();
    }

}
