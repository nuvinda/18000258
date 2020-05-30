//1
def normal(hrs:Int)=150*hrs
def ot(hrs:Int)=75*hrs
def salary(a:Int,b:Int)=normal(a)+ot(b)
def tax(x:Int):Double=x*10/100
def final_salary(a:Int,b:Int):Double=salary(a,b)-tax(salary(a,b))
final_salary(40,20)

//2
def attendees(price:Int):Int=120+(15-price)/5*20
def revenue(price:Int):Int=attendees(price)*price
def cost(price:Int):Int=500+3*attendees(price)
def profit(price:Int):Int=revenue(price)-cost(price)
profit(15)
profit(10)
profit(20)
