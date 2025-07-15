package model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
private Integer roomNumber;
private LocalDate checkIn;
private LocalDate checkOut;

public Reservation (){}

public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate chekOut) {
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = chekOut;
}

public Integer getRoomNumber() {
    return roomNumber;
}

public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
}

public LocalDate getCheckIn() {
    return checkIn;
}

public LocalDate getChekOut() {
    return checkOut;
}

public long duration (){
    return ChronoUnit.DAYS.between(checkIn, checkOut);
}

public String updateDates(LocalDate checkIn, LocalDate checkOut){
    LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)){
            return "Error in reservation: Reservation dates for update must be future dates";
        }
        if (!checkOut.isAfter(checkIn)){
            return "Error in reservation: Check-out date must be after check-in date";
        }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    return null;
}

@Override
public String toString() {
    return "Reservation: Room "
    + getRoomNumber() + ", check-in: "
    + getCheckIn().format(dtf) + ", check-out: "
    + getChekOut().format(dtf) + ", " + duration() + " nights";

}

        

    
}
