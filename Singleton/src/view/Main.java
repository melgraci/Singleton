package view;
import model.SingletonImplementation; 

public class Main {
    public static void main(String[] args) {
        SingletonImplementation obj1 = SingletonImplementation.getInstance();
        SingletonImplementation obj2 = SingletonImplementation.getInstance();
        
        System.out.println("São a mesma instância? " + (obj1 == obj2));
    }
}
