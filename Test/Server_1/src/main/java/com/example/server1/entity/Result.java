package com.example.server1.entity;

public class Result {
    private TypeOfTasks typeOfResult;

    public Result(String type) {
        switch (type) {
            case ("GetAll"): {
                this.typeOfResult = TypeOfTasks.GetAll;
                break;
            }
            case ("Create"): {
                this.typeOfResult = TypeOfTasks.Create;
                break;
            }
            case ("Update"): {
                this.typeOfResult = TypeOfTasks.Update;
                break;
            }
            case ("Remove"): {
                this.typeOfResult = TypeOfTasks.Remove;
                break;
            }
        }
    }
}
