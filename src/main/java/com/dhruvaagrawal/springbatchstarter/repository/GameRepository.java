package com.dhruvaagrawal.springbatchstarter.repository;

import com.dhruvaagrawal.springbatchstarter.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {}
