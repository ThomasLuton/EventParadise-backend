package co.simplon.eventparadise.entitites;

public class Theme {
    private Long id;
    private String name;

    public Theme() {

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
