import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int smallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;


        StringBuilder numbers = new StringBuilder("The random numbers generated are: ");

        int counter = 0;

        while (counter < 10)
        {
            int randomNumber = 1 + random.nextInt(100);

            numbers.append(randomNumber).append(" ");

            if (randomNumber < smallest)
            {
                smallest = randomNumber;
            }
            if (randomNumber > largest)
            {
                largest = randomNumber;
            }

            counter++;
        }


        System.out.println(numbers.toString().trim());

        System.out.println("Smallest Number: " + smallest);

        System.out.println("Largest Number: " + largest);
    }

    }
