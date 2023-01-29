package co.simplon.eventparadise.dtos;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class EventCreate {
    private Long id;
    @Size(max = 255)
    @NotEmpty
    private String name;
    @FutureOrPresent
    @NotNull
    private LocalDate date;
    @NotNull
    private Long locationId;
    @NotNull
    private Long themeId;
    @Positive
    @NotNull
    private Double rate;
    @Size(max = 1000)
    @NotEmpty
    private String description;

    public EventCreate() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public Long getLocationId() {
	return locationId;
    }

    public void setLocationId(Long locationId) {
	this.locationId = locationId;
    }

    public Long getThemeId() {
	return themeId;
    }

    public void setThemeId(Long themeId) {
	this.themeId = themeId;
    }

    public Double getRate() {
	return rate;
    }

    public void setRate(Double rate) {
	this.rate = rate;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", date=" + date
		+ ", locationId=" + locationId
		+ ", themeId=" + themeId + ", rate=" + rate
		+ ", description=" + description + ", id="
		+ id + "}";
    }

}
