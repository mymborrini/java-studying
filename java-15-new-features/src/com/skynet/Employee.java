package com.skynet;

// It's important to note that any class that extends a sealed class must itself be declared sealed, non-sealed, or final.
// This ensures the class hierarchy remains finite and known by the compiler.
public final class Employee extends Person{

    private String supervisorId;

    public Employee(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }
}
