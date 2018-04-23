package com.clk.clkdemo.Service.Implement;

import com.clk.clkdemo.DAO.MinutiaRepository;
import com.clk.clkdemo.Service.MinutiaService;
import com.clk.clkdemo.model.entitis.Minutia;
import org.springframework.beans.factory.annotation.Autowired;

public class MinutiaServiceImplement implements MinutiaService {

    @Autowired
    MinutiaRepository minutiaRepository

    @Override
    public void saveMinutia(Minutia minutia) {
        minutiaRepository.save(minutia);


    }
}
