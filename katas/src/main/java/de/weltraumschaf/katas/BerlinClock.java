package de.weltraumschaf.katas;

/**
 * Possible solution may be found here
 * http://technologyconversations.com/2014/02/25/java-8-tutorial-through-katas-berlin-clock-easy/
 */
final class BerlinClock {

    public String[] convertToBerlinTime(String time) {
        final String[] parts = time.split(":");
        return new String[]{
            getSeconds(Integer.parseInt(parts[2])),
            getTopHours(Integer.parseInt(parts[0])),
            getBottomHours(Integer.parseInt(parts[0])),
            getTopMinutes(Integer.parseInt(parts[1])),
            getBottomMinutes(Integer.parseInt(parts[1]))
        };
    }

    public String getSeconds(int number) {
        if (number % 2 == 0) {
            return "Y";
        } else {
            return "O";
        }
    }

    public String getTopHours(int number) {
        return getOnOff(4, getTopNumberOfOnSigns(number));
    }

    public String getBottomHours(int number) {
        return getOnOff(4, number % 5);
    }

    public String getTopMinutes(int number) {
        return getOnOff(11, getTopNumberOfOnSigns(number), "Y").replaceAll("YYY", "YYR");
    }

    public String getBottomMinutes(int number) {
        return getOnOff(4, number % 5, "Y");
    }

    private String getOnOff(int lamps, int onSigns) {
        return getOnOff(lamps, onSigns, "R");
    }

    private String getOnOff(int lamps, int onSigns, String onSign) {
        String out = "";

        for (int i = 0; i < onSigns; i++) {
            out += onSign;
        }

        for (int i = 0; i < (lamps - onSigns); i++) {
            out += "O";
        }

        return out;
    }

    private int getTopNumberOfOnSigns(int number) {
        return (number - (number % 5)) / 5;
    }

}
