public class TestGhiozdan {
    public static void main(String[] args)
    {
        Caiet c1=new Caiet("matematica");
        Manual m1= new Manual("romana");
        Caiet c2=new Caiet("geografie");
        Manual m2=new Manual("istorie");
        Caiet necunoscut=new Caiet();

        Ghiozdan g1 = new Ghiozdan();
        g1.addRechizita(c1);
        g1.addRechizita(m1);
        g1.addRechizita(c2);
        g1.addRechizita(m2);
        g1.addRechizita(necunoscut);
        System.out.println("Numarul de rechizite:"+g1.getNrRechizite());
        System.out.println("\nRechizitele sunt:");
        g1.afisare();

        System.out.println("\nNumarul de manuale:"+g1.getNrManuale());
        g1.afisareManual();

        System.out.println("\nNumarul de caiete:"+g1.getNrCaiete());
        g1.afisareCaiete();

    }
}
