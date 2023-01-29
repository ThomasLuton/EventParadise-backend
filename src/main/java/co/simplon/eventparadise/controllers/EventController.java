package co.simplon.eventparadise.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventparadise.database.Database;
import co.simplon.eventparadise.dtos.EventCreate;
import co.simplon.eventparadise.entitites.Event;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody EventCreate inputs) {
	Event event = new Event();
	event.setName(inputs.getName());
	event.setDate(inputs.getDate());
	event.setLocation(Database
		.findOneLocation(inputs.getLocationId()));
	event.setTheme(
		Database.findOneTheme(inputs.getThemeId()));
	event.setRate(inputs.getRate());
	event.setDescription(inputs.getDescription());
	Database.save(event);
    }
}
