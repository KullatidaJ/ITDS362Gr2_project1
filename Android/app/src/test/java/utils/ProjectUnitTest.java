package utils;

//import android.view.MenuItem;
//import android.widget.DatePicker;
//import android.util.Log;
//
////import io.github.project_travel_mate.login;
//import io.github.project_travel_mate.R;
//import io.github.project_travel_mate.notifications.NotificationsActivity;
import objects.UpcomingWeekends;
import objects.Weather;
import objects.ZoneName;
import objects.CityHistoryListItem;
//import org.junit.Before;
import org.junit.Test;

//import java.util.Calendar;
//import java.util.Date;
//import java.util.logging.Handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class ProjectUnitTest {

    @Test
    public void testZoneName() {
        ZoneName zone = new ZoneName("GMT", "Greenwich Mean Time");
        assertEquals("GMT", zone.getShortName());
        assertEquals("Greenwich Mean Time", zone.getAbbreviation());
        assertEquals("ZoneName{shortName='GMT', abbreviation='Greenwich Mean Time'}", zone.toString());
    }

    @Test
    public void testWeather() {
        Weather weather = new Weather(1, 30,  10,  "Sunday",  "2023-01-29");
        assertEquals(10, weather.getMinTemp());
        assertEquals(30, weather.getMaxTemp());
        assertEquals(1, weather.getImageId());
        assertEquals("Sunday", weather.getDayOfWeek());
        assertEquals("2023-01-29", weather.getDate());
    }

    //AM ---------------------------------------------------------------
    @Test
    //ทดสอบการสร้างอ็อบเจกต์ของคลาส CityHistoryListItem
    public void testCityHistoryListItemCreation () {
        CityHistoryListItem item = new CityHistoryListItem("Heading", "Text", true);
        assertNotNull(item);
        assertEquals("Heading", item.getHeading());
        assertEquals("Text", item.getText());
        assertTrue(item.getExpanded());
    }

    @Test
    public void testUpcomingWeekendsObjectCreation () {
        UpcomingWeekends weekend = new UpcomingWeekends("November", 5, "Saturday", "Hiking Trip", "Outdoor");

        assertEquals("November", weekend.getmMonth());
        assertEquals(5, weekend.getmDate());
        assertEquals("Saturday", weekend.getmDay());
        assertEquals("Hiking Trip", weekend.getmName());
        assertEquals("Outdoor", weekend.getmType());
    }

