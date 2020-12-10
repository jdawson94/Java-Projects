public class SpeedReading {

    public SpeedReading(){
    }

    public int parseSpeedReading(String reading){
        String parsedReading = reading.substring(1);
        return Integer.parseInt(parsedReading);
    }
}
