package dev.ak.football_dashboard.data;

import org.hibernate.mapping.Component.StandardGenerationContextLocator;

public class MatchInput {
    private String stage;
    private String date;
    private String team_name_home;
    private String team_name_away;
    private int team_home_score;
    private int team_away_score;
    private int total_shots_home;
    private int total_shots_away;
    private int shots_on_target_home;
    private int shots_on_target_away;
    private String location;

    // getter and setters

    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTeam_name_home() {
        return team_name_home;
    }
    public void setTeam_name_home(String team_name_home) {
        this.team_name_home = team_name_home;
    }
    public String getTeam_name_away() {
        return team_name_away;
    }
    public void setTeam_name_away(String team_name_away) {
        this.team_name_away = team_name_away;
    }
    public int getTeam_home_score() {
        return team_home_score;
    }
    public void setTeam_home_score(int team_home_score) {
        this.team_home_score = team_home_score;
    }
    public int getTeam_away_score() {
        return team_away_score;
    }
    public void setTeam_away_score(int team_away_score) {
        this.team_away_score = team_away_score;
    }
    public int getTotal_shots_home() {
        return total_shots_home;
    }
    public void setTotal_shots_home(int total_shots_home) {
        this.total_shots_home = total_shots_home;
    }
    public int getTotal_shots_away() {
        return total_shots_away;
    }
    public void setTotal_shots_away(int total_shots_away) {
        this.total_shots_away = total_shots_away;
    }
    public int getShots_on_target_home() {
        return shots_on_target_home;
    }
    public void setShots_on_target_home(int shots_on_target_home) {
        this.shots_on_target_home = shots_on_target_home;
    }
    public int getShots_on_target_away() {
        return shots_on_target_away;
    }
    public void setShots_on_target_away(int shots_on_target_away) {
        this.shots_on_target_away = shots_on_target_away;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
