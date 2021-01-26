package com.java_exceptions;



import java.util.List;

public class University {

    public static double getAverageScoreStudent(Student student){
        return (double)(student.getBasedOnLogical() + student.getBasedOnPhilosophy()) / 2;
    }

    public static double getAverageScoreSubjectLogicalOnFacultyInGroup(List<List<Group>> subject){
        double averageScore = 0;
        for (List<Group> elem: subject) {
           averageScore += elem.get(0).getBasedOnLogical() + elem.get(1).getBasedOnLogical();

        }
        return averageScore /= 4;
    }

    public static double getAverageScoreOnPhilosophyInUniversity(List<List<Group>> faculty, List<List<Group>> facultyTwo){
        double averageScoreFaculty = 0;
        for (List<Group> elem: faculty) {
            averageScoreFaculty += elem.get(0).getBasedOnPhilosophy() + elem.get(1).getBasedOnPhilosophy();
        }

        double averageScoreFacultyTwo = 0;
        for (List<Group> elem: facultyTwo) {
            averageScoreFacultyTwo += elem.get(0).getBasedOnPhilosophy() + elem.get(1).getBasedOnPhilosophy();
        }
        return (averageScoreFaculty + averageScoreFacultyTwo) / 8;
    }

}
