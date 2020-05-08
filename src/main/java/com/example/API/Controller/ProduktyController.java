package com.example.API.Controller;

import com.example.API.Produkty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/produkty")
@RestController
public class ProduktyController {

    private  static List<Produkty> produktyList = new ArrayList<>();

    static {
        produktyList.add(new Produkty(1, "Papryka", 100, 100, 100, 100, 100));
        produktyList.add(new Produkty(2, "Por", 100, 100, 100, 100, 100));
    }

    @GetMapping()
    public Produkty produktID(@RequestParam int ID) {
        Optional<Produkty> first = produktyList.stream().filter(element -> element.getID() == ID).findFirst();
        return first.get();
    }
}