//    //POR ---------------------------------------------------------------
//    @Test
//    public void testHomeIconClicked() {
//        Testicon testicon = new testicon();
//        MenuItem homeItem = new TestMenuItem(android.R.id.home);
//
//        boolean result = testicon.onOptionsItemSelected(homeItem);
//
//        assertTrue(result);
//        assertTrue(testicon.isFinished());
//        Log.d("testonOptionsItemSelected -> ", "Home icon clicked test");
//    }
//
//    @Test
//    public void testActionSortMenuItemClicked() {
//        Testicon testicon = new testicon();
//        MenuItem actionSortItem = new TestMenuItem(R.id.action_sort);
//
//        boolean result = testicon.onOptionsItemSelected(actionSortItem);
//        assertTrue(result);
//        Log.d("testonOptionsItemSelected -> ", "Action Sort menu item clicked test");
//    }
//
//    @Test
//    public void testOtherMenuItemClicked() {
//        Testicon testicon = new testicon();
//        MenuItem otherItem = new TestMenuItem(R.id.other_menu_item);
//
//        boolean result = testicon.onOptionsItemSelected(otherItem);
//        boolean expected = testicon.onOptionsItemSelected(otherItem);
//        assertEquals(expected, result);
//        Log.d("testonOptionsItemSelected -> ", "Other menu item clicked test");
//    }
//
//    //POR---------------------------------------------------
//
//    private ProjectUnitTest mTestOnDate;
//    private DatePicker mDatePicker;
//
//    @Before
//    public void setUp() {
//        mTestOnDate = new ProjectUnitTest();
//        mDatePicker = new DatePicker(mTestOnDate);
//    }
//
//    @Test
//    public void testValidDateSelected() {
//        Calendar currentCalendar = Calendar.getInstance();
//        currentCalendar.set(2023, 10, 27);
//        Date currentDate = currentCalendar.getTime();
//
//        Calendar selectedCalendar = Calendar.getInstance();
//        selectedCalendar.set(2023, 10, 28);
//        Date selectedDate = selectedCalendar.getTime();
//
//        mDatePicker.updateDate(2023, 10, 28);
//        mTestOnDate.onDateSet(mDatePicker, 2023, 10, 28);
//
//        assertEquals("1667001600", mTestOnDate.mStartdate);
//        assertEquals("28/11/2023", mTestOnDate.tripStartDate.getText());
//
//        Log.d("testOnDate -> ", "Valid date selected test");
//    }
//
//    @Test
//    public void testInvalidDateSelected() {
//        Calendar currentCalendar = Calendar.getInstance();
//        currentCalendar.set(2023, 10, 27);
//        Date currentDate = currentCalendar.getTime();
//
//        Calendar selectedCalendar = Calendar.getInstance();
//        selectedCalendar.set(2023, 10, 25);
//        Date selectedDate = selectedCalendar.getTime();
//
//        mDatePicker.updateDate(2023, 10, 25);
//        mTestOnDate.onDateSet(mDatePicker, 2023, 10, 25);
//
//        Log.d("testOndate -> ", "Invalid date selected test");
//    }
//

