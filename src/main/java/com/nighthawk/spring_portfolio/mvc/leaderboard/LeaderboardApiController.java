package com.nighthawk.spring_portfolio.mvc.leaderboard;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;


public class LeaderboardApiController {
    @PostMapping("/leaderboard")
    public ResponseEntity<Player> checkLeaderboard() {
        Player player = null;
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

}
