# Simple-Banking-System-Simulator
The "Simple Banking System Simulator" is a Java-based project aimed at offering a foundational understanding of essential banking system operations, account management, and transactions. Although it is a simplified simulation compared to real-world banking systems.

--------------------------------------CODE EXPLANATION---------------------------

This Java code consists of several classes that simulate a basic banking system. It includes classes for creating and managing accounts, performing transactions (deposits and withdrawals), and a main class to demonstrate the functionality.

1. Account Class (Account.java):

•	Represents a bank account with attributes such as customer name (custname), account               balance (accbal), a unique account number (accnum), and an isActive status.
•	The Account constructor initializes these attributes.
•	Getter and setter methods are provided for accessing and modifying account properties.

2 .AccountClose Class (AccountClose.java):
•	Contains a method makeInActive to set the isActive status of an account to false, effectively closing the account.

3. AccountCreation Class (AccountCreation.java):
•	Contains a method createAccount that creates a new Account object with a specified customer name and initial account balance. It sets the isActive status to true by default and returns the created account.

4. Transaction Class (Transaction.java):
•	Provides methods for performing transactions on an account:
•	ViewBalance displays the account balance if the account is active; otherwise, it reports that the account is inactive.
•	deposit allows depositing a specified amount into the account, updating the account balance if it's active.
•	withdraw allows withdrawing a specified amount from the account, updating the balance if sufficient funds are available and the account is active.

5. MainClass (MainClass.java):
•	Contains the main method to demonstrate the functionality of the banking system.
•	It creates an AccountCreation object to create a savings account with an initial balance of 10,000.
•	It also creates a Transaction object to perform balance viewing, deposits, and withdrawals on the created account.
•	The code demonstrates these operations and prints the results.
Note:
•	Account status (isActive) is used to simulate account activation and deactivation, but real banking systems typically involve more complex account management.
•	The code has a commented-out line (//acc_close.makeInActive(savacc);) for closing an account. You can uncomment this line to see how account closure works.
This code provides a basic framework for a simple banking system and can be extended for more complex scenarios with additional features and validation.


--------------------------PROJECT DESCRIPTION---------------------------------


The "Simple Banking System Simulator" is a Java application that simulates a basic banking system. It allows users to create and manage bank accounts, perform transactions (deposits and withdrawals), and view account balances. While simplified compared to real-world banking systems, this project serves as a foundational example for understanding fundamental concepts of account management and transactions in the context of a bank.

Key Features:

•	Account Creation: Users can create bank accounts by specifying customer names and initial account balances.
•	Transactions: The system supports depositing funds into accounts and withdrawing funds, with appropriate balance updates.
•	Account Management: Accounts can be made active or inactive, simulating account closure.
•	Balance Viewing: Users can check their account balances, but only if the account is active.

This project provides a practical illustration of object-oriented programming principles, encapsulation, and basic banking operations. It can serve as a starting point for more advanced banking system simulations or as an educational tool for learning Java programming concepts related to classes, objects, and methods.





