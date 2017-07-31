import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class Triangle {
    public static void main(String[] args) {
        try{

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter length of Triangle side A");
            Integer integerSideA = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter length of Triangle side B");
            Integer integerSideB = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter length of Triangle side C");
            Integer integerSideC = Integer.parseInt(bufferedReader.readLine());

            boolean equilateralAB = integerSideA.equals(integerSideB);
            boolean equilateralAC = integerSideA.equals(integerSideC);

            if (equilateralAB && equilateralAC){
                System.out.println("This is equilateral triangle");
            } else {
                System.out.println("This is might be a triangle");

            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
