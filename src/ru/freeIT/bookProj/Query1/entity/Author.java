package ru.freeIT.bookProj.Query1.entity;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Author() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        if (author.getSecondName() != secondName)
            return false;
        if (author.getFirstName() != firstName)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + " secondName: " + secondName;
    }
}
