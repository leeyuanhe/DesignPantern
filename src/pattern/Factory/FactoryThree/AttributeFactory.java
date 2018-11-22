package pattern.Factory.FactoryThree;

import pattern.Factory.FactoryThree.Attributes.*;

public interface AttributeFactory {

    public Name createName();

    public Gender createGender();

    public Address createAddress();

    public Slogan[] createSlogan();

    public Shoot canShoot();

}
