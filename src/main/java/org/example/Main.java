package org.example;

public class Main {
    public static void main(String[] args) {
        FileSystemCarModelService carModelService = new FileSystemCarModelServiceImpl();
        carModelService.load("src/main/resources/carModels.csv"); // Убедитесь, что файл находится по этому пути

        if (carModelService instanceof FileSystemCarModelServiceImpl) {
            var carModels = ((FileSystemCarModelServiceImpl) carModelService).getCarModels();
            for (var car : carModels) {
                System.out.println(car);
            }
        }
    }
}
