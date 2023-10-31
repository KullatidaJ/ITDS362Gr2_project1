//package utils;
//import objects.Trip;
//import org.junit.Test;
//
//
//import static org.junit.Assert.assertEquals;
//
//public class TripAcceptanceTest {
//    //@Autowired
//    private TripAcceptanceTest mTripService;
//
//    @Test
//    void testSearchTripById() {
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
//        mTripService.save(trip);
//
//        // Exercise
//        Trip foundTrip = mTripService.findById(id);
//
//        // Assert
//        assertEquals(trip, foundTrip);
//    }
//
//}
