package com.cricket.api.cricbackend.Service;

import com.cricket.api.cricbackend.Entitites.Match;

import java.util.List;

public interface MatchService {
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();
}
