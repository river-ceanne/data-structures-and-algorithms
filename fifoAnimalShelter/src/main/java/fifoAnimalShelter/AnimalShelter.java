package fifoAnimalShelter;

import java.util.ArrayList;
import java.util.Queue;

public class AnimalShelter {

    protected ArrayList<Animal> animals;

    public AnimalShelter(){
        animals = new ArrayList<>();
    }

    public void enqueue(Animal animal){
        animals.add(animal);
    }

    public Animal dequeue(String pref){
        pref = pref.toLowerCase();
        int incrementor = 0;
        Animal animal;

        switch (pref){
            case "dog":
                do{
                    animal = animals.get(incrementor);
                    System.out.println(animal.getClass().getTypeName());
                }while(animal.getClass().getTypeName() != "fifoAnimalShelter.Dog");
                return animal;
            case "cat":
                do{
                    animal = animals.get(incrementor);
                }while(animal.getClass().getTypeName() != "fifoAnimalShelter.Cat");
                return animal;
            default:
                return null;
        }

    }

}
