package lv.itlat.bookshelf.persitence.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "RESERVATION")
@Table(name = "reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name ="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
