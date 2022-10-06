package springstudy.springstudy.service;

import springstudy.springstudy.domain.Reservation;

public interface ReservationService {
    void makeReservation(Reservation reservation);
    Reservation findReservation(Long reservationId);
}
