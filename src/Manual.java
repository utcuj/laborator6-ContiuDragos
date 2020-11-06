public class Manual extends Rechizita {

    public Manual(String nume)
    {
        super(nume);
        ///this.nume=nume;
    }
    @Override
    public String getNume() {
        return "Manual "+eticheta;
    }
}
