package pe.edu.upc.tripbundle.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class SeasonDTO {
    private int idSeason;

    private String nameSeason;

    private LocalDate startDateSeason;

    private LocalDate endDateSeason;

    public int getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(int idSeason) {
        this.idSeason = idSeason;
    }

    public String getNameSeason() {
        return nameSeason;
    }

    public void setNameSeason(String nameSeason) {
        this.nameSeason = nameSeason;
    }

    public LocalDate getStartDateSeason() {
        return startDateSeason;
    }

    public void setStartDateSeason(LocalDate startDateSeason) {
        this.startDateSeason = startDateSeason;
    }

    public LocalDate getEndDateSeason() {
        return endDateSeason;
    }

    public void setEndDateSeason(LocalDate endDateSeason) {
        this.endDateSeason = endDateSeason;
    }
}
