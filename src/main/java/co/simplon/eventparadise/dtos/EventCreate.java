package co.simplon.eventparadise.dtos;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EventCreate {
    @NotEmpty
    private String name;
    @FutureOrPresent
    @NotNull
    private LocalDate date;
    @NotNull
    private Long locationId;
    @NotNull
    private Long themeId;
    @DecimalMin(value = "0.01")
    @NotNull
    private Double rate;
    @NotEmpty
    private String description;
    private Long id;

    public EventCreate() {
    }

    public String getName() {
	return name;
    }

    public LocalDate getDate() {
	return date;
    }

    public Long getLocationId() {
	return locationId;
    }

    public Long getThemeId() {
	return themeId;
    }

    public Double getRate() {
	return rate;
    }

    public String getDescription() {
	return description;
    }

    public Long getId() {
	return id;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public void setLocationId(Long locationId) {
	this.locationId = locationId;
    }

    public void setThemeId(Long themeId) {
	this.themeId = themeId;
    }

    public void setRate(Double rate) {
	this.rate = rate;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public void setId(Long id) {
	this.id = id;
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
