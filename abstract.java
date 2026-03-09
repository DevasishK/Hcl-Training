public abstract class AbstractClass {
    
    private String name;
    
    public AbstractClass(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class ConcreteClass extends AbstractClass {
    public ConcreteClass(String name) {
        super(name);
    }
    
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass("John");
        obj.displayInfo();
    }
}