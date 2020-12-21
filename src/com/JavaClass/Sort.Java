package com.JavaClass;

class Sort extends Patient {

    public Sort(int id, String lastName, String name, String patronymic, String address, long phoneNumber, int numberOfMedicalCard, String diagnosis) {
        super(id, lastName, name, patronymic, address, phoneNumber, numberOfMedicalCard, diagnosis);
    }
    static void showWitchGastritis(Patient[] patients){
        System.out.println("\n"+ "Вывод пациентов с диагнозом хронинческий гастрит");
        for (Patient patient : patients)
            if (patient.getDiagnosis().trim().equals("Chronic gastritis")) {
                System.out.println(patient);
            }
    }
    static void showRangeNumberOfMedicalCard(Patient[] patients){
        System.out.println("\n" + "Вывод пациентов с номерами карт в диапазоне от 200 до 400");
        for (Patient patient : patients) {
            if (patient.getNumberOfMedicalCard() >200 && patient.getNumberOfMedicalCard() < 400) {
                System.out.println(patient);
            }
        }
    }
}
