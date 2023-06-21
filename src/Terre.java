public class Terre extends Planet implements IOrbitable{

   private static Planet instanceTerre;

    private Terre() {
        super("terre");

    }
    public static Planet getInstance()
    {
        if(instanceTerre == null)
        {
            instanceTerre = new Terre();
        }
        return instanceTerre;
    }

    @Override
    public void Orbiter(Astre a) {

    }
}
