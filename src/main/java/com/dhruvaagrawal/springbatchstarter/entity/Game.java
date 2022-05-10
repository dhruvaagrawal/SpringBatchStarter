package com.dhruvaagrawal.springbatchstarter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {

    @Id
    private String id;

    private boolean rated;

    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "last_move_at")
    private String lastMoveAt;
    private int turns;
    @Column(name = "victory_status")
    private String victoryStatus;
    private String winner;
    @Column(name = "increment_code")
    private String incrementCode;
    @Column(name = "white_id")
    private String whiteId;
    @Column(name = "white_rating")
    private Long whiteRating;
    @Column(name = "black_id")
    private String blackId;
    @Column(name = "black_rating")
    private Long blackRating;
    @Column(columnDefinition = "TEXT")
    private String moves;
    @Column(name = "opening_eco")
    private String openingEco;
    @Column(name = "opening_name")
    private String openingName;
    @Column(name = "opening_ply")
    private int openingPly;

    public Game() {}

    public Game(String id, boolean rated, String createdAt, String lastMoveAt, int turns, String victoryStatus, String winner, String incrementCode, String whiteId, Long whiteRating, String blackId, Long blackRating, String moves, String openingEco, String openingName, int openingPly) {
        this.id = id;
        this.rated = rated;
        this.createdAt = createdAt;
        this.lastMoveAt = lastMoveAt;
        this.turns = turns;
        this.victoryStatus = victoryStatus;
        this.winner = winner;
        this.incrementCode = incrementCode;
        this.whiteId = whiteId;
        this.whiteRating = whiteRating;
        this.blackId = blackId;
        this.blackRating = blackRating;
        this.moves = moves;
        this.openingEco = openingEco;
        this.openingName = openingName;
        this.openingPly = openingPly;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isRated() {
        return rated;
    }

    public void setRated(boolean rated) {
        this.rated = rated;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastMoveAt() {
        return lastMoveAt;
    }

    public void setLastMoveAt(String lastMoveAt) {
        this.lastMoveAt = lastMoveAt;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public String getVictoryStatus() {
        return victoryStatus;
    }

    public void setVictoryStatus(String victoryStatus) {
        this.victoryStatus = victoryStatus;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getIncrementCode() {
        return incrementCode;
    }

    public void setIncrementCode(String incrementCode) {
        this.incrementCode = incrementCode;
    }

    public String getWhiteId() {
        return whiteId;
    }

    public void setWhiteId(String whiteId) {
        this.whiteId = whiteId;
    }

    public Long getWhiteRating() {
        return whiteRating;
    }

    public void setWhiteRating(Long whiteRating) {
        this.whiteRating = whiteRating;
    }

    public String getBlackId() {
        return blackId;
    }

    public void setBlackId(String blackId) {
        this.blackId = blackId;
    }

    public Long getBlackRating() {
        return blackRating;
    }

    public void setBlackRating(Long blackRating) {
        this.blackRating = blackRating;
    }

    public String getMoves() {
        return moves;
    }

    public void setMoves(String moves) {
        this.moves = moves;
    }

    public String getOpeningEco() {
        return openingEco;
    }

    public void setOpeningEco(String openingEco) {
        this.openingEco = openingEco;
    }

    public String getOpeningName() {
        return openingName;
    }

    public void setOpeningName(String openingName) {
        this.openingName = openingName;
    }

    public int getOpeningPly() {
        return openingPly;
    }

    public void setOpeningPly(int openingPly) {
        this.openingPly = openingPly;
    }
}
