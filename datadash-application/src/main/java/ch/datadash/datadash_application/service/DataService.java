package ch.datadash.datadash_application.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule());

    private final MockDataService mockDataService;

    public DataService(MockDataService mockDataService) {
        this.mockDataService = mockDataService;
    }

    public String findAllSales() throws JsonProcessingException {
        return objectMapper.writeValueAsString(mockDataService.getMockSales());
    }
}

