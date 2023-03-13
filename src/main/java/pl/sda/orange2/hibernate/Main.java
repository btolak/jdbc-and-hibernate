package pl.sda.orange2.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.sda.orange2.hibernate.entity.Peoples;


public class Main {
    public static void main(String[] args) {
//            Peoples people =new Peoples(1,"Jan","Polak");
//            Peoples people1 =new Peoples(2,"John","Rambo");
            Transaction transaction=null;
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        try(Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Peoples people =new Peoples(1,"Jan","Polak");
             Peoples people1 =new Peoples(2,"John","Rambo");
            session.persist(people);
            session.persist(people1);
        transaction.commit();
        }catch (Exception e){
            if(transaction !=null) {
                transaction.rollback();

        }e.printStackTrace();
    }
}}
