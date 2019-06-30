package com.example.server1.entity;

public class Task {
    private TypeOfTasks type;
    private boolean isExecute;

    public Task(String type) {
        switch (type) {
            case ("GetAll"): {
                this.type = TypeOfTasks.GetAll;
            }
            case ("Create"): {
                this.type = TypeOfTasks.Create;
            }
            case ("Update"): {
                this.type = TypeOfTasks.Update;
            }
            case ("Remove"): {
                this.type = TypeOfTasks.Remove;
            }
        }
    }
}
