package com.delivery.delivery.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idclient")
    private Long idClient;

    @Column(name="firstname", nullable = false, length = 80)
    private @NonNull String firstName;

    @Column(name="lastname" , nullable = false, length = 80)
    private @NonNull String lastName;

    @Column(name="phone", nullable = false, length = 80)
    private @NonNull String phone;

    @Column(name="email", nullable = false, length = 80)
    private @NonNull String email;

}
