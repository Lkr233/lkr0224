package io.lkr.jacrtadministrationback.controller;


import io.lkr.jacrtadministrationback.constant.ClientExceptionConstant;
import io.lkr.jacrtadministrationback.exception.ClientException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/image")
public class ImageController {

    private List<String> imageExts= Arrays.asList("jpg","jpeg","png");

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image) throws Exception {
        String originalFilename = image.getOriginalFilename();
        String[] splits = originalFilename.split("\\.");
        String ext = splits[splits.length - 1];
        ext = ext.toLowerCase();
        //todo judge with content type
        boolean contains = imageExts.contains(ext);
        if (!contains){
            throw new ClientException(ClientExceptionConstant.IMAGE_INVALID_ERRCODE, ClientExceptionConstant.IMAGE_INVALID_ERRMSG);
        }
        String uuid = UUID.randomUUID().toString();
        String filename = String.format("%s.%s", uuid, ext);
        String filepath = String.format("www/image/%s", filename);
        try(FileOutputStream out = new FileOutputStream(filepath)){
            byte[] data = image.getBytes();
            out.write(data);
        }
        return filename;
    }

}
