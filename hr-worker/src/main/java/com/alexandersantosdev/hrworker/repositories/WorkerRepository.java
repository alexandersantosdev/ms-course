package com.alexandersantosdev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandersantosdev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
