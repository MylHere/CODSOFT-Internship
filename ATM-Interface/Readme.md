# ATM System 

This is a simple Java implementation of an ATM (Automated Teller Machine) system that allows users to perform basic banking operations such as withdrawal, deposit, and balance inquiry. The system also includes security features like PIN validation and card blocking after multiple unsuccessful attempts.

## Table of Contents

- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Code Overview](#code-overview)

## Project Structure

The project consists of three Java classes:

1. `ATM.java`: This class represents the ATM machine and handles withdrawal, deposit, and balance inquiry operations.

2. `UserBankAccount.java`: This class represents user bank accounts. It contains user PINs, balances, and methods for PIN validation and balance manipulation.

3. `ATMSystem.java`: This class contains the main method for running the ATM system. It prompts users for input and interacts with the ATM and UserBankAccount classes.

## How to Run

To run the ATM system, follow these steps:

1. Ensure you have Java installed on your system.

2. Compile the Java files by running the following commands in your terminal:

   ```bash
   javac ATM.java UserBankAccount.java ATMSystem.java
   ```

3. Run the ATM system by executing the `ATMSystem` class:

   ```bash
   java ATMSystem
   ```

4. Follow the on-screen prompts to interact with the ATM system. You'll be asked to enter your PIN, choose an operation (withdraw, deposit, or check balance), and provide the relevant information.

5. After completing your transactions, the system will display a thank-you message.

## Code Overview

- `ATM.java`:
  - Represents the ATM machine.
  - Handles withdrawal, deposit, and balance inquiry operations.
  - Implements a loop that allows up to four attempts to enter the correct withdrawal amount.
  - Includes logic to prevent withdrawals exceeding the available balance.

- `UserBankAccount.java`:
  - Represents user bank accounts.
  - Contains user PINs and balances as arrays.
  - Provides methods for PIN validation and balance manipulation (reduce and add balance).

- `ATMSystem.java`:
  - Contains the main method for running the ATM system.
  - Prompts users for their PIN and interacts with the ATM and UserBankAccount classes.
  - Implements card blocking after multiple unsuccessful attempts.

Please note that this is a basic ATM system for educational purposes. In a real-world scenario, security and error handling would be more complex. Feel free to extend and enhance this code as needed for your own projects.

---
