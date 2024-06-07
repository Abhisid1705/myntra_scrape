package com.myntra_scrapper.myntra.repository;

import com.myntra_scrapper.myntra.entity.MyntraDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyntraDetailRepository extends JpaRepository<MyntraDetail, Long> {
    List<MyntraDetail> findByEmail(String email);

}
