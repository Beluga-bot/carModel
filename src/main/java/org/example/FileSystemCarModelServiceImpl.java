package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSystemCarModelServiceImpl implements FileSystemCarModelService {
    private List<CarModelDTO> carModels;

    public FileSystemCarModelServiceImpl() {
        carModels = new ArrayList<>();
    }

    @Override
    public void load(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Пропустим заголовок
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";"); // Используем запятую для разделения
                if (parts.length == 4) {
                    String make = parts[0].trim();
                    String model = parts[1].trim();
                    String countryOrigin = parts[2].trim();
                    String countryCode = parts[3].trim();
                    carModels.add(new CarModelDTO(make, model, countryOrigin, countryCode));
                    System.out.println("Loaded: " + make + " " + model); // Вывод для проверки
                } else {
                    System.out.println(line); // Вывод для проверки
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<CarModelDTO> getCarModels() {
        return carModels;
    }
}
