package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public CoffeeMachine()
    {
        water = 0;
        milk = 0;
        beans = 0;
    }

    public CoffeeMachine(int water, int milk, int beans, int cups, int money)
    {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater()
    {
        return water;
    }

    public void setWater(int water)
    {
        this.water = water;
    }

    public int getMilk()
    {
        return milk;
    }

    public void setMilk(int milk)
    {
        this.milk = milk;
    }

    public int getBeans()
    {
        return beans;
    }

    public void setBeans(int beans)
    {
        this.beans = beans;
    }

    public int getCups()
    {
        return cups;
    }

    public void setCups(int cups)
    {
        this.cups = cups;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(400, 540, 120, 9, 550);
        Input input = new Input();
        machine.action(input);
    }

    public void buyEspresso()
    {
        if ((getWater() - 250) < 0)
            System.out.println("Sorry, not enough water!");
        else if ((getBeans() - 16) < 0)
            System.out.println("Sorry, not enough coffee beans!");
        else if (getCups() == 0)
            System.out.println("Sorry, not enough disposable cups!");
        else
        {
            setWater(getWater() - 250);
            setBeans(getBeans() - 16);
            setCups(getCups() - 1);
            setMoney(getMoney() + 4);
        }
    }

    public void buyLatte()
    {
        if ((getWater() - 350) < 0)
            System.out.println("Sorry, not enough water!");
        else if ((getMilk() - 75) < 0)
            System.out.println("Sorry, not enough milk!");
        else if ((getBeans() - 20) < 0)
            System.out.println("Sorry, not enough coffee beans!");
        else if (getCups() == 0)
            System.out.println("Sorry, not enough disposable cups!");
        else
        {
            setWater(getWater() - 350);
            setMilk(getMilk() - 75);
            setBeans(getBeans() - 20);
            setCups(getCups() - 1);
            setMoney(getMoney() + 7);
        }
    }

    public void buyCappuccino()
    {
        if ((getWater() - 200) < 0)
            System.out.println("Sorry, not enough water!");
        else if ((getMilk() - 100) < 0)
            System.out.println("Sorry, not enough milk!");
        else if ((getBeans() - 12) < 0)
            System.out.println("Sorry, not enough coffee beans!");
        else if (getCups() == 0)
            System.out.println("Sorry, not enough disposable cups!");
        else
        {
            setWater(getWater() - 200);
            setMilk(getMilk() - 100);
            setBeans(getBeans() - 12);
            setCups(getCups() - 1);
            setMoney(getMoney() + 6);
        }
    }

    public void action(Input input)
    {
        boolean flag = false;

        while(!flag)
        {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String msg = input.getStringInput();

            switch (msg)
            {
                case "buy":
                    buy(input);
                    break;
                case "fill":
                    fill(input);
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    displayContents();
                    break;
                case "exit":
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }
    }

    public void buy(Input input)
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");

        switch (input.getStringInput())
        {
            case "1":
                buyEspresso();
                break;
            case "2":
                buyLatte();
                break;
            case "3":
                buyCappuccino();
                break;
            case "back":
                break;
            default:
                break;
        }
    }


    public void fill(Input input)
    {
        System.out.println("Write how many ml of water you want to add:");
        setWater(getWater() + input.getIntegerInput());
        System.out.println("Write how many ml of milk you want to add:");
        setMilk(getMilk() + input.getIntegerInput());
        System.out.println("Write how many grams of coffee beans you want to add:");
        setBeans(getBeans() + input.getIntegerInput());
        System.out.println("Write how many disposable cups you want to add:");
        setCups(getCups() + input.getIntegerInput());
    }

    public void displayContents()
    {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", getWater());
        System.out.printf("%d ml of milk\n", getMilk());
        System.out.printf("%d g of coffee beans\n", getBeans());
        System.out.printf("%d disposable cups\n", getCups());
        System.out.printf("$%d of money\n", getMoney());
        System.out.println();
    }

    public void takeMoney()
    {
        System.out.println("I gave you $" + getMoney());
        setMoney(0);
    }



    public static void phaseOne()
    {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

    public void ingredientCalculator(Input input)
    {
        System.out.println("How many cups of coffee you will need: ");
        int input1 = input.getIntegerInput();

        System.out.printf("For %d cups of coffee you will need:\n", input1);

        System.out.printf("%d ml of water\n", (input1 * 200));

        System.out.printf("%d ml of milk\n", (input1 * 50));

        System.out.printf("%d g f coffee beans\n", (input1 * 15));
    }

    public void ingredientCapacity(Input input)
    {
        System.out.println("Write how many ml of water the coffee machine has:");
        setWater(input.getIntegerInput());
        System.out.println("Write how many ml of milk the coffee machine has:");
        setMilk(input.getIntegerInput());
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        setBeans(input.getIntegerInput());
    }

    public void estimateServings(int cups)
    {
        int waterCups = this.water / 200;
        int milkCups = this.milk / 50;
        int beanCups = this.beans / 15;

        int temp = Math.min(waterCups, milkCups);
        int result = Math.min(temp, beanCups);

        if (result == cups)
            System.out.println("Yes, I can make that amount of coffee");
        else if (result > cups)
            System.out.println("Yes, I can make that amount of coffee (and even " + (result - cups) + " more than that)");
        else
            System.out.println("No, I can make only " + result + " cup(s) of coffee");

    }
}
