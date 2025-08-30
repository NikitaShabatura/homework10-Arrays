package practice.hospital;

import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperatures = new float[patientsCount];
        float minTemperature = 32.0F;
        float maxTemperature = 40.0F;

        for (int i = 0; i < patientsCount; i++) {
            patientsTemperatures[i] = new Random().nextFloat(maxTemperature - minTemperature) + minTemperature;
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String patientTemperatures = "";
        for (int i = 0; i < temperatureData.length; i++) {
            if (i == temperatureData.length - 1) {
                patientTemperatures += String.valueOf(temperatureData[i]);
                break;
            }
            patientTemperatures += String.valueOf(temperatureData[i]) + ' ';
        }

        float averageTemperature = 0.0f;
        for (int i = 0; i < temperatureData.length; i++) {
            averageTemperature += temperatureData[i];
        }
        float resultAverageTemperature = Math.round((averageTemperature / (float) temperatureData.length) * 100) / 100.0f;

        int healthyPatients = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] >= 36.2f && temperatureData[i] <= 36.9f) {
                healthyPatients++;
            }
        }


        String report =
            "Температуры пациентов: " + patientTemperatures +
            "\nСредняя температура: " + resultAverageTemperature +
            "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
