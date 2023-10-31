//package utils;
//import objects.Trip;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//public class TripIntegrationTest {
//
//    //@Autowired
//    private TripIntegrationTest mTripRepository;
//
//    @Test
//    void testSaveTripToDatabase() {
//        // Setup
//        String id = "1234567890";
//        String name = "Bangkok";
//        String image = "https://example.com/trip.png";
//        String start = "2023-10-30";
//        String end = "2023-11-06";
//        String tname = "My Trip";
//        boolean isPublic = true;
//
//        Trip trip = new Trip(id, name, image, start, end, tname, isPublic);
//
//        // Exercise
//        mTripRepository.save(trip);
//
//        // Assert
//        List<Trip> trips = mTripRepository.findAll();
//        assertEquals(1, trips.size());
//        assertEquals(trip, trips.get(0));
//    }
//
//}
