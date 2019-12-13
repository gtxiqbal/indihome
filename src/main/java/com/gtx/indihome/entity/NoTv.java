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

@Entity
@Getter
@Setter
public class NoTv {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false, unique = true)
    @NotNull
    @NotEmpty
    @Size(min = 12, max = 12)
    private String noTv;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 7, max = 7)
    private String passTV;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pelanggan_tv",
            joinColumns = @JoinColumn(name = "id_tv"),
            inverseJoinColumns = @JoinColumn(name = "id_pelanggan")
    )
    private List<Pelanggan> pelangganList = new ArrayList<>();
}
