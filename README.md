# ATM-Interface-using-JAVA
### ATM Interface in Java
This Java program simulates a basic ATM (Automated Teller Machine) interface with functionalities like deposit, withdrawal, transfer, displaying transaction history, and quitting the program.
### Components:
1. **Main Class (`ATM`)**:
- This class serves as the entry point for the ATM simulation.
- It manages user input and calls methods for different operations based on user choices.
2. **Transaction Class**:
- `Transaction` class represents individual transactions made by the user.
- Attributes include `type` (Deposit, Withdrawal, Transfer), `amount` of transaction, and `date` of transaction.
3. **BankAccount Attributes**:
- `balance`: Represents the current amount of money in the ATM.
- `transactionHistory`: Stores all the transactions made by the user.
### Operations:
1. **Deposit Operation**:
- Prompts the user for an amount to deposit.
- Checks if the deposit amount is valid (greater than zero).
- Updates the `balance` and records a new `Transaction` object for the deposit.
2. **Withdrawal Operation**:
- Prompts the user for an amount to withdraw.
- Checks if the withdrawal amount is valid (greater than zero) and if the user has sufficient balance.
- Updates the `balance` and records a new `Transaction` object for the withdrawal.
3. **Transfer Operation**:
- Simulates a transfer operation by deducting an amount from the ATM's `balance`.
- Similar to withdrawal, it checks if the transfer amount is valid and if the ATM has sufficient funds.
- Records a new `Transaction` object for the transfer.
4. **Display Transaction History**:
- Displays all previous transactions recorded in the `transactionHistory`.
5. **Quit Operation**:
- Terminates the ATM simulation.
### Usage:
- **Initialization**:
- The ATM is initialized with a balance of `0.0` and an empty `transactionHistory` list.
- **Menu Display**:
- The program continuously displays an ATM menu using a `while` loop until the user chooses to quit.
- **Input Handling**:
- User inputs are handled using `Scanner` class from `java.util.Scanner`.
- Validations are implemented to ensure correct input formats and to prevent errors like invalid amounts or insufficient funds.
### Improvements:
- **Error Handling**:
- Enhance error messages for cases like insufficient funds or invalid input.
- Implement more robust input validation.
- **Security Features**:
- Implement security measures like PIN validation for real-world applications.
- Ensure data integrity and privacy in transaction handling.
### Conclusion:
This ATM simulation provides a foundational example of basic banking operations in Java. It demonstrates fundamental concepts such as class design, method implementation, user input handling, and data management. For further enhancements or integration into real banking systems, consider additional features and security measures as necessary.
### Running the Program:
To run the ATM simulation:
- Ensure you have Java installed on your machine.
- Compile the `ATM.java` file.
- Execute the compiled `ATM.class` file using `java ATM`.
