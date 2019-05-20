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
        Caretaker caretaker = new Caretaker("Иван", "Иванов");
        logger.info("{}", caretaker);
        zooService.saveCare(caretaker);
    }

    @Test
    public void deleteZoo() {
        ZooService zooService = new ZooService();
        BasicConfigurator.configure();
        Caretaker caretaker = new Caretaker("Иван", "Иванов");
        logger.info("{}", caretaker);
        zooService.deleteCare(caretaker);
    }

}
