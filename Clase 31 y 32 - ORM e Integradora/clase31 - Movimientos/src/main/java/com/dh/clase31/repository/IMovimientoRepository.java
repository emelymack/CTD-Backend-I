package com.dh.clase31.repository;

import com.dh.clase31.entity.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovimientoRepository extends JpaRepository<Movimiento,Long> {
}
