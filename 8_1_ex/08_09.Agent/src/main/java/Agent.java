

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }

    @Override
    public String toString() {
    return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }

    public void main(String[] args) {

        Agent agent = new Agent(firstName, lastName);
        System.out.println(agent);
    }
    
}