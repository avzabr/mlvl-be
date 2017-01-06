package by.mlvl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import by.mlvl.model.Division;

/**
 * Created by avzabr on 06.01.2017
 */
@RestController
public class DivisionController {

    @RequestMapping("/divisions")
    public List<Division> getDivisions() {
        return Arrays.asList(new Division(UUID.randomUUID(), "First"),
                new Division(UUID.randomUUID(), "Second"));
    }
}
