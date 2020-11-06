public class Caiet extends Rechizita {

    public Caiet(String nume)
    {
        super( nume);
        ///this.eticheta=nume;
    }
    public String getNume()
    {
        return "Caiet "+eticheta;
    }
    public Caiet()
    {
        this("necunoscut");
    }
}
