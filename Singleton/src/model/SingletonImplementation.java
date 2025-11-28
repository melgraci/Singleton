package model;

public class SingletonImplementation {
    
 
    private static SingletonImplementation instance;
    
   
    private SingletonImplementation() {
    }
    

    public static SingletonImplementation getInstance() {
        if (instance == null) {
            instance = new SingletonImplementation();
        }
        return instance;
    }
}
