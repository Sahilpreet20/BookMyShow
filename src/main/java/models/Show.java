package models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel {
    private Date startDate;
    private Movie movie;
    private Theater theater;
    private Screen screen;
    private List<ShowSeat> showSeats;

    public List<ShowSeatType> getShowSeatTypes() {
        return showSeatTypes;
    }

    public void setShowSeatTypes(List<ShowSeatType> showSeatTypes) {
        this.showSeatTypes = showSeatTypes;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    private List<ShowSeatType> showSeatTypes;
}
