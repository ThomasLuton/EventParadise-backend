package co.simplon.eventparadise.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventparadise.database.Database;
import co.simplon.eventparadise.dtos.LocationView;
import co.simplon.eventparadise.entitites.Location;

@RestController
@RequestMapping("/locations")
@CrossOrigin
public class LocationController {

    @GetMapping
    public Collection<LocationView> getAll() {
	Collection<Location> locations = Database
		.findAllLocation();
	Collection<LocationView> views = new ArrayList<>();
	for (Location location : locations) {
	    LocationView view = new LocationView();
	    view.setName(location.getName());
	    view.setId(location.getId());
	    views.add(view);
	}
	return views;
    }

}
