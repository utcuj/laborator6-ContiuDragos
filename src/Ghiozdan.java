import javax.imageio.stream.FileCacheImageOutputStream;
import java.util.Calendar;

public class Ghiozdan {
    private Rechizita[] rechizite = new Rechizita[10];
    private int contor=0;

    public void addRechizita(Rechizita a)
    {
        rechizite[contor++]=a;
    }
    public void afisare()
    {
        for(Rechizita r : rechizite)
        {
            if(r!=null)
                System.out.println(r.getNume());
        }
    }
    public void afisareManual()
    {
        for(Rechizita r:rechizite)
            if(r!=null && r instanceof Manual)
                System.out.println(r.getNume());
    }
    public void afisareCaiete()
    {
        for(Rechizita r:rechizite)
            if(r!=null && r instanceof Caiet)
                System.out.println(r.getNume());
    }
    public int getNrRechizite()
    {
        return contor;
    }
    public int getNrManuale()
    {
        int nrManuale=0;
        for(Rechizita r:rechizite)
            if(r!=null && r instanceof Manual)
                nrManuale++;
        return nrManuale;
    }
    public int getNrCaiete()
    {
        int nrCaiete=0;
        for(Rechizita r:rechizite)
            if(r!=null && r instanceof Caiet)
                nrCaiete++;
        return nrCaiete;
    }
}
