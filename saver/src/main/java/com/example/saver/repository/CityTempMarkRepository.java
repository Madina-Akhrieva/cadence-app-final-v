package com.example.saver.repository;

import com.example.saver.domain.CityTempMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CityTempMarkRepository extends JpaRepository<CityTempMark, Long>, JpaSpecificationExecutor<CityTempMark> {

}
