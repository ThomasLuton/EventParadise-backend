package co.simplon.eventparadise.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventparadise.database.Database;
import co.simplon.eventparadise.dtos.ThemeView;
import co.simplon.eventparadise.entitites.Theme;

@RestController
@RequestMapping("/themes")
@CrossOrigin
public class ThemeController {

    @GetMapping
    public Collection<ThemeView> getAll() {
	Collection<Theme> themes = Database.findAllTheme();
	Collection<ThemeView> views = new ArrayList<>();
	for (Theme theme : themes) {
	    ThemeView view = new ThemeView();
	    view.setName(theme.getName());
	    view.setId(theme.getId());
	    views.add(view);
	}
	return views;
    }
}
