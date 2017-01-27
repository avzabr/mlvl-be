package by.mlvl.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import by.mlvl.model.Division;

/**
 * Created by avzabr on 27.01.2017
 */
@Service
public class DivisionService {

    private List<Division> topics = Arrays.asList(new Division(UUID.randomUUID(), "First"),
            new Division(UUID.randomUUID(), "Second"));

    public List<Division> getAllDivisions() {
        return topics;
    }

    public Division getDivision(final UUID uuid) {
        Optional<Division> optional = topics.stream().filter(topic -> topic.getId().equals(uuid)).findFirst();
        return optional.get();
    }
}
