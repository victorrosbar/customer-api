package com.vbarros.api.customer.model;
import com.vbarros.api.customer.model.enums.IndividualType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "INDIVIDUAL")
public class Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "uuid")
    private UUID uuid = UUID.randomUUID();

    @NotBlank
    @Column(name = "type")
    private IndividualType type;

    @NotBlank
    @Column(name = "user")
    private String user;

    @OneToMany(mappedBy = "individual")
    private Set<Email> emails;

    @OneToMany(mappedBy = "individual")
    private Set<Phone> phones;

    @OneToMany(mappedBy = "individual")
    private Set<Address> addresses;

    @NotBlank
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

}
