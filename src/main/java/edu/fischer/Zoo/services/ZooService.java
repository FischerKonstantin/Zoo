package edu.fischer.Zoo.services;

import edu.fischer.Zoo.dao.ZooDaoImp;
import edu.fischer.Zoo.models.Animal;
import edu.fischer.Zoo.models.Caretaker;
import edu.fischer.Zoo.models.Cell;

import java.util.List;


public class ZooService
{
    private  ZooDaoImp zooDao = new ZooDaoImp();

    public ZooService() {
    }
    public void saveCare (Caretaker caretaker) {
        zooDao.save(caretaker);
}

    public void deleteCare (Caretaker caretaker) {
        zooDao.delete(caretaker);
}

    public void updateCare (Caretaker caretaker) {
        zooDao.update(caretaker);
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

    public void delCareById (int id) {
        zooDao.delCareById(id);
    }



    public List<Animal> findAll() {
        return zooDao.findAllAnim();
    }
}
