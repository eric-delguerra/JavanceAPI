package com.progwitheric.restservice.MicroProgram.DAO;

import com.progwitheric.restservice.MicroProgram.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends JpaRepository<Cars, Integer> {
    public Cars findById(int id);
}
