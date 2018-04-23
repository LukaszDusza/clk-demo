package com.clk.clkdemo.Controller;

import com.clk.clkdemo.Service.ImageService;
import com.clk.clkdemo.model.entitis.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ImageController {

    @Autowired
    ImageService imageService;

    @RequestMapping("/image")
    public String pokazOdbitke(Model model) {

        List<Image> imageList = null;
        imageList = imageService.findAll();
        model.addAttribute("imageList", imageList);
        return "image";
    }

    @RequestMapping("/addImage")
    public String dodajOdbitke (Model model){
        Image image = new Image();
        java.sql.Date time  = new java.sql.Date(new java.util.Date().getTime());
        image.setCreation_date(time);
        model.addAttribute("image", image);
        return "addImage";
    }
}
