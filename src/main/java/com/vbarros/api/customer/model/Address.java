package com.vbarros.api.customer.model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "uuid")
    private UUID uuid = UUID.randomUUID();

    @NotBlank
    @Column(name = "country")
    private String country;

    @NotBlank
    @Column(name = "state")
    private String state;

    @NotBlank
    @Column(name = "city")
    private String city;

    @NotBlank
    @Column(name = "postcode")
    private String postcode;

    @NotBlank
    @Column(name = "address")
    private String address;

    @NotBlank
    @ManyToOne
    @JoinColumn(name="individual_id", nullable=false)
    private Individual individual;

    @NotBlank
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

}