//
//    //JELLNO ---------------------------------------------------------------
//    @Test
//    public void testOkLogin() {
//        LoginPresenter presenter = new LoginPresenter();
//
//        // Test 1: Valid email and password (Expected: Success)
//        String email1 = "user@example.com";
//        String password1 = "P@ssw0rd";
//        String result1 = presenter.ok_login(email1, password1, mHandler);
//        assertEquals("Success", result1);
//
//        // Test 2: Valid email and empty password (Expected: Error)
//        String email2 = "user@example.com";
//        String password2 = "";
//        String result2 = presenter.ok_login(email2, password2, mHandler);
//        assertEquals("Error", result2);
//
//        // Test 3: Valid email and invalid password (Expected: Error)
//        String email3 = "user@example.com";
//        String password3 = "invalidpassword";
//        String result3 = presenter.ok_login(email3, password3, mHandler);
//        assertEquals("Error", result3);
//
//        // Test 4: Empty email and valid password (Expected: Error)
//        String email4 = "";
//        String password4 = "P@ssw0rd";
//        String result4 = presenter.ok_login(email4, password4, mHandler);
//        assertEquals("Error", result4);
//
//        // Test 5: Empty email and empty password (Expected: Error)
//        String email5 = "";
//        String password5 = "";
//        String result5 = presenter.ok_login(email5, password5, mHandler);
//        assertEquals("Error", result5);
//
//        // Test 6: Invalid email and valid password (Expected: Error)
//        String email6 = "invalidemail";
//        String password6 = "P@ssw0rd";
//        String result6 = presenter.ok_login(email6, password6, mHandler);
//        assertEquals("Error", result6);
//
//        // Test 7: Invalid email and empty password (Expected: Error)
//        String email7 = "invalidemail";
//        String password7 = "";
//        String result7 = presenter.ok_login(email7, password7, mHandler);
//        assertEquals("Error", result7);
//
//        // Test 8: Invalid email and invalid password (Expected: Error)
//        String email8 = "invalidemail";
//        String password8 = "invalidpassword";
//        String result8 = presenter.ok_login(email8, password8, mHandler);
//        assertEquals("Error", result8);
//    }
//
//    // Mock handler for testing
//    private Handler mHandler = new Handler();
//
//    //JELLNO ---------------------------------------------------------------
//    @Test
//    public void testSortRestaurantsByPricesLow() {
//        int sortType = R.id.restaurantSortPricesLow;
//
//        when(activity.getRestaurantsCardViewAdapter()).thenReturn(mRestaurantsCardViewAdapter);
//        when(activity.getRestaurantItemEntities()).thenReturn(restaurantItemEntities);
//
//        boolean result = activity.sortRestaurants(sortType);
//
//        verify(mRestaurantsCardViewAdapter).notifyDataSetChanged();
//        verify(restaurantItemEntities).sort(Comparator.comparingInt(RestaurantItemEntity::getAvgCost));
//        assertTrue(result);
//    }
//
//    @Test
//    public void testSortRestaurantsByPricesHigh() {
//        int sortType = R.id.restaurantSortPricesHigh;
//
//        when(activity.getRestaurantsCardViewAdapter()).thenReturn(mRestaurantsCardViewAdapter);
//        when(activity.getRestaurantItemEntities()).thenReturn(restaurantItemEntities);
//
//        boolean result = activity.sortRestaurants(sortType);
//
//        verify(mRestaurantsCardViewAdapter).notifyDataSetChanged();
//        verify(restaurantItemEntities).sort((r1, r2) -> r2.getAvgCost() - r1.getAvgCost());
//        assertTrue(result);
//    }
//
//    @Test
//    public void testSortRestaurantsByRating() {
//        int sortType = R.id.restaurantSortRating;
//
//        when(activity.getRestaurantsCardViewAdapter()).thenReturn(mRestaurantsCardViewAdapter);
//        when(activity.getRestaurantItemEntities()).thenReturn(restaurantItemEntities);
//
//        boolean result = activity.sortRestaurants(sortType);
//
//        verify(mRestaurantsCardViewAdapter).notifyDataSetChanged();
//        verify(restaurantItemEntities).sort((r1, r2) -> Float.compare(r2.getRatings(), r1.getRatings()));
//        assertTrue(result);
//    }
//
//    @Test
//    public void testSortRestaurantsByVotes() {
//        int sortType = R.id.restaurantSortVotes;
//
//        when(activity.getRestaurantsCardViewAdapter()).thenReturn(mRestaurantsCardViewAdapter);
//        when(activity.getRestaurantItemEntities()).thenReturn(restaurantItemEntities);
//
//        boolean result = activity.sortRestaurants(sortType);
//
//        verify(mRestaurantsCardViewAdapter).notifyDataSetChanged();
//        verify(restaurantItemEntities).sort((r1, r2) -> r2.getVotes() - r1.getVotes());
//        assertTrue(result);
//    }
//
//    @Test
//    public void testSortRestaurantsByAlphabet() {
//        int sortType = R.id.restaurantSortAlphabet;
//
//        when(activity.getRestaurantsCardViewAdapter()).thenReturn(mRestaurantsCardViewAdapter);
//        when(activity.getRestaurantItemEntities()).thenReturn(restaurantItemEntities);
//
//        boolean result = activity.sortRestaurants(sortType);
//
//        verify(mRestaurantsCardViewAdapter).notifyDataSetChanged();
//        verify(restaurantItemEntities).sort(Comparator.comparing(RestaurantItemEntity::getName));
//        assertTrue(result);
//    }
//
//    @Test
//    public void testSortRestaurantsWithInvalidSortType() {
//        int sortType = -1; // หรือค่าอื่น ๆ ที่ไม่ตรงกับ case ใด ๆ
//
//        when(activity.getRestaurantsCardViewAdapter()).thenReturn(mRestaurantsCardViewAdapter);
//        when(activity.getRestaurantItemEntities()).thenReturn(restaurantItemEntities);
//
//        boolean result = activity.sortRestaurants(sortType);
//
//        verify(mRestaurantsCardViewAdapter, never()).notifyDataSetChanged();
//        verify(restaurantItemEntities, never()).sort(any());
//        assertTrue(!result);
//    }


}



