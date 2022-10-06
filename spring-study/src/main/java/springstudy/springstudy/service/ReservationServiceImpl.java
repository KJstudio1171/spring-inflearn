package springstudy.springstudy.service;

import springstudy.springstudy.domain.Reservation;
import springstudy.springstudy.repository.ReservationRepository;

public class ReservationServiceImpl implements ReservationService{

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void makeReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public Reservation findReservation(Long reservationId) {
        return reservationRepository.findById(reservationId);
    }
}
