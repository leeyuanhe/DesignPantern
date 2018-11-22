package pattern.Factory.FactoryThree;

import pattern.Factory.FactoryThree.Attributes.*;

public class GHAttributeFactory implements AttributeFactory {

    @Override
    public Name createName() {
        return new GHName();
    }

    @Override
    public Gender createGender() {
        return new GHGender();
    }

    @Override
    public Address createAddress() {
        return new GHAddress();
    }

    @Override
    public Slogan[] createSlogan() {
        return new Slogan[0];
    }

    @Override
    public Shoot canShoot() {
        System.out.println("射手专属");
        return null;
    }
}
