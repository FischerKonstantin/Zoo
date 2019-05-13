import models.Caretaker;
import org.junit.Test;
import services.ZooService;

public class ZooTest
{
    @Test
    public void checkZoo() {
        ZooService zooService = new ZooService();
        Caretaker caretaker = new Caretaker("Иван", "Иванов");
        zooService.saveCare(caretaker);
    }
}
