package com.mjm.statisticsmicroservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "latest_statistics")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "DESCRIPTION")
    @NotBlank  @NotEmpty @NotNull
    private String description;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "EMAIL")
    @NotBlank  @NotEmpty @NotNull
    private String email;

    @PrePersist
    private void getTimeOperation(){
        this.date=new Date();
    }
}
