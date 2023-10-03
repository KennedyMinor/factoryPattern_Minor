package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            switch(choice){
                case 1: 
                    PetRecord dogPetFile = new PetRecord();
                    Pet dog = new Dog();
                    dogPetFile.setPetId("D01");
                    dogPetFile.setPetName("Bantay");
                    dogPetFile.setPet(dog);
                    ((Dog) dog).setBreed("German Shepherd");

                    System.out.println("Pet id is " + dogPetFile.getPetId());
                    System.out.println("Pet name is " + dogPetFile.getPetName());
                    System.out.println("Pet kind: " + dogPetFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: "+ dogPetFile.getPet().makeSound());
                    System.out.println("Play mode: " + dogPetFile.getPet().play());
                    break;

                case 2: 
                    PetRecord catPetFile = new PetRecord();
                    Pet cat = new Cat();
                    catPetFile.setPetId("C01");
                    catPetFile.setPetName("Muning");
                    catPetFile.setPet(cat);
                    ((Cat) cat).setNoOfLives(9);

                    System.out.println("Pet id is " + catPetFile.getPetId());
                    System.out.println("Pet name is " + catPetFile.getPetName());
                    System.out.println("Pet kind: " + catPetFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: "+ catPetFile.getPet().makeSound());
                    System.out.println("Play mode: " + catPetFile.getPet().play());
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
