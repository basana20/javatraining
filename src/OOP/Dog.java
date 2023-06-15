package OOP;

class Dog extends Animal {
    public String bread_name;
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says woof!");
    }

    public void Breed(String name){
        bread_name = name;
    }
}