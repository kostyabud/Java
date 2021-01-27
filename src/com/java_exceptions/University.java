package com.java_exceptions;



import java.util.List;

public class University {


    public static double getAverageScoreStudent(Student student) throws Exception{
        if (student.getBasedOnLogical() < 0 || student.getBasedOnLogical() > 10
                || student.getBasedOnPhilosophy() < 0 || student.getBasedOnPhilosophy() > 10)
                    throw new Exception("Number < 0 or > 10");
        return (double)(student.getBasedOnLogical() + student.getBasedOnPhilosophy()) / 2;
    }

    public static double getAverageScoreSubjectLogicalOnFacultyInGroup(List<List<Group>> subject, int numberOfStudents){
        double averageScore = 0;
        for (List<Group> elem: subject) {
           averageScore += elem.get(0).getBasedOnLogical() + elem.get(1).getBasedOnLogical();

        }
        return averageScore /= numberOfStudents;
    }

    public static double getAverageScoreOnPhilosophyInUniversity(List<List<Group>> faculty, List<List<Group>> facultyTwo, int numberOfStudents){
        double averageScoreFaculty = 0;
        double averageScoreFacultyTwo = 0;

        for (List<Group> elem: faculty) {
            averageScoreFaculty += elem.get(0).getBasedOnPhilosophy() + elem.get(1).getBasedOnPhilosophy();
        }

        for (List<Group> elem: facultyTwo) {
            averageScoreFacultyTwo += elem.get(0).getBasedOnPhilosophy() + elem.get(1).getBasedOnPhilosophy();
        }

        return (averageScoreFaculty + averageScoreFacultyTwo) / numberOfStudents;
    }

}
