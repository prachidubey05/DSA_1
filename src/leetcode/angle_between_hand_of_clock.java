class Solution {
    public double angleClock(int hour, int minutes) {
        int hourAngle = (hour % 12) * 60 + minutes; // angle * 2
        int minuteAngle = minutes * 12;             // angle * 2

        int diff = Math.abs(hourAngle - minuteAngle);
        diff = Math.min(diff, 720 - diff); // 360 * 2 = 720

        return diff / 2.0;
    }
}
