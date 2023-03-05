package JavaAssignment3;

public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();
    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return singletonClass;
    }

    public void simpleMethod(){
        System.out.println("object of singleton class has been created"+singletonClass);
    }

}
