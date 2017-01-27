package by.mlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import by.mlvl.model.Division;
import by.mlvl.service.DivisionService;

/**
 * Created by avzabr on 06.01.2017
 */
@RestController
public class DivisionController {

    private final DivisionService divisionService;

    @Autowired
    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @RequestMapping("/divisions")
    public List<Division> getDivisions() {
        return divisionService.getAllDivisions();
    }

    public Division getDivision(String id) {
        UUID uuid = UUID.fromString(id);
        return divisionService.getDivision(uuid);
    }
}
