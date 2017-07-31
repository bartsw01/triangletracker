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
            String sideA = bufferedReader.readLine();
            System.out.println("Side A of the triangle = " + sideA);

            System.out.println("Enter length of Triangle side B");
            String sideB = bufferedReader.readLine();
            System.out.println("Side B of the triangle = " + sideB);

            System.out.println("Enter length of Triangle side C");
            String sideC = bufferedReader.readLine();
            System.out.println("Side C of the triangle = " + sideC);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
