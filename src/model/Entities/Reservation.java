package model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.Exceptions.DomainException;

public class Reservation {

public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
private Integer roomNumber;
private LocalDate checkIn;
private LocalDate checkOut;

public Reservation (){}

public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
    if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
    }
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
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

public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
    LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)){
            throw new DomainException ("Error in reservation: Reservation dates for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    
}

@Override
public String toString() {
    return "Reservation: Room "
    + getRoomNumber() + ", check-in: "
    + getCheckIn().format(dtf) + ", check-out: "
    + getChekOut().format(dtf) + ", " + duration() + " nights";

}

        

    
}
