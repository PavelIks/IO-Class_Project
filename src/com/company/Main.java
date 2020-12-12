package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class User
{
    String Name;
    String Surname;
    Integer Age;
    User(String name, String surname, Integer age)
    {
        this.Name = name;
        this.Surname = surname;
        this.Age = age;
    }
    @Override
    public String toString()
    {
        return Name + ", " + Surname + ", " + Age;
    }
}
class Score
{
    int Account_number;
    double Balance;
    Score(int account_number, double balance)
    {
        this.Account_number = account_number;
        this.Balance = balance;
    }
}

class Account_history
{
    String Date_of_operation;
    String Operation;
    String Status;
    int User_ID;
    Account_history(String date_of_operation, String operation, String status, int user_ID)
    {
        this.Date_of_operation = date_of_operation;
        this.Operation = operation;
        this.Status = status;
        this.User_ID = user_ID;
    }
}

public class Main
{
    static void Test2 (int account_number, double balance, String path) throws IOException
    {
        ArrayList<Score> list = new ArrayList<Score>();
        list.add(new Score(account_number, balance));

            File file = new File(path);
            if (file.exists())
            {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("\n" + "Баланс: " + balance + ", номер счёта: " + account_number);
                fileWriter.close();
            }
            else
                {
                System.out.println("404 (" + path + ")");
            }
    }

    static void Test1 (String name, String surname, int age) throws IOException
    {
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User(name, surname, age));
//        list.add(new User("name1", "surname1", 1));
//        list.add(new User("name2", "surname2", 2));
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            File file1 = new File(String.valueOf(name + ".txt"));
            FileWriter fileWriter = new FileWriter(file1, false);
            name = list.get(i1).Name;
            surname = list.get(i1).Surname;
            age = list.get(i1).Age;

            fileWriter.write(name + ", " + surname + ", " + age);
            fileWriter.close();
        }
    }
    public static void main(String[] args) throws IOException
    {
//        Scanner in1 = new Scanner(System.in);
//        System.out.print("Введите name: ");
//        String str1 = in1.next();
//        Scanner in2 = new Scanner(System.in);
//        System.out.print("Введите surname: ");
//        String str2 = in2.next();
//        Scanner in3 = new Scanner(System.in);
//        System.out.print("Введите age: ");
//        int str3 = in3.nextInt();
//        Test1(str1, str2, str3);


        String path = "1.txt";
        double balance = 17;
        int account_number = 12;
        Test2(account_number, balance, path);
    }
}

