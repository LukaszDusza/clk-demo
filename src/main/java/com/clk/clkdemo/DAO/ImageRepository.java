package com.clk.clkdemo.DAO;

import com.clk.clkdemo.model.entitis.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
