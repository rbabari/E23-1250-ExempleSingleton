import java.util.ArrayList;

public abstract class Planet extends Astre  implements IOrbitable {
    private String nom;
    private ArrayList<Satellite> listeDeSat = new ArrayList<Satellite>();

    public Planet(String nom)
    {
        super();
        this.nom = nom;
    }
    public ArrayList<Satellite> getlisteDeSat()
    {
        return listeDeSat;
    }


}
