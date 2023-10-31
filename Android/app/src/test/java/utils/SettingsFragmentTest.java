package utils;

import io.github.project_travel_mate.SettingsFragment;
import io.github.project_travel_mate.notifications.NotificationsActivity;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SettingsFragmentTest {

    private SettingsFragment mSettingsFragment;

    @Before
    public void setUp() {
        mSettingsFragment = new SettingsFragment();
    }

    @Test
    public void testValidPassword() {
        boolean result = mSettingsFragment.validatePassword("Pp@ssword1");
        assertTrue(result);
    }

    @Test
    public void testGetTimeAgo() {
        NotificationsActivity timeUtils = new NotificationsActivity();
        long currentTime = System.currentTimeMillis();
        long lessThanAMinuteAgo = currentTime - 1000;
        String result = timeUtils.getTimeAgo(lessThanAMinuteAgo);
        assertEquals("Just now", result);


        long tenMinutesAgo = currentTime - (30 * 60 * 1000);
        result = timeUtils.getTimeAgo(tenMinutesAgo);
        assertEquals("30 minutes ago", result);

        long oneHourAgo = currentTime - (1 * 60 * 60 * 1000);
        result = timeUtils.getTimeAgo(oneHourAgo);
        assertEquals("an hour ago", result);

        long oneDayAgo = currentTime - (24 * 60 * 60 * 1000);
        result = timeUtils.getTimeAgo(oneDayAgo);
        assertEquals("1 days ago", result);

        long twoMonthsAgo = currentTime - (1 * 30 * 24 * 60 * 60 * 1000);
        result = timeUtils.getTimeAgo(twoMonthsAgo);
        assertEquals("1 months ago", result);
    }
}

