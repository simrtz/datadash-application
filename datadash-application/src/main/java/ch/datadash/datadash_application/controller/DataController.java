package ch.datadash.datadash_application.controller;

import ch.datadash.datadash_application.service.DataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/sales")
    public String getSales() throws JsonProcessingException {

        return dataService.findAllSales();
    }
}
