package com.example.demo.repositories;

import com.example.demo.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
