# Mortgage Calculator (Java)

This Java console application calculates the monthly mortgage payment using the standard amortization formula. It includes two versions:

- **MortgageCalculator.java** – Basic version without input validation.
- **MortgageCalculator_ErrorHandling.java** – Enhanced version with input validation and user-friendly prompts.

---

## Mortgage Formula

The calculation is based on the standard mortgage formula:

\[
M = P \times \frac{r(1 + r)^n}{(1 + r)^n - 1}
\]

Where:

- `M` = Monthly Payment
- `P` = Principal (Loan Amount)
- `r` = Monthly Interest Rate (Annual Rate ÷ 12 ÷ 100)
- `n` = Number of Payments (Years × 12)

📖 Formula Reference: [WikiHow - Calculate Mortgage Payments](https://www.wikihow.com/Calculate-Mortgage-Payments)

---

## How It Works

### - Inputs:

- Principal (between $1,000 and $1,000,000)
- Annual Interest Rate (0% to 30%)
- Period in Years (1 to 30)

### - Output:

- Monthly Mortgage Payment (formatted in CAD currency)

---

## Project Structure

MortgageCalculator/
├── src/
│ └── com.kshitij/
│ ├── MortgageCalculator.java
│ ├── MortgageCalculator_ErrorHandling.java
├── README.md

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/yourusername/MortgageCalculator.git
cd MortgageCalculator
```

2. Open the project in IntelliJ IDEA
   — OR —

Run via terminal:

To run the basic version:

```bash
javac src/com/kshitij/MortgageCalculator.java
java com.kshitij.MortgageCalculator
```

To run the error-handling version:

```bash
javac src/com/kshitij/MortgageCalculator_ErrorHandling.java
java com.kshitij.MortgageCalculator_ErrorHandling
```

## Features

- User-friendly prompts

- Input validation for all fields

- Properly formatted currency output (NumberFormat with Locale en_CA)

- Educational reference for understanding loan amortization

## License

This project is for educational purposes only. No commercial use intended.
