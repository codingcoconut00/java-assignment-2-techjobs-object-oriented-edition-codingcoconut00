package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    public int getId() {
        return id;
    }

    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // constructor 1  initializes id and sets its value to nextid which increments w every run?
    public Job() {
       id= nextId;
       nextId++;
    }
    private static int nextId = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    private Employer employer;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Location location;

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    private PositionType positionType;

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    private CoreCompetency coreCompetency;

// constructor 2 5 parameters and assigns values to name, employer, location, positionType, and coreCompetency
    public Job( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); //?
        this.name= name;
        this.employer = employer;
        this.location= location;
        this.positionType= positionType;
        this.coreCompetency= coreCompetency;

}

// constructor to initialize the id field with a unique id

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the

    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
