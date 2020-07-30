//1,2


class Rational(x: Int, y: Int){
  def numer=x
  def denom=y

  def neg= new Rational(-this.numer,this.denom)
  def sub(r:Rational)= new Rational(this.numer*r.denom - r.numer*this.denom,this.denom*r.denom)
  override def toString: String= numer +"/" + denom
}


  val x= new Rational(3,4)
  val y= new Rational(5,8)
  val z= new Rational(2,7)
  println(x.neg);
  println(x.sub(y).sub(z))

//3

class Account(id:String,n: Int, b: Double) {
  val nic:String=id
  val acnumber: Int = n
  var balance: Double = b

  def transfer(a:Account,b:Double): Unit ={
    a.balance+=b
    this.balance-=b
  }
  override def toString = "["+nic+":"+acnumber+":"+balance+"]"
}


var x = new Account("965675455V", 100076589, 10000)
var y = new Account("945654323V", 109872645, -5000)
var z = new Account("876567854V", 108726454, 2000)

x.transfer(z,1000)
println(x.balance)
println(z.balance)

//4.1
var bank:List[Account] = List(x,y,z)
val neg_acc = bank.filter(_.balance < 0)
println(neg_acc)

//4.2
val sum = bank.map(x => x.balance).reduce((p,q) => p+q)
println(sum)

//4.3
val interest = bank.map(x => if(x.balance >= 0) x.balance*1.05 else x.balance*1.1)
println(interest)