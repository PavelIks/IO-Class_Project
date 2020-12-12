package com.company;

public class Main
{
    public static void main(String[] args)
    {
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
        }
        class Score
        {
            int Account_number;
            int Balance;
            Score(int account_number, int balance)
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
                this.Operation = Operation;
                this.Status = status;
                this.User_ID = user_ID;
            }
        }
        
    }
}
