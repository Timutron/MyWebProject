package com.example.demo.controller;

//import com.example.demo.entity.FileDB;
//import com.example.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileController {
    public static String uploadDirectory = "D://demo/uploads/";

    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }

    @PostMapping("/upload")
    public String fileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
        if (file.isEmpty()){
            redirectAttributes.addFlashAttribute("message", "Выберите фаил для загрузки");
            return "redirect:/uploadStatus";
        }
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(uploadDirectory + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message", "Успешно загружен" + file.getOriginalFilename()+"'");
        }catch (IOException e){
            e.printStackTrace();
        }
        return "redirect:/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus(){
        return "uploadStatus";
    }



//    @Autowired
//    FileService fileService;
//
//    @PostMapping("/homePage")
//    public String addFile(@RequestParam("file")MultipartFile file){
//        FileDB fileDB1 = fileService.saveFile(file);
//        return "homePage";
//    }
}
