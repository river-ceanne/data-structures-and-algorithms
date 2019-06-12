package fifoAnimalShelter;

import java.util.ArrayList;

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
                    animal = animals.get(incrementor++);
                }while(animal.getClass() != Dog.class);
                animals.remove(animal);
                return animal;
            case "cat":
                do{
                    animal = animals.get(incrementor++);
                }while(animal.getClass() != Cat.class);
                animals.remove(animal);
                return animal;
            default:
                return null;
        }

    }

}
