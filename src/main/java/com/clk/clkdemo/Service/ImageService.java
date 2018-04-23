package com.clk.clkdemo.Service;

import com.clk.clkdemo.model.entitis.Image;

import java.util.List;

public interface ImageService {

    public List<Image> findAll();

    public void saveImage (Image image);
}
