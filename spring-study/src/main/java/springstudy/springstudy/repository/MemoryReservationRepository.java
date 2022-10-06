package springstudy.springstudy.repository;

import springstudy.springstudy.domain.Reservation;

import java.util.HashMap;

public class MemoryReservationRepository implements ReservationRepository {


    private static HashMap<Long, Reservation> store = new HashMap<>();

    @Override
    public void save(Reservation reservation) {
        store.put(reservation.getId(), reservation);
    }

    @Override
    public Reservation findById(Long reservationId) {
        return store.get(reservationId);
    }
}
