package edu.fischer.Zoo.dao;


import edu.fischer.Zoo.models.Animal;
import edu.fischer.Zoo.models.Caretaker;
import edu.fischer.Zoo.models.Cell;

import java.util.List;

public interface ZooDao
{
    public Caretaker findById (int id);

    public void save (Caretaker caretaker);

    public void update (Caretaker caretaker);

    public void delete (Caretaker caretaker);

    public Animal findAnimById (int id);

    public Cell findCellById (int number);

    public Caretaker findCareById (int id);

    public void delCareById (int id);

    public List<Animal> findAllAnim();
}
