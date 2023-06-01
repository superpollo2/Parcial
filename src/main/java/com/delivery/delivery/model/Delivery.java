package com.delivery.delivery.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Delivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="iddelivery")
    private Long idDelivery;

    @Column(name="addresdelivery", nullable = false, length = 80)
    private @NonNull String addresDelivery;

    @Column(name="city" , nullable = false, length = 80)
    private @NonNull String city;

    @Column(name="state", nullable = false, length = 80)
    private @NonNull Boolean state;

    @Column(name="dateDelivery", nullable = false, length = 80)
    private @NonNull Date dateDelivery;

    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Client client;

}
