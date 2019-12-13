package com.gtx.indihome.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class NoInet {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false, unique = true)
    @NotNull
    @NotEmpty
    @Size(min = 12,max = 12)
    private String noInet;

    @OneToOne(mappedBy = "noInet")
    private Pelanggan pelanggan;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "noInet"
    )
    private List<Domain> domainList = new ArrayList<>();
}
