package org.example;

import org.example.entity.Employee;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1L,"Shamil", 24),
                new Employee(2L, "Aidin", 22),
                new Employee(3L, "Bakai", 19));

        for (Employee employee : employees) {
            save(employee);
        }

        allList().stream().
                filter(x -> x.getName().toLowerCase(Locale.ROOT).contains("a")).
                forEach(System.out::println);

        delete(employees.get(new Random().nextInt(2) + 1).getId());

        update(Employee.builder().id(2L).name("Nursultan").age(28).build());

    }

    public static Long save(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("Сохранены данные: " + employee);
        return employee.getId();
    }

    public static List<Employee> allList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
        session.close();
        System.out.println("Count: " + employees.size());
        return employees;
    }

    public static void update(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee em = session.load(Employee.class, employee.getId());
        em.setName(employee.getName());
        em.setAge(employee.getAge());
        session.getTransaction().commit();
        session.close();
        System.out.println("Update: " + em);
    }

    public static Employee findById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee em = session.load(Employee.class, id);
        session.close();
        return em;
    }

    public static void delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee em = findById(id);
        session.delete(em);
        session.getTransaction().commit();
        session.close();
        System.out.println("Удаление: " + em);
    }

    public static void deleteAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete from Employee");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Все удвлено");
    }
}
