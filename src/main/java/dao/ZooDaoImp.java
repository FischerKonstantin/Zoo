package dao;

import models.Animal;
import models.Caretaker;
import models.Cell;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class ZooDaoImp implements ZooDao
{
    @Override
    public Caretaker findById (int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Caretaker.class, id);
    }
    @Override
    public void save (Caretaker caretaker){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(caretaker);
        tx1.commit();
        session.close();
    }@Override
    public void update (Caretaker caretaker) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(caretaker);
        tx1.commit();
        session.close();
    }
    @Override
    public void delete (Caretaker caretaker){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(caretaker);
        tx1.commit();
        session.close();
    }

    @Override
    public Animal findAnimById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Animal.class, id);

    }

    @Override
    public Cell findCellById(int number) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Cell.class, number);
    }

    @Override
    public Caretaker findCareById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Caretaker.class, id);
    }

    @Override
    public List<Animal> findAllAnim() {
        List<Animal> animals = (List<Animal>) HibernateSessionFactoryUtil.getSessionFactory().openSession().
                createQuery("From Animal").list();
        return animals;

    }

}
