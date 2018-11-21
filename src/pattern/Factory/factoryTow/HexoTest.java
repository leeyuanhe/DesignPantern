package pattern.Factory.factoryTow;

import pattern.Factory.factoryTow.hexo.Hexo;
import pattern.Factory.factoryTow.mainland.CALand;
import pattern.Factory.factoryTow.mainland.CDLand;

public class HexoTest {

    public static void main(String[] args) {
        CALand caLand = new CALand();
        CDLand cdLand = new CDLand();

        Hexo caHexo = caLand.birthHexo("射手");
        System.out.println("创造了新英雄"+caHexo.getName());

        Hexo cdHexo = cdLand.birthHexo("法师");
        System.out.println("创造了新英雄"+cdHexo.getName());

    }
}
