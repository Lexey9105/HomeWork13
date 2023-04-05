import java.util.Objects;

public  class Author {
    String lastName;
    String firstName;
    public Author(String lastName, String firstName){
        this.lastName=lastName;
        this.firstName=firstName;
    }
    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}

    public void setLastName(String lastName){this.lastName=lastName;}
    public void setFirstName(String FirstName){this.firstName=firstName;}

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastName, author.lastName) && Objects.equals(firstName, author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}