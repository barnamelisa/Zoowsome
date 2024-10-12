package factory;

import model.Animal;
import model.Ant;
import model.Bee;
import model.Butterfly;

public class InsectFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Insects.BUTTERFLY.equals(type)){
            return new Butterfly();
        } else if (Constants.Animals.Insects.BEE.equals(type)){
            return new Bee();
        } else if (Constants.Animals.Insects.ANT.equals(type)){
            return new Ant();
        } else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
