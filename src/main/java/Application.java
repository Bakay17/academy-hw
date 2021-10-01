import entity.Course;
import entity.Group;
import entity.Mentor;
import entity.Student;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Course java = Course.builder().id(1L).name("Java").build();
        Course python = Course.builder().id(2L).name("Python").build();

        save(java);
        save(python);

        List<Group> groupsJava = Arrays.asList(
                new Group(1L, "JV-1", java),
                new Group(2L, "JV-2", java)
        );

        for (Group group : groupsJava) {
            save(group);
        }

        List<Group> groupsPython = Arrays.asList(
                new Group(1L, "PT-1", python),
                new Group(2L, "PT-2", python)
        );

        for (Group group : groupsPython) {
            save(group);
        }

        Mentor shamil = new Mentor(1L, "Shamil", groupsJava.get(new Random().nextInt(groupsJava.size())));
        Mentor aidin = new Mentor(2L, "Aidin", groupsJava.get(new Random().nextInt(groupsPython.size())));

        save(shamil);
        save(aidin);

        List<Student> studentsJava = Arrays.asList(
                new Student(1L, "Mirlan", java, groupsJava.get(new Random().nextInt(groupsJava.size())), aidin),
                new Student(2L, "Chyngyz", java, groupsJava.get(new Random().nextInt(groupsJava.size())), shamil),
                new Student(3L, "Sasha", java, groupsJava.get(new Random().nextInt(groupsJava.size())), aidin),
                new Student(4L, "Bermet", java, groupsJava.get(new Random().nextInt(groupsJava.size())), shamil),
                new Student(5L, "Bakai", java, groupsJava.get(new Random().nextInt(groupsJava.size())), aidin),
                new Student(6L, "Azat", java, groupsJava.get(new Random().nextInt(groupsJava.size())), shamil)
        );

        for (Student student : studentsJava) {
            save(student);
        }
    }

    // Айдин можешь внимательно посмотреть save
    // в БД почему то не сохраняется

    public static <T> T save(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        System.out.println("Сохранены данные: " + t);
        return t;
    }
}
