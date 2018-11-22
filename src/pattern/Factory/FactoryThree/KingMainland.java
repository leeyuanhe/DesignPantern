package pattern.Factory.FactoryThree;



public abstract class KingMainland {


    public Hexo birthHexo(String type){

        Hexo hexo;

        hexo = createHexo(type);

        hexo.speakSlogan();
        hexo.choseSkills();
        hexo.showClose();
        return hexo;
    }

    protected abstract Hexo createHexo(String type);

}
