package springstudy.springstudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springstudy.springstudy.repository.ReservationRepository;
import springstudy.springstudy.repository.MemoryReservationRepository;
import springstudy.springstudy.service.ReservationService;
import springstudy.springstudy.service.ReservationServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public ReservationRepository reservationRepository() {
        return new MemoryReservationRepository();
    }

    @Bean
    public ReservationService reservationService() {
        return new ReservationServiceImpl(reservationRepository());
    }
}
