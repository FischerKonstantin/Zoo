package dao;


import models.Animal;
import models.Caretaker;
import models.Cell;

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

    public List<Animal> findAllAnim();
}
