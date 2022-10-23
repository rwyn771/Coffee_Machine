class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (!java.util.Objects.equals(firstName, null) && !firstName.isBlank())
            this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        if (!java.util.Objects.equals(lastName, null) && !lastName.isBlank())
            this.lastName = lastName;
    }

    public String getFirstName()
    {
        if (!java.util.Objects.equals(firstName, null) && !firstName.isBlank())
            return firstName;
        else
            return "";
    }

    public String getLastName()
    {
        if (!java.util.Objects.equals(lastName, null) && !lastName.isBlank())
            return lastName;
        else
            return "";
    }

    public String getFullName() {
        String a = getFirstName();
        String b = getLastName();

        if (a.isBlank() && b.isBlank())
            return "Unknown";
        else if (a.isBlank() && !b.isBlank())
            return b;
        else if (!a.isBlank() && b.isBlank())
            return a;
        else
            return a.concat(" ").concat(b);
    }
}