package springstudy.springstudy.repository;

import springstudy.springstudy.domain.Reservation;

public interface ReservationRepository {
    void save(Reservation reservation);
    Reservation findById(Long id);
}
