package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        this.id = nextId;
        nextId++;
    }
    public Job(String aName,Employer aEmployer,Location aLocation,PositionType aPositionType,CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return this.getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String outPut = "";


        if(this.getId() != 0 && this.getName()==null && this.getEmployer()==null && this.getLocation()==null && this.getPositionType()==null && this.getCoreCompetency()==null)
        {
            return "OOPS! This job does not seem to exist.";
        }
        if(this.name.equals("")){
            setName("Data Not Available");
        }
        if(this.getLocation().getValue().equals("")){
            this.getLocation().setValue("Data Not Available");
        }
        if(this.getEmployer().getValue().equals("")){
            this.getEmployer().setValue("Data Not Available");
        }
        if(this.getCoreCompetency().getValue().equals("")){
            this.getCoreCompetency().setValue("Data Not Available");
        }
        if(this.getPositionType().getValue().equals("")){
            this.getPositionType().setValue("Data Not Available");
        }
        outPut+="\nID: " + this.getId()+'\n'+
                "Name: " + this.getName() + '\n' +
                "Employer: " + this.getEmployer().getValue() + '\n' +
                "Location: " + this.getLocation().getValue() + '\n' +
                "Position Type: " + this.getPositionType().getValue() + '\n' +
                "Core Competency: " + this.getCoreCompetency().getValue() + '\n';
        return outPut;

    }
}
