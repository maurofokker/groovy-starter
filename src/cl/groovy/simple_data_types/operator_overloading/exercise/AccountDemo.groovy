package cl.groovy.simple_data_types.operator_overloading.exercise

/**
 * Create a new script AccountDemo.groovy
 *  - Create a class called Account
 *  - Create a property called balance of type BigDecimal and initialize it to 0
 *  - Create a property called type of type String
 *  - Create a deposit method that will add to the balance
 *  - Create a withdraw method that will subtract from the balance
 *      * no need for this to check if they have that amount available (keep it simple)
 */
@groovy.transform.ToString
class Account {

    BigDecimal balance = 0.0
    String type // checking or savings
    
    BigDecimal deposit(BigDecimal amount){
        balance += amount
    }
    
    BigDecimal withdraw(BigDecimal amount){
        balance -= amount
    }
    
    BigDecimal plus(Account account){
        this.balance + account.balance
    }

}


Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println checking
println savings

/*
    String class has no overloaded method called plus that allows us to concatenate
    2 strings right? So how could we taje that logic and make it so we can make the
    following lines work

    BigDecimal plus(Account account){
        this.balance + account.balance
    }
 */

BigDecimal total = checking + savings
println total
