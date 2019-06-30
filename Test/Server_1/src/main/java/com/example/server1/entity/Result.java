package com.example.server1.entity;

public class Result {
    private TypeOfTasks typeOfResult;

    public Result(String type) {
        switch (type) {
            case ("GetAll"): {
                this.typeOfResult = TypeOfTasks.GetAll;
            }
            case ("Create"): {
                this.typeOfResult = TypeOfTasks.Create;
            }
            case ("Update"): {
                this.typeOfResult = TypeOfTasks.Update;
            }
            case ("Remove"): {
                this.typeOfResult = TypeOfTasks.Remove;
            }
        }
    }
}
