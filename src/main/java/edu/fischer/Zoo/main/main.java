package edu.fischer.Zoo.main;

import edu.fischer.Zoo.models.Animal;
import edu.fischer.Zoo.models.Caretaker;
import edu.fischer.Zoo.models.Cell;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import edu.fischer.Zoo.services.ZooService;

import java.util.List;


public class main
{
    public static final Logger logger = LoggerFactory.getLogger(main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        ZooService zooService = new ZooService();

        //Показать всех животных
        List<Animal> ani = zooService.findAll();
        for (Animal i:ani){
            logger.info("{}", i);
        }

        //Показать животного под номером 1
        Animal anim = zooService.findAnim(1);
        logger.info("{}", anim);

        //Показать животных в клетке №1
        Cell cell = zooService.findCell(1);
        logger.info("{}", cell);

        //Показать служителя под номером 1 и какие животные к нему относятся
        Caretaker care = zooService.findCare(1);
        logger.info("{}", care);
    }
}
