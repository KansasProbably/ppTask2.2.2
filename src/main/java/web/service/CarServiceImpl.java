package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class CarServiceImpl implements CarService {
    static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Tesla",123890,"B110A33"));
        carList.add(new Car("Audi",12368,"A510B33"));
        carList.add(new Car("BMW",535678,"C710X33"));
        carList.add(new Car("Honda",43278,"X410E33"));
        carList.add(new Car("LADA",4572,"E210C33"));
    }
    
    @Override
    public List<Car> getCarList(int count){
        return IntStream.range(0, carList.size())
                .filter(n -> n < count)
                .mapToObj(carList::get)
                .toList();

    }

}
