// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        // s1 et s2 son les mêmes
        if(s1.equals(s2))
        {
            System.out.println("Meme objet");

        }else{
            System.out.println("Pas le même objet");

        }

        // créer une instance de planet
        // Planet p0 = new Planet(); on peut pas créer une planette ...

        //Planet p1 = new Terre();
        Planet terre = Terre.getInstance();
        Planet mars = new Mars();

        // Soleil S1 = new Soleil(); constructeur private dans un singleton

        //Soleil soit un singleton

        Soleil sol1 = Soleil.getInstance();
        sol1.add(terre);
        Soleil sol2 = Soleil.getInstance();
        sol2.add(mars);
        terre.getlisteDeSat().add(new Satellite("Lune"));
        terre.getlisteDeSat().add(new Satellite("StationInternationale"));
        System.out.println("...");


    }
}