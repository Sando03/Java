import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();

        int size = 5;
        Monster[] arr = new Monster[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = MonsterFactory.createMonster(random);
        }


        float sum = 0;
        for(int i = 0; i < size; i++)
        {
            sum += arr[i].attack();
            System.out.print(arr[i].attack() + " ");
        }
        System.out.println();
        if(sum > 50)
        {
            System.out.println("Monsters won!");
        }else
        {
            System.out.println("Player won!");
        }

    }
}
