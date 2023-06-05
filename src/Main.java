import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число или нет
        String reg = "^[0-9]*[.]?[0-9]+$";

        //константы
        int x = 1;
        int y = 2;
        int z = 8;

        String size;
        do {
            System.out.println("Введите размер одномерного массива (0 нельзя): ");
            size = buffer.readLine();
        } while (!(size.matches(reg)) || size.equals("0"));
        int arraySize = Integer.parseInt(size);

        int[] myArray = new int[arraySize];

        String element;
        for(int i = 0; i < arraySize; i++){
            do {
                System.out.printf("Введите %s элемент массива: ", i+1);
                element = buffer.readLine();
            } while (!(element.matches(reg)));
            myArray[i] = Integer.parseInt(element);
        }

        int myCount=0;
        for(int i = 0; i < arraySize; i++){
            if(myArray[i] == x){
                System.out.println("В массиве есть элемент x = " + x + " под индексом " + i);
                myCount++;
            }
            if(myArray[i] == y){
                System.out.println("В массиве есть элемент y = " + y + " под индексом " + i);
                myCount++;
            }
            if(myArray[i] == z){
                System.out.println("В массиве есть элемент z = " + z + " под индексом " + i);
                myCount++;
            }
        }

        if(myCount==0){
            System.out.println("В массиве нет элементов x, y, z, равных " + x + " " + y + " " + z);
        }
    }
}