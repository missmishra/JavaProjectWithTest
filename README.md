# Delivery Cost Calculation

This project is a command-line application written in Java that calculates the delivery cost and estimated delivery time for packages based on their weight, distance, and offer codes. It also considers the available fleet of vehicles and their capacity and speed.

## Project Structure

The project follows a modular structure with separate packages for models, utilities, and the main application logic. The structure is as follows:
- `DeliveryCostCalculator.java`: The main class that contains the application logic for calculating delivery costs and estimated delivery times.
- `models/Package.java`: Represents the package data model.
- `models/Vehicle.java`: Represents the vehicle data model.
- `utils/DiscountCalculator.java`: Utility class for calculating discounts based on offer codes.
- `utils/InputParser.java`: Utility class for parsing command-line input.
- `test/*Test.java`: JUnit test classes for testing the application logic and utility classes.

## Getting Started

To run the application, follow these steps:

1. Clone the repository or download the source code.
2. Navigate to the project directory: `cd delivery-cost-calculation`
3. Run the application and follow the command line prompt to input values.

## Testing

The project includes JUnit tests for the main application logic and utility classes
