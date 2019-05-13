import models.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.ZooService;

import java.util.List;

public class main
{
    public static final Logger logger = LoggerFactory.getLogger(main.class);
    public static void main(String[] args) {

        ZooService zooService = new ZooService();
//        List<Animal> ani = zooService.findAll();
//        for (int i = 0; i<=3; i++){
//            System.out.println(ani.get(i));
//        }
        Animal anim = zooService.findAnim(1);
        logger.info("TEST {}", anim);
//        System.out.println(zooService.findCell(1));
//
//        System.out.println(zooService.findCare(1));
    }
}
