import entity.Championship;
import entity.Clubs;
import entity.Country;
import entity.TypeToSport;
import org.hibernate.Session;
import util.HibernateUtil;

public class Application {

    public static void main(String[] args) {

        TypeToSport football = save(TypeToSport.builder()
                .id(1L)
                .name("Football")
                .build());

        Country country = save(Country.builder()
                .id(1L)
                .name("Spain")
                .build());

        Clubs club = save(Clubs.builder()
                .id(1L)
                .name("Real Madrid")
                .logo("https://www.realmadrid.com/")
                .site("https://www.realmadrid.com/")
                .country(country)
                .build());

        Championship championship = save(Championship.builder()
                .id(1L)
                .name("La Liga")
                .country(country)
                .typeToSport(football)
                .build());


    }

    public static <T> T save(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }
}
