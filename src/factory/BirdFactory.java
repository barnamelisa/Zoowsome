package factory;

import model.Animal;
import model.Eagle;
import model.Hen;
import model.Parrot;

public class BirdFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if(Constants.Animals.Birds.PARROT.equals(type)){
            return new Parrot();
        } else if (Constants.Animals.Birds.HEN.equals(type)){
            return new Hen();
        } else if (Constants.Animals.Birds.EAGLE.equals(type)){
            return new Eagle();
        } else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
