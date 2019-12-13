Feature: FizzBuzz


  Acceptance Criteria:

  1. When the number is divisible by 3, return 'Fizz'
  2. When the number is divisible by 5, return 'Buzz'
  3. When the number is divisible by 3 and 5, return 'FizzBuzz'
  4. Any other number, return the number

  Scenario Outline: When the number is divisible by 3, return 'Fizz'
    When the user enters the number <input>
    Then the word "Fizz" is returned
    Examples:
    |input|
    |3    |
    |6    |
    |9    |

  Scenario Outline: When the number is divisible by 5, return 'Buzz'
    When the user enters the number <input>
    Then the word "Buzz" is returned
    Examples:
      |input |
      |5     |
      |10    |
      |20    |

  Scenario Outline: When the number is divisible by 3 and 5, return 'FizzBuzz'
    When the user enters the number <input>
    Then the word "FizzBuzz" is returned
    Examples:
      |input |
      |15    |
      |30    |
      |45    |

  Scenario Outline: Any other number, return the number
    When the user enters the number <input>
    Then the word "<input>" is returned
    Examples:
      |input|
      |1    |
      |2    |
      |4    |