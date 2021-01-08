package com.TasksJavaRush.Course_16.Solution_21;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        switch (type) {
            case JPG:
                return new JpgReader();
            case PNG:
                return new PngReader();
            case BMP:
                return new BmpReader();
            default:
                throw new IllegalArgumentException();
        }
    }
}
