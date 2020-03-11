package lv.itlat.bookshelf.persistence.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "USER")
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column(name ="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
