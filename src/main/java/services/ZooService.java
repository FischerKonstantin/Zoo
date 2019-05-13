package services;

import dao.ZooDaoImp;
import models.Animal;
import models.Caretaker;
import models.Cell;

import java.util.List;


public class ZooService
{
    private  ZooDaoImp zooDao = new ZooDaoImp();

    public ZooService() {
    }
public void saveCare (Caretaker caretaker) {
        zooDao.save(caretaker);
}
    public Caretaker findById(int id) {
        return zooDao.findById(id);
    }

    public Animal findAnim (int id) {
        return zooDao.findAnimById(id);
    }

    public Cell findCell (int number) {
        return zooDao.findCellById(number);
    }

    public Caretaker findCare (int id) {
        return zooDao.findCareById(id);
    }

    public List<Animal> findAll() {
        return zooDao.findAllAnim();
    }
}
