package com.clk.clkdemo.DAO;

import com.clk.clkdemo.model.entitis.Minutia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("minutiaRepository")
public interface MinutiaRepository extends JpaRepository<Minutia, Long> {
}
