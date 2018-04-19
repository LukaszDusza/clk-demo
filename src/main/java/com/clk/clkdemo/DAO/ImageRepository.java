package com.clk.clkdemo.DAO;

import com.clk.clkdemo.model.entitis.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("imageRepository")
public interface ImageRepository extends JpaRepository<Image, Long> {
}
