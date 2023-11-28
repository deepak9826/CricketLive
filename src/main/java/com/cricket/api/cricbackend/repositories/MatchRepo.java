package com.cricket.api.cricbackend.repositories;

import com.cricket.api.cricbackend.Entitites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    Optional<Match> findByTeamHeading(String teamHeading);
}
