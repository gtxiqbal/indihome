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
public class Pelanggan {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String nama;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true, name = "id_inet")
    private NoInet noInet;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 7,max = 15)
    private String ipGpon;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 3,max = 5)
    private String slotPort;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 2)
    private String onuId;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 12,max = 16)
    private String snOnt;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 5, max = 11)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_pic", nullable = false)
    private Pic pic;
}
