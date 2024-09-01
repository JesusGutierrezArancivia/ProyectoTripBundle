package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Season")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idSeason;

    @Column(name = "nameSeason",nullable = false,length = 70)
    private String nameSeason;

    @Column(name = "startDateSeason",nullable = false)
    private LocalDate startDateSeason;

    @Column(name = "endDateSeason",nullable = false)
    private LocalDate endDateSeason;

    public Season() {
    }

    public Season(int idSeason, String nameSeason, LocalDate startDateSeason, LocalDate endDateSeason) {
        this.idSeason = idSeason;
        this.nameSeason = nameSeason;
        this.startDateSeason = startDateSeason;
        this.endDateSeason = endDateSeason;
    }

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
