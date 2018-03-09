package cl.groovy.simple_data_types.operator_overloading

class Account {

    BigDecimal balance

    // plus method overloading to use with + operator
    Account plus(Account other) {
        new Account( balance: this.balance + other.balance )
    }
    
    String toString(){
        "Account Balance: $balance"
    }

}

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking
println savings + checking  // we need to overload plus() method in object in order to use + operator