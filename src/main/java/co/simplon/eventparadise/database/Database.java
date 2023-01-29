package co.simplon.eventparadise.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import co.simplon.eventparadise.entitites.Event;
import co.simplon.eventparadise.entitites.Location;
import co.simplon.eventparadise.entitites.Theme;

public class Database {
    private static Long locationId = 0L;
    private static Long themeId = 0L;
    private static Long eventId = 0L;

    private static final Map<Long, Location> LOCATIONS = new HashMap<>();
    private static final Map<Long, Theme> THEMES = new HashMap<>();
    private static final Map<Long, Event> EVENTS = new HashMap<>();

    static {
	Location location = new Location();
	location.setName("Paris");
	Database.save(location);
	location = new Location();
	location.setName("Rennes");
	Database.save(location);
	location = new Location();
	location.setName("Marseille");
	Database.save(location);
    }

    static {
	Theme theme = new Theme();
	theme.setName("Ecologie");
	Database.save(theme);
	theme = new Theme();
	theme.setName("Ressources humaines");
	Database.save(theme);
	theme = new Theme();
	theme.setName("Tech");
	Database.save(theme);
    }

    private static void save(Location location) {
	Database.locationId++;
	location.setId(locationId);
	LOCATIONS.put(locationId, location);
    }

    public static Collection<Location> findAllLocation() {
	return LOCATIONS.values();
    }

    public static Location findOneLocation(Long id) {
	return LOCATIONS.get(id);
    }

    private static void save(Theme theme) {
	Database.themeId++;
	theme.setId(themeId);
	THEMES.put(themeId, theme);
    }

    public static Collection<Theme> findAllTheme() {
	return THEMES.values();
    }

    public static Theme findOneTheme(Long id) {
	return THEMES.get(id);
    }

    public static void save(Event event) {
	Database.eventId++;
	event.setId(eventId);
	EVENTS.put(eventId, event);
    }

    public static Collection<Event> findAllEvent() {
	return EVENTS.values();
    }
}
