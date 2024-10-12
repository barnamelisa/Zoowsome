package factory;

import model.Animal;
import model.Dolphin;
import model.Goldfish;
import model.Octopus;

public class AquaticFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Aquatics.GOLDFISH.equals(type)){
            return new Goldfish();
        } else if (Constants.Animals.Aquatics.OCTOPUS.equals(type)){
            return new Octopus();
        } else if (Constants.Animals.Aquatics.DOLPHIN.equals(type)){
            return new Dolphin();
        } else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
