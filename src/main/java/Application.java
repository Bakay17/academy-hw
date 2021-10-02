import entity.Championship;
import entity.Clubs;
import entity.Country;
import entity.TypeToSport;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        TypeToSport football = save(TypeToSport.builder().id(1L).name("Football").build());
        TypeToSport boxing = save(TypeToSport.builder().id(2L).name("Boxing").build());

        Country spain = save(Country.builder().id(1L).name("Spain").build());
        Country england = save(Country.builder().id(1L).name("England").build());
        Country germany = save(Country.builder().id(1L).name("Germany").build());
        Country italy = save(Country.builder().id(1L).name("Italy").build());
        Country france = save(Country.builder().id(1L).name("France").build());

        Clubs spainClub = save(Clubs.builder().id(1L).name("Real Madrid").logo("https://www.realmadrid.com/").site("https://www.realmadrid.com/").typeToSport(football).country(spain).build());
        Clubs englandClub = save(Clubs.builder().id(1L).name("Manchester City").logo("https://www.mancity.com/").site("https://www.mancity.com/").typeToSport(football).country(england).build());
        Clubs germanyClub = save(Clubs.builder().id(1L).name("Borussia Dortmund").logo("https://www.bd.com/").site("https://www.bd.com/").typeToSport(football).country(germany).build());
        Clubs italyClub = save(Clubs.builder().id(1L).name("Atalanta").logo("https://www.atalanta.com/").site("https://www.atalanta.com/").typeToSport(football).country(italy).build());
        Clubs franceClub = save(Clubs.builder().id(1L).name("PSG").logo("https://www.psj.com/").site("https://www.psj.com/").country(france).typeToSport(football).build());

        Championship laLiga = save(Championship.builder().id(1L).name("La Liga").country(spain).typeToSport(football).clubs(spainClub).build());
        Championship ligaOne = save(Championship.builder().id(2L).name("Liga 1").country(france).typeToSport(football).clubs(franceClub).build());
        Championship epl = save(Championship.builder().id(3L).name("EPL").country(england).typeToSport(football).clubs(englandClub).build());
        Championship bundesLiga = save(Championship.builder().id(4L).name("Bundes Liga").country(germany).typeToSport(football).clubs(germanyClub).build());
        Championship seriaA = save(Championship.builder().id(5L).name("Seria A").country(italy).typeToSport(football).clubs(italyClub).build());

        Clubs boxTeam = save(Clubs.builder().id(1L).name("BoxTeam").logo("https://www.boxing.com/").site("https://www.boxing.com/").country(italy).typeToSport(boxing).build());
        Championship boxChampionship = save(Championship.builder().id(1L).name("Boxing Liga").country(italy).typeToSport(boxing).clubs(boxTeam).build());

        System.out.println("-----------------------------------------");
        System.out.println(championshipName(epl.getName()));

        System.out.println("========= Все команды выступающие в чемпионате Италии =============");
        System.out.println(allTeamsChampItaly());

        System.out.println("====== Только ИМЯ и АДРЕС_САЙТА  Команды, отсортировать по ID и ограничить выборку до 5 =========");
        System.out.println(getTeamNameAndSite(germanyClub.getName(), germanyClub.getSite()));
    }

    public static <T> T save(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }

    // Выгрузить Чемпионаты по названию, использовать getUiqueResult
    public static Championship championshipName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Championship championship = (Championship) session.createQuery("From Championship where name = :nameChamp")
                .setParameter("nameChamp", name).uniqueResult();
        session.close();
        return championship;
    }

    //Выгрузить все команды выступающие в чемпионате Италии. Отсортировать по виду спорта
    public static List<Clubs> allTeamsChampItaly() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Clubs> clubs = session.createQuery("select c from Clubs c where c.country.name = 'Italy' order by typeToSport",
                Clubs.class).getResultList();
        session.close();
        return clubs;
    }

    //Только ИМЯ и АДРЕС_САЙТА  Команды, отсортировать по ID и ограничить выборку до 5
    public static List<Object[]> getTeamNameAndSite(String name, String site) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Object[]> clubs = session.createQuery("select c.name, c.site from Clubs c order by c.id",
                Object[].class).setMaxResults(5).list();
        session.close();
        return clubs;
    }
}
