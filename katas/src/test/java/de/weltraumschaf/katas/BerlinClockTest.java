package de.weltraumschaf.katas;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests for {@link BerlinClock}.
 */
public class BerlinClockTest {

    private final BerlinClock subjectUnderTest = new BerlinClock();

    // Yellow lamp should blink on/off every two seconds
    @Test
    public void yellowLampShouldBlinkOnOffEveryTwoSeconds() {
        assertThat(subjectUnderTest.getSeconds(0), is(equalTo("Y")));
        assertThat(subjectUnderTest.getSeconds(1), is(equalTo("O")));
        assertThat(subjectUnderTest.getSeconds(59), is(equalTo("O")));
    }

    // Top hours should have 4 lamps
    @Test
    public void topHoursShouldHave4Lamps() {
        assertThat(subjectUnderTest.getTopHours(7).length(), is(4));
    }

    // Top hours should light a red lamp for every 5 hours
    @Test
    public void topHoursShouldLightRedLampForEvery5Hours() {
        assertThat(subjectUnderTest.getTopHours(0), is(equalTo("OOOO")));
        assertThat(subjectUnderTest.getTopHours(13), is(equalTo("RROO")));
        assertThat(subjectUnderTest.getTopHours(23), is(equalTo("RRRR")));
        assertThat(subjectUnderTest.getTopHours(24), is(equalTo("RRRR")));
    }

    // Bottom hours should have 4 lamps
    @Test
    public void bottomHoursShouldHave4Lamps() {
        assertThat(subjectUnderTest.getBottomHours(5).length(), is(4));
    }

    // Bottom hours should light a red lamp for every hour left from top hours
    @Test
    public void bottomHoursShouldLightRedLampForEveryHourLeftFromTopHours() {
        assertThat(subjectUnderTest.getBottomHours(0), is(equalTo("OOOO")));
        assertThat(subjectUnderTest.getBottomHours(13), is(equalTo("RRRO")));
        assertThat(subjectUnderTest.getBottomHours(23), is(equalTo("RRRO")));
        assertThat(subjectUnderTest.getBottomHours(24), is(equalTo("RRRR")));
    }

    // Top minutes should have 11 lamps
    @Test
    public void topMinutesShouldHave11Lamps() {
        assertThat(subjectUnderTest.getTopMinutes(34).length(), is(11));
    }

    // Top minutes should have 3rd, 6th and 9th lamps in red to indicate first quarter, half and last quarter
    @Test
    public void topMinutesShouldHave3rd6thAnd9thLampsInRedToIndicateFirstQuarterHalfAndLastQuarter() {
        final String minutes32 = subjectUnderTest.getTopMinutes(32);

        assertThat(minutes32.substring(2, 3), is(equalTo("R")));
        assertThat(minutes32.substring(5, 6), is(equalTo("R")));
        assertThat(minutes32.substring(8, 9), is(equalTo("O")));
    }

    // Top minutes should light a yellow lamp for every 5 minutes unless it's first quarter, half or last quarter
    @Test
    public void topMinutesShouldLightYellowLampForEvery5MinutesUnlessItIsFirstQuarterHalfOrLastQuarter() {
        assertThat(subjectUnderTest.getTopMinutes(0), is(equalTo("OOOOOOOOOOO")));
        assertThat(subjectUnderTest.getTopMinutes(17), is(equalTo("YYROOOOOOOO")));
        assertThat(subjectUnderTest.getTopMinutes(59), is(equalTo("YYRYYRYYRYY")));
    }

    // Bottom minutes should have 4 lamps
    @Test
    public void bottomMinutesShouldHave4Lamps() {
        assertThat(subjectUnderTest.getBottomMinutes(0).length(), is(4));
    }

    // Bottom minutes should light a yellow lamp for every minute left from top minutes
    @Test
    public void bottomMinutesShouldLightYellowLampForEveryMinuteLeftFromTopMinutes() {
        assertThat(subjectUnderTest.getBottomMinutes(0), is(equalTo("OOOO")));
        assertThat(subjectUnderTest.getBottomMinutes(17), is(equalTo("YYOO")));
        assertThat(subjectUnderTest.getBottomMinutes(59), is(equalTo("YYYY")));
    }

    // Berlin Clock should result in array with 5 elements
    @Test
    public void berlinClockShouldResultInArrayWith5Elements()  {
        assertThat(subjectUnderTest.convertToBerlinTime("13:17:01").length, is(5));
    }

    // Berlin Clock it should "result in correct seconds, hours and minutes" in {
    @Test
    public void berlinClockShouldResultInCorrectSecondsHoursAndMinutes() {
        final String[] berlinTime = subjectUnderTest.convertToBerlinTime("16:37:16");
        final String[] expected = new String[] {"Y", "RRRO", "ROOO", "YYRYYRYOOOO", "YYOO"};
        assertThat(berlinTime.length, is(expected.length));

        for (int index = 0; index < expected.length; index++) {
            assertThat(berlinTime[index], is(equalTo(expected[index])));
        }
    }
}
