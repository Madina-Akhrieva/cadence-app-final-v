package com.example.saver.repository;

import com.example.saver.domain.CityTempMarkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CityTempMarkRepository extends JpaRepository<CityTempMarkModel, Long>, JpaSpecificationExecutor<CityTempMarkModel> {

}
