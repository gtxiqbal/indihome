package com.gtx.indihome.repository;

import com.gtx.indihome.entity.Pic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PicRepository extends JpaRepository<Pic, String> {
    List<Pic> findByNama(String nama);
}
