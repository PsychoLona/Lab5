import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите вариант:");
            System.out.println("1. Работа с автомобилями");
            System.out.println("2. Работа с фильмами");
            System.out.println("3. Работа с людьми (одежда)");
            System.out.println("4. Работа с товарами");
            System.out.println("5. Работа с футбольными командами");
            System.out.println("6. Работа с горами");
            System.out.println("7. Работа с людьми (рост)");
            System.out.println("8. Работа с людьми (дата рождения)");
            System.out.println("9. Работа с певцами");
            System.out.println("10. Работа с озерами");
            System.out.println("11. Работа с театрами");
            System.out.println("12. Работа с реками");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Вызов методов для работы с автомобилями
                    carOperations();
                    break;
                case 2:
                    // Вызов методов для работы с фильмами
                    movieOperations();
                    break;
                case 3:
                    // Вызов методов для работы с людьми (одежда)
                    personClothingOperations();
                    break;
                case 4:
                    // Вызов методов для работы с товарами
                    productOperations();
                    break;
                case 5:
                    // Вызов методов для работы с футбольными командами
                    footballTeamOperations();
                    break;
                case 6:
                    // Вызов методов для работы с горами
                    mountainOperations();
                    break;
                case 7:
                    // Вызов методов для работы с людьми (рост)
                    personHeightOperations();
                    break;
                case 8:
                    // Вызов методов для работы с людьми (дата рождения)
                    personBirthOperations();
                    break;
                case 9:
                    // Вызов методов для работы с певцами
                    singerOperations();
                    break;
                case 10:
                    // Вызов методов для работы с озерами
                    lakeOperations();
                    break;
                case 11:
                    // Вызов методов для работы с театрами
                    theaterOperations();
                    break;
                case 12:
                    // Вызов методов для работы с реками
                    riverOperations();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void carOperations() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Model A", "123ABC", 2010, 150000, 5000));
        cars.add(new Car("Model B", "456DEF", 2015, 100000, 8000));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с автомобилями:");
            System.out.println("1. Вывести список автомобилей");
            System.out.println("2. Добавить новый автомобиль");
            System.out.println("3. Найти автомобиль по модели");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Car car : cars) {
                        System.out.println(car);
                    }
                    break;
                case 2:
                    System.out.println("Введите модель, регистрационный номер, год, пробег и цену через пробел:");
                    String model = scanner.next();
                    String regNumber = scanner.next();
                    int year = scanner.nextInt();
                    int mileage = scanner.nextInt();
                    double price = scanner.nextDouble();
                    cars.add(new Car(model, regNumber, year, mileage, price));
                    System.out.println("Автомобиль добавлен.");
                    break;
                case 3:
                    System.out.println("Введите модель для поиска:");
                    String searchModel = scanner.next();
                    boolean found = false;
                    for (Car car : cars) {
                        if (car.getModel().equalsIgnoreCase(searchModel)) {
                            System.out.println("Найден автомобиль:");
                            System.out.println(car);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Автомобиль с моделью '" + searchModel + "' не найден.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }



    private static void movieOperations() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010, "USA", "Sci-Fi", 5.99));
        movies.add(new Movie("Parasite", 2019, "South Korea", "Thriller", 4.99));
        movies.add(new Movie("The Godfather", 1972, "USA", "Crime", 3.99));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с фильмами:");
            System.out.println("1. Вывести список фильмов");
            System.out.println("2. Добавить новый фильм");
            System.out.println("3. Найти фильм по названию");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie);
                    }
                    break;
                case 2:
                    System.out.println("Введите название, год выпуска, страну, жанр и стоимость через пробел:");
                    String title = scanner.next();
                    int year = scanner.nextInt();
                    String country = scanner.next();
                    String genre = scanner.next();
                    double rentalCost = scanner.nextDouble();
                    movies.add(new Movie(title, year, country, genre, rentalCost));
                    System.out.println("Фильм добавлен.");
                    break;
                case 3:
                    System.out.println("Введите название для поиска:");
                    String searchTitle = scanner.next();
                    boolean found = false;
                    for (Movie movie : movies) {
                        if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println("Найден фильм:");
                            System.out.println(movie);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Фильм с названием '" + searchTitle + "' не найден.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }


    private static void personClothingOperations() {
        ArrayList<Person3> people3 = new ArrayList<>();
        people3.add(new Person3("Иванов", "Иван", "Иванович", 42, 50));
        people3.add(new Person3("Петров", "Петр", "Петрович", 36, 52));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с людьми (одежда):");
            System.out.println("1. Вывести список людей и их одежды");
            System.out.println("2. Добавить нового человека и его одежду");
            System.out.println("3. Найти человека по фамилии");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Person3 person : people3) {
                        System.out.println(person);
                    }
                    break;
                case 2:
                    System.out.println("Введите фамилию, имя, возраст и размер одежды через пробел:");
                    String lastName = scanner.next();
                    String firstName = scanner.next();
                    String middleName = scanner.next();
                    int age = Integer.parseInt(scanner.next());
                    int clothingSize = Integer.parseInt(scanner.next());
                    people3.add(new Person3(lastName, firstName, middleName, age, clothingSize));
                    System.out.println("Человек и его размер одежды добавлены.");
                    break;
                case 3:
                    System.out.println("Введите фамилию для поиска:");
                    String searchLastName = scanner.next();
                    boolean found = false;
                    for (Person3 person : people3) {
                        if (person.getLastName().equalsIgnoreCase(searchLastName)) {
                            System.out.println("Найден человек:");
                            System.out.println(person);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Человек с фамилией '" + searchLastName + "' не найден.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }


    private static void productOperations() {
        ArrayList<Product4> products = new ArrayList<>();
        products.add(new Product4("Laptop", "ASUS", (int) 1500.0, 5));
        products.add(new Product4("Smartphone", "Samsung", (int) 1000.0, 10));
        products.add(new Product4("Headphones", "Sony", (int) 200.0, 20));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с товарами:");
            System.out.println("1. Вывести список товаров");
            System.out.println("2. Добавить новый товар");
            System.out.println("3. Найти товар по названию");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Product4 product : products) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.println("Введите название, производителя, цену и количество через пробел:");
                    String name = scanner.next();
                    String manufacturer = scanner.next();
                    double price = scanner.nextDouble();
                    int quantity = scanner.nextInt();
                    products.add(new Product4(name, manufacturer, price, quantity));
                    System.out.println("Товар добавлен.");
                    break;
                case 3:
                    System.out.println("Введите название для поиска:");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Product4 product : products) {
                        if (product.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Найден товар:");
                            System.out.println(product);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Товар с названием '" + searchName + "' не найден.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void footballTeamOperations() {
        ArrayList<FootballTeam5> teams = new ArrayList<>();
        teams.add(new FootballTeam5("Liverpool", "Liverpool", 1, 30));
        teams.add(new FootballTeam5("Manchester City", "Manchester", 2, 28));
        teams.add(new FootballTeam5("Chelsea", "London", 3, 25));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с футбольными командами:");
            System.out.println("1. Вывести список команд");
            System.out.println("2. Добавить новую команду");
            System.out.println("3. Найти команду по названию");
            System.out.println("4. Изменить информацию о команде");
            System.out.println("5. Команда с наибольшим количеством побед");
            System.out.println("6. Команды с количеством побед больше среднего");
            System.out.println("7. Упорядочить по местам в лиге (по убыванию)");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (FootballTeam5 team : teams) {
                        System.out.println(team);
                    }
                    break;
                case 2:
                    System.out.println("Введите название, город, место в лиге и количество побед через пробел:");
                    String name = scanner.next();
                    String city = scanner.next();
                    int leaguePosition = scanner.nextInt();
                    int numberOfWins = scanner.nextInt();
                    teams.add(new FootballTeam5(name, city, leaguePosition, numberOfWins));
                    System.out.println("Команда добавлена.");
                    break;
                case 3:
                    System.out.println("Введите название команды для поиска:");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (FootballTeam5 team : teams) {
                        if (team.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Найдена команда:");
                            System.out.println(team);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Команда с названием '" + searchName + "' не найдена.");
                    }
                    break;
                case 4:
                    System.out.println("Введите название команды для изменения информации:");
                    String editName = scanner.next();
                    found = false;
                    for (FootballTeam5 team : teams) {
                        if (team.getName().equalsIgnoreCase(editName)) {
                            System.out.println("Введите новое название, город, место в лиге и количество побед через пробел:");
                            team.setName(scanner.next());
                            team.setCity(scanner.next());
                            team.setLeaguePosition(scanner.nextInt());
                            team.setWins(scanner.nextInt());
                            System.out.println("Информация о команде '" + editName + "' изменена.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Команда с названием '" + editName + "' не найдена для изменения информации.");
                    }
                    break;
                case 5:
                    int maxWins = Integer.MIN_VALUE;
                    FootballTeam5 teamWithMaxWins = null;
                    for (FootballTeam5 team : teams) {
                        if (team.getWins() > maxWins) {
                            maxWins = team.getWins();
                            teamWithMaxWins = team;
                        }
                    }
                    if (teamWithMaxWins != null) {
                        System.out.println("Команда с наибольшим количеством побед:");
                        System.out.println(teamWithMaxWins);
                    } else {
                        System.out.println("Нет данных о командах.");
                    }
                    break;
                case 6:
                    double averageWins = teams.stream().mapToInt(FootballTeam5::getWins).average().orElse(0.0);
                    System.out.println("Команды с количеством побед больше среднего (" + averageWins + "):");
                    boolean anyFound = false;
                    for (FootballTeam5 team : teams) {
                        if (team.getWins() > averageWins) {
                            System.out.println(team);
                            anyFound = true;
                        }
                    }
                    if (!anyFound) {
                        System.out.println("Нет таких команд.");
                    }
                    break;
                case 7:
                    teams.sort((t1, t2) -> t2.getLeaguePosition() - t1.getLeaguePosition());
                    System.out.println("Команды упорядочены по местам в лиге (по убыванию):");
                    for (FootballTeam5 team : teams) {
                        System.out.println(team);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }


    private static void mountainOperations() {
        ArrayList<Mountain6> mountains = new ArrayList<>();
        mountains.add(new Mountain6("Everest", "Himalayas", 8848));
        mountains.add(new Mountain6("K2", "Karakoram", 8611));
        mountains.add(new Mountain6("Kangchenjunga", "Himalayas", 8586));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с горами:");
            System.out.println("1. Вывести список вершин");
            System.out.println("2. Добавить новую вершину");
            System.out.println("3. Найти вершину по названию");
            System.out.println("4. Изменить информацию о вершине");
            System.out.println("5. Определить самую высокую вершину");
            System.out.println("6. Вывести вершины с высотой более 1000 м");
            System.out.println("7. Упорядочить по возрастанию высоты");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Mountain6 mountain : mountains) {
                        System.out.println(mountain);
                    }
                    break;
                case 2:
                    System.out.println("Введите название, место расположения и высоту вершины через пробел:");
                    String name = scanner.next();
                    String location = scanner.next();
                    int height = scanner.nextInt();
                    mountains.add(new Mountain6(name, location, height));
                    System.out.println("Вершина добавлена.");
                    break;
                case 3:
                    System.out.println("Введите название вершины для поиска:");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Mountain6 mountain : mountains) {
                        if (mountain.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Найдена вершина:");
                            System.out.println(mountain);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Вершина с названием '" + searchName + "' не найдена.");
                    }
                    break;
                case 4:
                    System.out.println("Введите название вершины для изменения информации:");
                    String editName = scanner.next();
                    found = false;
                    for (Mountain6 mountain : mountains) {
                        if (mountain.getName().equalsIgnoreCase(editName)) {
                            System.out.println("Введите новое название, место расположения и высоту вершины через пробел:");
                            mountain.setName(scanner.next());
                            mountain.setLocation(scanner.next());
                            mountain.setHeight(scanner.nextInt());
                            System.out.println("Информация о вершине '" + editName + "' изменена.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Вершина с названием '" + editName + "' не найдена для изменения информации.");
                    }
                    break;
                case 5:
                    int maxHeight = Integer.MIN_VALUE;
                    Mountain6 highestMountain = null;
                    for (Mountain6 mountain : mountains) {
                        if (mountain.getHeight() > maxHeight) {
                            maxHeight = mountain.getHeight();
                            highestMountain = mountain;
                        }
                    }
                    if (highestMountain != null) {
                        System.out.println("Самая высокая вершина:");
                        System.out.println(highestMountain);
                    } else {
                        System.out.println("Нет данных о вершинах.");
                    }
                    break;
                case 6:
                    System.out.println("Вершины с высотой более 1000 м:");
                    boolean anyFound = false;
                    for (Mountain6 mountain : mountains) {
                        if (mountain.getHeight() > 1000) {
                            System.out.println(mountain);
                            anyFound = true;
                        }
                    }
                    if (!anyFound) {
                        System.out.println("Нет таких вершин.");
                    }
                    break;
                case 7:
                    Collections.sort(mountains, (m1, m2) -> m1.getHeight() - m2.getHeight());
                    System.out.println("Вершины упорядочены по возрастанию высоты:");
                    for (Mountain6 mountain : mountains) {
                        System.out.println(mountain);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void personHeightOperations() {
        ArrayList<Person7> people = new ArrayList<>();
        people.add(new Person7("Smith", "John", "Male", 180));
        people.add(new Person7("Johnson", "Emily", "Female", 165));
        people.add(new Person7("Brown", "Michael", "Male", 175));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с людьми (рост):");
            System.out.println("1. Вывести список людей");
            System.out.println("2. Добавить нового человека");
            System.out.println("3. Найти человека по фамилии");
            System.out.println("4. Изменить информацию о человеке");
            System.out.println("5. Определить средний рост женщин и мужчин");
            System.out.println("6. Определить самого высокого мужчину");
            System.out.println("7. Упорядочить список по возрастанию роста");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Person7 person : people) {
                        System.out.println(person);
                    }
                    break;
                case 2:
                    System.out.println("Введите фамилию, имя, пол и рост через пробел:");
                    String lastName = scanner.next();
                    String firstName = scanner.next();
                    String gender = scanner.next();
                    int height = scanner.nextInt();
                    people.add(new Person7(lastName, firstName, gender, height));
                    System.out.println("Человек добавлен.");
                    break;
                case 3:
                    System.out.println("Введите фамилию для поиска:");
                    String searchLastName = scanner.next();
                    boolean found = false;
                    for (Person7 person : people) {
                        if (person.getLastName().equalsIgnoreCase(searchLastName)) {
                            System.out.println("Найден человек:");
                            System.out.println(person);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Человек с фамилией '" + searchLastName + "' не найден.");
                    }
                    break;
                case 4:
                    System.out.println("Введите фамилию человека для изменения информации:");
                    String editLastName = scanner.next();
                    found = false;
                    for (Person7 person : people) {
                        if (person.getLastName().equalsIgnoreCase(editLastName)) {
                            System.out.println("Введите новую фамилию, имя, пол и рост через пробел:");
                            person.setLastName(scanner.next());
                            person.setFirstName(scanner.next());
                            person.setGender(scanner.next());
                            person.setHeight(scanner.nextInt());
                            System.out.println("Информация о человеке '" + editLastName + "' изменена.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Человек с фамилией '" + editLastName + "' не найден для изменения информации.");
                    }
                    break;
                case 5:
                    int totalHeightMale = 0;
                    int countMale = 0;
                    int totalHeightFemale = 0;
                    int countFemale = 0;
                    for (Person7 person : people) {
                        if (person.getGender().equalsIgnoreCase("male")) {
                            totalHeightMale += person.getHeight();
                            countMale++;
                        } else if (person.getGender().equalsIgnoreCase("female")) {
                            totalHeightFemale += person.getHeight();
                            countFemale++;
                        }
                    }
                    if (countMale > 0) {
                        double averageHeightMale = (double) totalHeightMale / countMale;
                        System.out.println("Средний рост мужчин: " + averageHeightMale);
                    } else {
                        System.out.println("Нет данных о мужчинах.");
                    }
                    if (countFemale > 0) {
                        double averageHeightFemale = (double) totalHeightFemale / countFemale;
                        System.out.println("Средний рост женщин: " + averageHeightFemale);
                    } else {
                        System.out.println("Нет данных о женщинах.");
                    }
                    break;
                case 6:
                    int maxHeightMale = Integer.MIN_VALUE;
                    Person7 tallestMale = null;
                    for (Person7 person : people) {
                        if (person.getGender().equalsIgnoreCase("male") && person.getHeight() > maxHeightMale) {
                            maxHeightMale = person.getHeight();
                            tallestMale = person;
                        }
                    }
                    if (tallestMale != null) {
                        System.out.println("Самый высокий мужчина:");
                        System.out.println(tallestMale);
                    } else {
                        System.out.println("Нет данных о мужчинах.");
                    }
                    break;
                case 7:
                    Collections.sort(people, (p1, p2) -> p1.getHeight() - p2.getHeight());
                    System.out.println("Список людей упорядочен по возрастанию роста:");
                    for (Person7 person : people) {
                        System.out.println(person);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void personBirthOperations() {
        ArrayList<Person8> people = new ArrayList<>();
        people.add(new Person8("Smith", "John", 1980, 5));
        people.add(new Person8("Johnson", "Emily", 1975, 8));
        people.add(new Person8("Brown", "Michael", 1990, 2));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с людьми (дата рождения):");
            System.out.println("1. Вывести список людей");
            System.out.println("2. Добавить нового человека");
            System.out.println("3. Найти человека по фамилии");
            System.out.println("4. Изменить информацию о человеке");
            System.out.println("5. Определить самого старого человека");
            System.out.println("6. Определить средний возраст и людей старше среднего возраста");
            System.out.println("7. Упорядочить список по фамилиям в порядке, обратном алфавитному");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Person8 person : people) {
                        System.out.println(person);
                    }
                    break;
                case 2:
                    System.out.println("Введите фамилию, имя, год рождения и месяц рождения через пробел:");
                    String lastName = scanner.next();
                    String firstName = scanner.next();
                    int birthYear = scanner.nextInt();
                    int birthMonth = scanner.nextInt();
                    people.add(new Person8(lastName, firstName, birthYear, birthMonth));
                    System.out.println("Человек добавлен.");
                    break;
                case 3:
                    System.out.println("Введите фамилию для поиска:");
                    String searchLastName = scanner.next();
                    boolean found = false;
                    for (Person8 person : people) {
                        if (person.getLastName().equalsIgnoreCase(searchLastName)) {
                            System.out.println("Найден человек:");
                            System.out.println(person);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Человек с фамилией '" + searchLastName + "' не найден.");
                    }
                    break;
                case 4:
                    System.out.println("Введите фамилию человека для изменения информации:");
                    String editLastName = scanner.next();
                    found = false;
                    for (Person8 person : people) {
                        if (person.getLastName().equalsIgnoreCase(editLastName)) {
                            System.out.println("Введите новую фамилию, имя, год рождения и месяц рождения через пробел:");
                            person.setLastName(scanner.next());
                            person.setFirstName(scanner.next());
                            person.setBirthYear(scanner.nextInt());
                            person.setBirthMonth(scanner.nextInt());
                            System.out.println("Информация о человеке изменена.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Человек с фамилией '" + editLastName + "' не найден.");
                    }
                    break;
                case 5:
                    int maxBirthYear = Integer.MIN_VALUE;
                    Person8 oldestPerson = null;
                    for (Person8 person : people) {
                        if (person.getBirthYear() > maxBirthYear) {
                            maxBirthYear = person.getBirthYear();
                            oldestPerson = person;
                        }
                    }
                    if (oldestPerson != null) {
                        System.out.println("Самый старый человек:");
                        System.out.println(oldestPerson);
                    } else {
                        System.out.println("Список людей пуст.");
                    }
                    break;
                case 6:
                    int totalBirthYear = 0;
                    for (Person8 person : people) {
                        totalBirthYear += person.getBirthYear();
                    }
                    double averageBirthYear = (double) totalBirthYear / people.size();
                    System.out.println("Средний возраст (используется только год рождения): " + averageBirthYear);

                    System.out.println("Люди старше среднего возраста:");
                    for (Person8 person : people) {
                        if (person.getBirthYear() < averageBirthYear) {
                            System.out.println(person);
                        }
                    }
                    break;
                case 7:
                    Collections.sort(people, (p1, p2) -> p2.getLastName().compareToIgnoreCase(p1.getLastName()));
                    System.out.println("Список людей упорядочен по фамилиям в порядке, обратном алфавитному:");
                    for (Person8 person : people) {
                        System.out.println(person);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void singerOperations() {
        ArrayList<Singer9> singers = new ArrayList<>();
        singers.add(new Singer9("John Lennon", 4.5, 9));
        singers.add(new Singer9("Freddie Mercury", 4.8, 15));
        singers.add(new Singer9("Adele", 4.7, 5));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с певцами:");
            System.out.println("1. Вывести список певцов");
            System.out.println("2. Добавить нового певца");
            System.out.println("3. Найти певца по имени");
            System.out.println("4. Изменить информацию о певце");
            System.out.println("5. Определить самого популярного исполнителя");
            System.out.println("6. Определить среднее количество выпущенных альбомов и исполнителей с количеством выпущенных альбомов больше среднего");
            System.out.println("7. Упорядочить список по фамилиям исполнителей в порядке, обратном алфавитному");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Singer9 singer : singers) {
                        System.out.println(singer);
                    }
                    break;
                case 2:
                    System.out.println("Введите имя исполнителя, рейтинг и количество выпущенных альбомов через пробел:");
                    String name = scanner.next();
                    double rating = scanner.nextDouble();
                    int albumsReleased = scanner.nextInt();
                    singers.add(new Singer9(name, rating, albumsReleased));
                    System.out.println("Исполнитель добавлен.");
                    break;
                case 3:
                    System.out.println("Введите имя для поиска:");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Singer9 singer : singers) {
                        if (singer.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Найден исполнитель:");
                            System.out.println(singer);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Исполнитель с именем '" + searchName + "' не найден.");
                    }
                    break;
                case 4:
                    System.out.println("Введите имя исполнителя для изменения информации:");
                    String editName = scanner.next();
                    found = false;
                    for (Singer9 singer : singers) {
                        if (singer.getName().equalsIgnoreCase(editName)) {
                            System.out.println("Введите новое имя, рейтинг и количество выпущенных альбомов через пробел:");
                            singer.setName(scanner.next());
                            singer.setRating(scanner.nextDouble());
                            singer.setAlbumsReleased(scanner.nextInt());
                            System.out.println("Информация о певце изменена.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Исполнитель с именем '" + editName + "' не найден.");
                    }
                    break;
                case 5:
                    double maxRating = Double.MIN_VALUE;
                    Singer9 mostPopular = null;
                    for (Singer9 singer : singers) {
                        if (singer.getRating() > maxRating) {
                            maxRating = singer.getRating();
                            mostPopular = singer;
                        }
                    }
                    if (mostPopular != null) {
                        System.out.println("Самый популярный исполнитель:");
                        System.out.println(mostPopular);
                    } else {
                        System.out.println("Список певцов пуст.");
                    }
                    break;
                case 6:
                    int totalAlbums = 0;
                    for (Singer9 singer : singers) {
                        totalAlbums += singer.getAlbumsReleased();
                    }
                    double averageAlbums = (double) totalAlbums / singers.size();
                    System.out.println("Среднее количество выпущенных альбомов: " + averageAlbums);

                    System.out.println("Исполнители с количеством выпущенных альбомов больше среднего:");
                    for (Singer9 singer : singers) {
                        if (singer.getAlbumsReleased() > averageAlbums) {
                            System.out.println(singer);
                        }
                    }
                    break;
                case 7:
                    Collections.sort(singers, (s1, s2) -> s2.getName().compareToIgnoreCase(s1.getName()));
                    System.out.println("Список певцов упорядочен по имени в порядке, обратном алфавитному:");
                    for (Singer9 singer : singers) {
                        System.out.println(singer);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void lakeOperations() {
        ArrayList<Lake10> lakes = new ArrayList<>();
        lakes.add(new Lake10("Baikal", "Russia", 31500));
        lakes.add(new Lake10("Victoria", "Africa", 68870));
        lakes.add(new Lake10("Superior", "North America", 82100));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с озерами:");
            System.out.println("1. Вывести список озер");
            System.out.println("2. Добавить новое озеро");
            System.out.println("3. Найти озеро по названию");
            System.out.println("4. Изменить информацию об озере");
            System.out.println("5. Определить самое большое озеро");
            System.out.println("6. Подсчитать количество озер с площадью меньше средней");
            System.out.println("7. Упорядочить список по названиям");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Lake10 lake : lakes) {
                        System.out.println(lake);
                    }
                    break;
                case 2:
                    System.out.println("Введите название озера, место расположения и площадь через пробел:");
                    String name = scanner.next();
                    String location = scanner.next();
                    double area = scanner.nextDouble();
                    lakes.add(new Lake10(name, location, area));
                    System.out.println("Озеро добавлено.");
                    break;
                case 3:
                    System.out.println("Введите название для поиска:");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Lake10 lake : lakes) {
                        if (lake.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Найдено озеро:");
                            System.out.println(lake);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Озеро с названием '" + searchName + "' не найдено.");
                    }
                    break;
                case 4:
                    System.out.println("Введите название озера для изменения информации:");
                    String editName = scanner.next();
                    found = false;
                    for (Lake10 lake : lakes) {
                        if (lake.getName().equalsIgnoreCase(editName)) {
                            System.out.println("Введите новое название, место расположения и площадь через пробел:");
                            lake.setName(scanner.next());
                            lake.setLocation(scanner.next());
                            lake.setArea(scanner.nextDouble());
                            System.out.println("Информация об озере изменена.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Озеро с названием '" + editName + "' не найдено.");
                    }
                    break;
                case 5:
                    Lake10 largestLake = null;
                    double maxArea = Double.MIN_VALUE;
                    for (Lake10 lake : lakes) {
                        if (lake.getArea() > maxArea) {
                            maxArea = lake.getArea();
                            largestLake = lake;
                        }
                    }
                    if (largestLake != null) {
                        System.out.println("Самое большое озеро:");
                        System.out.println(largestLake);
                    } else {
                        System.out.println("Список озер пуст.");
                    }
                    break;
                case 6:
                    double totalArea = 0;
                    for (Lake10 lake : lakes) {
                        totalArea += lake.getArea();
                    }
                    double averageArea = totalArea / lakes.size();
                    int countBelowAverage = 0;
                    for (Lake10 lake : lakes) {
                        if (lake.getArea() < averageArea) {
                            countBelowAverage++;
                        }
                    }
                    System.out.println("Количество озер с площадью меньше средней: " + countBelowAverage);
                    break;
                case 7:
                    Collections.sort(lakes, (l1, l2) -> l1.getName().compareToIgnoreCase(l2.getName()));
                    System.out.println("Список озер упорядочен по названиям:");
                    for (Lake10 lake : lakes) {
                        System.out.println(lake);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }


    private static void theaterOperations() {
        ArrayList<Theater11> theaters = new ArrayList<>();
        theaters.add(new Theater11("Bolshoi Theatre", "Vladimir Urin", "Moscow", 4.8));
        theaters.add(new Theater11("Royal Opera House", "Antonio Pappano", "London", 4.7));
        theaters.add(new Theater11("La Scala", "Dominique Meyer", "Milan", 4.6));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с театрами:");
            System.out.println("1. Вывести список театров");
            System.out.println("2. Добавить новый театр");
            System.out.println("3. Найти театр с самым большим рейтингом");
            System.out.println("4. Упорядочить список по названиям в обратном порядке");
            System.out.println("5. Поиск по фамилии художественного руководителя, изменение информации и вывод");
            System.out.println("6. Вывести театры с рейтингом выше заданного");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Theater11 theater : theaters) {
                        System.out.println(theater);
                    }
                    break;
                case 2:
                    System.out.println("Введите название, художественного руководителя, адрес и рейтинг через пробел:");
                    String name = scanner.next();
                    String artisticDirector = scanner.next();
                    String address = scanner.next();
                    double rating = scanner.nextDouble();
                    theaters.add(new Theater11(name, artisticDirector, address, rating));
                    System.out.println("Театр добавлен.");
                    break;
                case 3:
                    Theater11 highestRatedTheater = null;
                    double maxRating = Double.MIN_VALUE;
                    for (Theater11 theater : theaters) {
                        if (theater.getRating() > maxRating) {
                            maxRating = theater.getRating();
                            highestRatedTheater = theater;
                        }
                    }
                    if (highestRatedTheater != null) {
                        System.out.println("Театр с самым большим рейтингом:");
                        System.out.println(highestRatedTheater);
                    } else {
                        System.out.println("Список театров пуст.");
                    }
                    break;
                case 4:
                    Collections.sort(theaters, (t1, t2) -> t2.getName().compareToIgnoreCase(t1.getName()));
                    System.out.println("Список театров упорядочен по названиям в обратном порядке:");
                    for (Theater11 theater : theaters) {
                        System.out.println(theater);
                    }
                    break;
                case 5:
                    System.out.println("Введите фамилию художественного руководителя для поиска:");
                    String searchDirector = scanner.next();
                    boolean foundDirector = false;
                    for (Theater11 theater : theaters) {
                        if (theater.getArtisticDirector().equalsIgnoreCase(searchDirector)) {
                            System.out.println("Найден театр:");
                            System.out.println(theater);
                            foundDirector = true;
                            System.out.println("Введите новое название, художественного руководителя, адрес и рейтинг через пробел:");
                            name = scanner.next();
                            artisticDirector = scanner.next();
                            address = scanner.next();
                            rating = scanner.nextDouble();
                            theater.setName(name);
                            theater.setArtisticDirector(artisticDirector);
                            theater.setAddress(address);
                            theater.setRating(rating);
                            System.out.println("Информация о театре обновлена:");
                            System.out.println(theater);
                            break;
                        }
                    }
                    if (!foundDirector) {
                        System.out.println("Театр с художественным руководителем '" + searchDirector + "' не найден.");
                    }
                    break;
                case 6:
                    System.out.println("Введите рейтинг для поиска театров с более высоким рейтингом:");
                    double searchRating = scanner.nextDouble();
                    boolean foundHigherRated = false;
                    for (Theater11 theater : theaters) {
                        if (theater.getRating() > searchRating) {
                            if (!foundHigherRated) {
                                System.out.println("Театры с рейтингом выше " + searchRating + ":");
                                foundHigherRated = true;
                            }
                            System.out.println(theater);
                        }
                    }
                    if (!foundHigherRated) {
                        System.out.println("Нет театров с рейтингом выше " + searchRating);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void riverOperations() {
        ArrayList<River12> rivers = new ArrayList<>();
        rivers.add(new River12("Nile", "Africa", 6650));
        rivers.add(new River12("Amazon", "South America", 6992));
        rivers.add(new River12("Danube", "Europe", 2850));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию для работы с реками:");
            System.out.println("1. Вывести список рек");
            System.out.println("2. Добавить новую реку");
            System.out.println("3. Найти самую короткую реку");
            System.out.println("4. Вывести информацию о реках с длиной больше средней");
            System.out.println("5. Упорядочить список по названиям в алфавитном порядке");
            System.out.println("6. Поиск по названию реки, изменение информации и вывод");
            System.out.println("0. Вернуться в главное меню");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (River12 river : rivers) {
                        System.out.println(river);
                    }
                    break;
                case 2:
                    System.out.println("Введите название, место расположения и длину реки через пробел:");
                    String name = scanner.next();
                    String location = scanner.next();
                    double length = scanner.nextDouble();
                    rivers.add(new River12(name, location, length));
                    System.out.println("Река добавлена.");
                    break;
                case 3:
                    River12 shortestRiver = null;
                    double minLength = Double.MAX_VALUE;
                    for (River12 river : rivers) {
                        if (river.getLength() < minLength) {
                            minLength = river.getLength();
                            shortestRiver = river;
                        }
                    }
                    if (shortestRiver != null) {
                        System.out.println("Самая короткая река:");
                        System.out.println(shortestRiver);
                    } else {
                        System.out.println("Список рек пуст.");
                    }
                    break;
                case 4:
                    double totalLength = 0;
                    for (River12 river : rivers) {
                        totalLength += river.getLength();
                    }
                    double averageLength = totalLength / rivers.size();
                    System.out.println("Средняя длина рек: " + averageLength);
                    System.out.println("Реки с длиной больше средней:");
                    for (River12 river : rivers) {
                        if (river.getLength() > averageLength) {
                            System.out.println(river);
                        }
                    }
                    break;
                case 5:
                    Collections.sort(rivers, (r1, r2) -> r1.getName().compareToIgnoreCase(r2.getName()));
                    System.out.println("Список рек упорядочен по названиям в алфавитном порядке:");
                    for (River12 river : rivers) {
                        System.out.println(river);
                    }
                    break;
                case 6:
                    System.out.println("Введите название реки для поиска:");
                    String searchName = scanner.next();
                    boolean foundRiver = false;
                    for (River12 river : rivers) {
                        if (river.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Найдена река:");
                            System.out.println(river);
                            foundRiver = true;
                            System.out.println("Введите новое название, место расположения и длину через пробел:");
                            name = scanner.next();
                            location = scanner.next();
                            length = scanner.nextDouble();
                            river.setName(name);
                            river.setLocation(location);
                            river.setLength(length);
                            System.out.println("Информация о реке обновлена:");
                            System.out.println(river);
                            break;
                        }
                    }
                    if (!foundRiver) {
                        System.out.println("Река с названием '" + searchName + "' не найдена.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}
