package co.simplon.eventparadise.entitites;

public class Location {
    private Long id;
    private String name;

    public Location() {
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

    @Override
    public String toString() {
	return "{name=" + name + ", id=" + id + "}";
    }

}
