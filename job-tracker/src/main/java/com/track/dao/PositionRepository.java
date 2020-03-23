package com.track.dao;

import com.track.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Long> {

    List<Position> findByTitle(String name);

    List<Position> findByCompanyId(String name);
}
