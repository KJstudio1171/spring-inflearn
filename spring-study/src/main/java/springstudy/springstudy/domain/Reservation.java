package springstudy.springstudy.domain;

import java.time.LocalDate;

public class Reservation {

    private Long id;
    private Long memberId;

    private Integer pos;
    private String food;

    private LocalDate time;

    public Reservation(Long id, Long memberId, Integer pos, String food, LocalDate time) {
        this.id = id;
        this.memberId = memberId;
        this.pos = pos;
        this.food = food;
        this.time = time;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getPos() {
        return pos;
    }

    public String getFood() {
        return food;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public LocalDate getTime() {
        return time;
    }
}
