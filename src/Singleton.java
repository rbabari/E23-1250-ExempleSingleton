public class Singleton {
    private static Singleton instance;
    private Singleton()
    {
        System.out.println("Initialisation de l'instance");

    }
    public static Singleton getInstance() {
    if(instance == null)
    {
        instance = new Singleton();
    }
    return instance;
    }
}
