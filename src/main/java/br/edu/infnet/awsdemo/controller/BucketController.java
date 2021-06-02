package br.edu.infnet.awsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.edu.infnet.awsdemo.model.AmazonClient;

@RestController
@RequestMapping("/storage/")
public class BucketController {
    
    private AmazonClient amazonClient;

    @Autowired
    BucketController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/listFiles")
    public String listFiles() {
        return this.amazonClient.listFiles();
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return this.amazonClient.uploadFile(file);
    }

    // @DeleteMapping("/deleteFile")
    // public String deleteFile(@RequestPart(value = "url") String fileUrl) {
    //     return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    // }
    
    @RequestMapping(value="/deleteFile", method = RequestMethod.GET)
    public String deleteFile(@RequestParam String url) {
        url = "https://dr4-s3-bucket-f.s3-sa-east-1.amazonaws.com/" + url;
        System.out.println(url);
        this.amazonClient.deleteFileFromS3Bucket(url);
        return "redirect:/home"; 
    }
}