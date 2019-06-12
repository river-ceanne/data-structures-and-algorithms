package fifoAnimalShelter;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void testAnimalShelterConstructor() {
        AnimalShelter animalShelter = new AnimalShelter();
        assertEquals(new ArrayList<>(),animalShelter.animals);
    }

    @Test
    public void testAnimalShelterEnqueue() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog dog1 = new Dog("Scooby");
        animalShelter.enqueue(dog1);
        Cat cat2 = new Cat("Garfield");
        animalShelter.enqueue(cat2);
        Cat cat3 = new Cat("HelloKitty");
        animalShelter.enqueue(cat3);
        Dog dog4 = new Dog("Scrappy");
        animalShelter.enqueue(dog4);

        assertEquals(4,animalShelter.animals.size());
        assertTrue(animalShelter.animals.contains(cat2));
        assertEquals(dog4,animalShelter.animals.get(animalShelter.animals.size() -1));
    }

    @Test
    public void testAnimalShelterDequeue() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog dog1 = new Dog("Scooby");
        animalShelter.enqueue(dog1);
        Cat cat2 = new Cat("Garfield");
        animalShelter.enqueue(cat2);
        Cat cat3 = new Cat("HelloKitty");
        animalShelter.enqueue(cat3);
        Dog dog4 = new Dog("Scrappy");
        animalShelter.enqueue(dog4);

        assertEquals(dog1.getName(),animalShelter.dequeue("dog").getName());
    }


}
