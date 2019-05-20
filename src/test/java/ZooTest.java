import edu.fischer.Zoo.models.Animal;
import edu.fischer.Zoo.models.Caretaker;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import edu.fischer.Zoo.services.ZooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZooTest
{

    private static final Logger logger = LoggerFactory.getLogger(ZooTest.class);
    @Test
    public void checkZoo() {
        ZooService zooService = new ZooService();
        BasicConfigurator.configure();
        //Внести нового служителя в базу данных
        Caretaker caretaker = new Caretaker("Ирина", "Хрусталева");
        logger.info("{}", caretaker);
        zooService.saveCare(caretaker);
        //TODO Доделать
        Animal animal = new Animal("Гена", "Крокодил", 7);

        caretaker.addAnimals(animal);
        zooService.updateCare(caretaker);
//        zooService.deleteCare(caretaker); //Удалить внесенного служителя
    }

    @Test
    public void updZoo() {
        ZooService zooService = new ZooService();
        Caretaker caretaker = new Caretaker();
        Animal animal = new Animal("Гена", "Крокодил", 7);
        caretaker.addAnimals(animal);
        zooService.updateCare(caretaker);
    }

    @Test
    public void deleteZoo() {
        ZooService zooService = new ZooService();
        //Удалить служителя из БД по id
        zooService.delCareById(8);
    }

}
