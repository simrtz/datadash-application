package ch.datadash.datadash_application.service;

import ch.datadash.datadash_application.model.Gender;
import ch.datadash.datadash_application.model.Sale;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MockDataService {
    LocalDateTime fixedDateTime = LocalDateTime.of(2024, 12, 2, 0, 0, 0);

    public List<Sale> getMockSales() {
        return List.of(new Sale(29.95, Gender.MALE, "red", "Tshirt", fixedDateTime.minusDays(1)),
                new Sale(49.95, Gender.FEMALE, "blue", "Jeans", fixedDateTime.minusHours(5)),
                new Sale(39.95, Gender.MALE, "green", "Pants", fixedDateTime.minusDays(3)),
                new Sale(79.95, Gender.UNISEX, "black", "Jacket", fixedDateTime.minusWeeks(1)),
                new Sale(19.95, Gender.MALE, "yellow", "Shorts", fixedDateTime.minusMonths(1)),
                new Sale(59.95, Gender.UNISEX, "purple", "Hoodie", fixedDateTime.minusDays(2)),
                new Sale(44.95, Gender.MALE, "white", "Sweater", fixedDateTime.minusDays(6)),
                new Sale(24.95, Gender.FEMALE, "orange", "Skirt", fixedDateTime.minusHours(12)),
                new Sale(34.95, Gender.MALE, "gray", "Tshirt", fixedDateTime.minusDays(4)),
                new Sale(69.95, Gender.MALE, "pink", "Blazer", fixedDateTime.minusWeeks(2)),
                new Sale(49.95, Gender.FEMALE, "navy", "Pants", fixedDateTime.minusDays(10)),
                new Sale(89.95, Gender.MALE, "beige", "Coat", fixedDateTime.minusMonths(2)),
                new Sale(39.95, Gender.FEMALE, "maroon", "Dress", fixedDateTime.minusWeeks(3)),
                new Sale(29.95, Gender.MALE, "olive", "Tshirt", fixedDateTime.minusDays(8)),
                new Sale(54.95, Gender.UNISEX, "brown", "Jeans", fixedDateTime.minusHours(18)),
                new Sale(74.95, Gender.UNISEX, "teal", "Jacket", fixedDateTime.minusWeeks(1)),
                new Sale(19.95, Gender.FEMALE, "red", "Shorts", fixedDateTime.minusMonths(1)),
                new Sale(69.95, Gender.MALE, "blue", "Blazer", fixedDateTime.minusDays(15)),
                new Sale(59.95, Gender.MALE, "purple", "Hoodie", fixedDateTime.minusDays(2)),
                new Sale(44.95, Gender.UNISEX, "black", "Sweater", fixedDateTime.minusDays(3)),
                new Sale(39.95, Gender.MALE, "green", "Pants", fixedDateTime.minusHours(9)),
                new Sale(24.95, Gender.UNISEX, "yellow", "Tshirt", fixedDateTime.minusWeeks(1)),
                new Sale(34.95, Gender.FEMALE, "orange", "Skirt", fixedDateTime.minusDays(11)),
                new Sale(99.95, Gender.MALE, "gray", "Coat", fixedDateTime.minusMonths(3)),
                new Sale(29.95, Gender.FEMALE, "pink", "Shorts", fixedDateTime.minusWeeks(2)),
                new Sale(79.95, Gender.MALE, "navy", "Jacket", fixedDateTime.minusDays(4)),
                new Sale(69.95, Gender.MALE, "beige", "Blazer", fixedDateTime.minusHours(20)),
                new Sale(39.95, Gender.FEMALE, "maroon", "Dress", fixedDateTime.minusWeeks(4)),
                new Sale(29.95, Gender.MALE, "olive", "Tshirt", fixedDateTime.minusDays(16)),
                new Sale(54.95, Gender.MALE, "brown", "Jeans", fixedDateTime.minusDays(6)),
                new Sale(74.95, Gender.FEMALE, "teal", "Sweater", fixedDateTime.minusMonths(2)),
                new Sale(19.95, Gender.MALE, "red", "Shorts", fixedDateTime.minusDays(5)),
                new Sale(49.95, Gender.MALE, "blue", "Pants", fixedDateTime.minusHours(15)),
                new Sale(59.95, Gender.MALE, "purple", "Blazer", fixedDateTime.minusDays(12)),
                new Sale(44.95, Gender.UNISEX, "white", "Hoodie", fixedDateTime.minusWeeks(1)),
                new Sale(39.95, Gender.MALE, "green", "Jacket", fixedDateTime.minusDays(18)),
                new Sale(24.95, Gender.FEMALE, "yellow", "Skirt", fixedDateTime.minusWeeks(3)),
                new Sale(34.95, Gender.FEMALE, "orange", "Dress", fixedDateTime.minusDays(20)),
                new Sale(99.95, Gender.MALE, "gray", "Coat", fixedDateTime.minusMonths(4)),
                new Sale(29.95, Gender.UNISEX, "pink", "Tshirt", fixedDateTime.minusDays(7)),
                new Sale(79.95, Gender.UNISEX, "navy", "Sweater", fixedDateTime.minusHours(13)),
                new Sale(69.95, Gender.MALE, "beige", "Blazer", fixedDateTime.minusWeeks(2)),
                new Sale(39.95, Gender.FEMALE, "maroon", "Dress", fixedDateTime.minusDays(22)),
                new Sale(29.95, Gender.MALE, "olive", "Pants", fixedDateTime.minusMonths(1)),
                new Sale(54.95, Gender.FEMALE, "brown", "Jeans", fixedDateTime.minusDays(9)),
                new Sale(74.95, Gender.UNISEX, "teal", "Hoodie", fixedDateTime.minusWeeks(5)),
                new Sale(19.95, Gender.MALE, "red", "Shorts", fixedDateTime.minusDays(19)),
                new Sale(49.95, Gender.UNISEX, "blue", "Tshirt", fixedDateTime.minusHours(10)),
                new Sale(59.95, Gender.FEMALE, "purple", "Skirt", fixedDateTime.minusWeeks(3))
        );
    }
}
