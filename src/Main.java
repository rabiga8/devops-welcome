import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Extract the hour of the day
        int hour = currentTime.getHour();

        // Get the student's name (replace "John" with the actual student's name)
        String studentName = "John"; // Replace with actual student's name

        // Determine the greeting message based on the time of day
        String greetingMessage;
        if (hour < 12) {
            greetingMessage = "Good morning!, " + studentName + ", Welcome to COMP367!";
        } else {
            greetingMessage = "Good afternoon!, " + studentName + ", Welcome to COMP367!";
        }

        // Display the greeting message
        System.out.println(greetingMessage);
    }
}
