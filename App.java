import java.time.LocalDate;
import compte.CompteEpargne;
import repository.*;;
public class App{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        // CompteCourant c = new CompteCourant(null, date, null, null);
        CompteEpargne c = new CompteEpargne("pass", date, 20.0, 20.0);
        Database db = new Database();
        String rst = db.connectMysql();

        System.out.println(rst);
    }
}