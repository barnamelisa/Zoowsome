package controller;

import factory.AnimalFactory;
import factory.Constants;
import factory.SpeciesFactory;
import model.Animal;

public class MainController {
    public static void main(String[] args) throws Exception {

        AnimalFactory abstractFactory = new AnimalFactory();
        Integer counter=50;

        // first animal
        SpeciesFactory mamalSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);

        Animal lorenzoTheMonkey = mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.MONKEY);

        System.out.printf("We have an animal (Monkey) with %d legs!\n",lorenzoTheMonkey.getNrOfLegs());

        // second animal
        SpeciesFactory reptilSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);

        Animal sisiTheSnake = reptilSpeciesFactory.getAnimal(Constants.Animals.Reptiles.SNAKE);

        System.out.printf("We have an animal (Snake) with %d legs!\n",sisiTheSnake.getNrOfLegs());

        // third animal
        SpeciesFactory birdSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);

        Animal bibTheEagle = birdSpeciesFactory.getAnimal(Constants.Animals.Birds.EAGLE);

        System.out.printf("We have an animal (Eagle) with %d legs!\n",bibTheEagle.getNrOfLegs());

        // fourth
        SpeciesFactory aquaticSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);

        Animal rozaliaTheDolphin = aquaticSpeciesFactory.getAnimal(Constants.Animals.Aquatics.DOLPHIN);

        System.out.printf("We have an animal (Dolphin) with %d legs!\n",rozaliaTheDolphin.getNrOfLegs());

        // fifth
        SpeciesFactory insectSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);

        Animal albinutaTheBee = insectSpeciesFactory.getAnimal(Constants.Animals.Insects.BEE);

        System.out.printf("We have an animal (Bee) with this name: %s!\n",albinutaTheBee.getName());

    }
}

