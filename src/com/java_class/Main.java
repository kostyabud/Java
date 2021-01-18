package com.java_class;


import static com.java_class.Sort.showRangeNumberOfMedicalCard;
import static com.java_class.Sort.showWitchGastritis;

public class Main {

    public static void main (String[] args){
        Patient [] patients = new Sort[7];
        patients[0] = new Sort(1, "Muravitskaya", "Anna", "Gennadevna", "Molodechno", 291544587, 101,"Chronic gastritis");
        patients[1] = new Sort(2, "Zarembo", "Ihor", "Vadimovich", "Molodechno", 291557547, 235,"pneumonia");
        patients[2] = new Sort(3, "Budko", "Michail", "Nikolaevich", "Koledzino", 296987458, 501,"pyelonephritis");
        patients[3] = new Sort(4, "Seledcov", "Vadim", "Nikitovich", "Koledzino", 291445878, 399,"Chronic gastritis");
        patients[4] = new Sort(5, "Grigorovich", "Karina", "Michailovna", "Nosilovo", 331557547, 158,"pneumonia");
        patients[5] = new Sort(6, "Gribitskiy", "Ihor", "Konstantsinovich", "Molodechno", 291577547, 335,"Chronic gastritis");
        patients[6] = new Sort(7, "Zarembo", "Ihor", "vadimovich", "Nosilovo", 331557547, 516,"Chronic gastritis");
        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }
        showRangeNumberOfMedicalCard(patients);
        showWitchGastritis(patients);


    }

}
