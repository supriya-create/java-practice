import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YY");
        String newdatetime = datetime.format(formatter);
        System.out.println(date);
        System.out.println(time);
        System.out.println(newdatetime);


        LocalDateTime date1 = LocalDateTime.of(2026, 9, 01, 12, 59,59);
        LocalDateTime date2 = LocalDateTime.of(29, 9, 26, 12, 59,59);

        if(date1.isAfter(date2)){
            System.out.println(date1 + " is after "+ date2);
        }
        else if(date1.isBefore(date2)){
            System.out.println(date1 + " is before "+date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 +"is equal to "+date2);
        }
    }
}
