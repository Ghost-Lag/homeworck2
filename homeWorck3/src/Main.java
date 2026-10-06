
void main() {
    // Задача 1

    String name="Сергей";
    int age=46;
    System.out.println("Меня зовут "+name+", мне "+age+" лет");

    System.out.println(" ");

    // Задача 2

    int a=7;
    int b=3;
    int perimetr=a*2+b*2;
    int area=a*b;

    System.out.println("perimetr = "+perimetr);
    System.out.println("area = "+area);

    System.out.println(" ");

    // Задача 3

    int number=324;
    System.out.println(number%2==0);
    System.out.println(number%5==0);

    System.out.println(" ");

    int x=20;
    System.out.println("Для 20:\n"+(x%2==0));
    System.out.println(x%5==0);

    System.out.println(" ");

    int y=35;
    System.out.println("Для 35:\n"+(y%2==0));
    System.out.println(y%5==0);

    System.out.println(" ");

    int z=42;
    System.out.println("Для 42:\n"+(z%2==0));
    System.out.println(z%5==0);

    System.out.println(" ");

    // Задача 4
    int count=10;
    count=count+1;
    count+=1;
    count++;

    count--;
    count--;

    System.out.println(count);

    System.out.println(" ");

    // Задача 5
    int steps= 5000;
    long wey=steps;
    System.out.println(wey);

    double price = 49.99;
    int wholePrice = (int) price;
    System.out.println(wholePrice);

}
