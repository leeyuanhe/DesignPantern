package pattern.Factory.FactoryThree;

import pattern.Factory.FactoryThree.Attributes.*;

public class CAAttributeFactory implements AttributeFactory {

    @Override
    public Name createName() {
        return new CAName();
    }

    @Override
    public Gender createGender() {
        return new CAGender();
    }

    @Override
    public Address createAddress() {
        return new CAAddress();
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
