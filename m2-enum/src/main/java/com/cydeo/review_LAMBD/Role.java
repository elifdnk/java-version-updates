package com.cydeo.review_LAMBD;

public enum Role {
    ADMIN("Admin"), MANAGER("Manager"), EMPLOYEE("Employee");

    public String value;

    Role(String value) {
        this.value = value;
    }
}
