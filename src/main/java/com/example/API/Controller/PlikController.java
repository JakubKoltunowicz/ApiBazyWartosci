package com.example.API.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
@RequestMapping("/api/file")
public class PlikController {

    private static String SCIEZKA_ZAPISU = "C:\\Users\\kubal\\Desktop\\ApiBazyWartosci-master\\ZdjecieProduktu";

    @PostMapping("")
    public String pobierz(@RequestParam("file") MultipartFile plik) {
        try {
            String nazwaPliku = plik.getOriginalFilename();
            String sciezka = SCIEZKA_ZAPISU + File.separator + nazwaPliku;
            zapiszPlik(plik.getInputStream(), sciezka);
            return "1";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private void zapiszPlik(InputStream inputStream, String sciezka) {
        try {
            OutputStream outputStream = new FileOutputStream(new File(sciezka));
            int read = 0;
            byte[] bytes = new byte[1024];
            while((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0 , read);
            }
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
