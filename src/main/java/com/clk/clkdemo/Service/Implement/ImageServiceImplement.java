package com.clk.clkdemo.Service.Implement;

import com.clk.clkdemo.DAO.ImageRepository;
import com.clk.clkdemo.DAO.MinutiaRepository;
import com.clk.clkdemo.Service.ImageService;
import com.clk.clkdemo.model.entitis.Image;
import com.clk.clkdemo.model.entitis.Minutia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("imageService")
public class ImageServiceImplement implements ImageService {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    MinutiaRepository minutiaRepository;

    @Override
    public List<Image> findAll() {
        List<Image> imageList = null;
        imageList = imageRepository.findAll();
        return imageList;
    }

    @Override
    public void saveImage(Image image) {
        imageRepository.save(image);

        Minutia minutia = new Minutia();
        minutia.setId(image.getId());

        minutiaRepository.save(minutia);
    }



}
