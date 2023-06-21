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



    }
}