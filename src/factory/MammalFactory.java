package factory;

import model.Animal;
import model.Cow;
import model.Monkey;
import model.Tiger;

public class MammalFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Mammals.COW.equals(type)){
            return new Cow();
        } else if (Constants.Animals.Mammals.MONKEY.equals(type)){
            return new Monkey();
        } else if (Constants.Animals.Mammals.TIGER.equals(type)){
            return new Tiger();
        } else {
            throw new Exception("Invalid animal exception");
        }

    }
}
