package com.ZadachiJavaRush.Course_16.Solution_31;
import com.ZadachiJavaRush.Course_16.Solution_31.common.*;

/*
1. Внимательно посмотри, какие классы у тебя есть.
2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые реализуют интерфейс ImageReader.
3. В отдельном файле в основном пакете создай класс ImageReaderFactory с одним методом.
3.1. Подумай, как он должен называться.
3.2. Подумай, какие модификаторы должны быть у этого метода.
4. Этот метод должен:
4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
4.2. Если передан неправильный параметр, то выбрасывать исключение IllegalArgumentException("Неизвестный тип картинки").
 */
public class Solution_31 {
    public void javaRush() throws Exception {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
