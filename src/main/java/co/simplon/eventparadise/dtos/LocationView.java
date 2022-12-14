package co.simplon.eventparadise.dtos;

public class LocationView {
    private String name;
    private Long id;

    public LocationView() {
	// TODO Auto-generated constructor stub
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", id=" + id + "}";
    }

}
