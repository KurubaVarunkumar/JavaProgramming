# Magical Arena Simulation 

This project simulates a Magical Arena where players engage in battles until one player's health reaches 0.

## Prerequisites

Make sure you have Java installed on your machine.

## How to Run

1. UnZip Folder:
  -- unzip folder. After you can browse to your desire location.
   
2. Navigate to the project directory:
  -- cd WhereYouPutThatFolder
                                                                                                                  
3. Compile the Java files:
//Main class have main(). That's why we want to compile that class
  -- javac Main.java

4. Run the simulation:
  -- java Main
  -- This will execute the Main class, which sets up the players and the arena, and starts the simulation.

5. Customization
  -- Feel free to customize the simulation by adjusting player attributes, the number of sides on the dice, or any other parameters in the code.

6. Unit Tests
  -- To run the unit tests, you can use the following commands:

 Open Eclipse ----
	--run IntegrationTest file 

or

 go to command prompt

Compile the test files:
  --javac -cp .:junit-platform-console-standalone-1.8.2.jar IntegrationTest.java

Run the tests:
  --java -cp .:junit-platform-console-standalone-1.8.2.jar org.junit.platfo IntegrationTest