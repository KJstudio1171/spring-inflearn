package springstudy.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springstudy.springstudy.domain.Member;
import springstudy.springstudy.domain.Reservation;
import springstudy.springstudy.service.ReservationService;

import java.time.LocalDate;

public class reservationApp {
    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ReservationService reservationService = applicationContext.getBean(ReservationService.class);

        Member member = new Member(1L, "spring");
        Reservation reservation = new Reservation(0L, member.getId(), 0, "된찌", LocalDate.of(2022, 9, 30));
        reservationService.makeReservation(reservation);
        Reservation reservation1 = reservationService.findReservation(0L);
    }
}
