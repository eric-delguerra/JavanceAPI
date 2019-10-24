package com.progwitheric.restservice.MicroProgram;

import com.progwitheric.restservice.MicroProgram.DAO.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {

    @Autowired
    private CarDao carDao;

    @RequestMapping(value = "/voitures", method = RequestMethod.GET)
    public Iterable<Cars> listVoitures() {
        return carDao.findAll();
    }

    @GetMapping(value = "/voitures/{id}")
    public Cars afficherUneVoiture(@PathVariable int id) {
        return carDao.findById(id);
    }

    @PostMapping(value = "/voitures")
    public void addCars(@RequestBody Cars car){
        carDao.save(car);
    }

    @DeleteMapping(value = "/voitures/{id}")
    public void deleteCar(@PathVariable int id){
        Cars car = carDao.findById(id);
        carDao.delete(car);
    }

    @PutMapping(value = "/voitures")
    public void updateCar(@RequestBody Cars upCar){
        carDao.save(upCar);
    }
}
