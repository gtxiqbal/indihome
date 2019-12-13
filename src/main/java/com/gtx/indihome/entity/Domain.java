package com.gtx.indihome.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Domain {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 11, max = 12)
    private String domain;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(max = 25)
    private String passInet;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(max = 25)
    private String paket;

    private String test;

    @ManyToOne
    @JoinColumn(name = "id_inet", nullable = false)
    private NoInet noInet;
}
