package utils;
import objects.Trip;
import org.junit.Test;


import org.junit.jupiter.api.Assertions;

public class TripTest {

    @Test
    void testCreateTripWithValidData() {
        // Setup
        String id = "1234567890";
        String name = "Bangkok";
        String image = "https://example.com/trip.png";
        String start = "2023-10-30";
        String end = "2023-11-06";
        String tname = "My Trip";
        boolean isPublic = true;

        // Exercise
        Trip trip = new Trip(id, name, image, start, end, tname, isPublic);

        // Assert
        Assertions.assertEquals(id, trip.getId());
        Assertions.assertEquals(name, trip.getName());
        Assertions.assertEquals(image, trip.getImage());
        Assertions.assertEquals(start, trip.getStart());
        Assertions.assertEquals(end, trip.getEnd());
        Assertions.assertEquals(tname, trip.getTname());
        Assertions.assertEquals(isPublic, trip.isPublic());
    }

}
