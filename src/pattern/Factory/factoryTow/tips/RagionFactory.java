package pattern.Factory.factoryTow.tips;

import pattern.Factory.factoryOne.KingMainland;

public class RagionFactory {

    public static void main(String[] args) {


        ChanganHexoFactory changanHexoFactory = new ChanganHexoFactory();
        KingMainland changanFac = new KingMainland(changanHexoFactory);
        changanFac.birthHexo("射手");


        CloudDesertHexoFactory cloudDesertHexoFactory = new CloudDesertHexoFactory();
        KingMainland cloudDesert = new KingMainland(cloudDesertHexoFactory);
        cloudDesert.birthHexo("射手");//

        GreatWallHexoFactory greatWallHexoFactory = new GreatWallHexoFactory();
        KingMainland greateFac = new KingMainland(greatWallHexoFactory);
        greateFac.birthHexo("射手");

    }
}
