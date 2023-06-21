public class Satellite extends Astre implements IOrbitable{
    private String nom;
    public Satellite(String nom)
    {
        this.nom = nom;
    }

    @Override
    public void Orbiter(Astre a) {

    }


    @Override
    public String toString() {
        return "Satellite{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
