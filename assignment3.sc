//1
def GCD(x:Int,y:Int):Int = y match{
  case 0 => x
  case x if x>y => GCD(y,x)
  case _ => GCD(y,x%y)
}

def prime(p:Int,n:Int=2):Boolean = n match{
  case x if(p==x) => true
  case x if GCD(p,x)>1 || p==1 => false
  case x => prime(p,x+1)
}

prime(5)
prime(8)

//2
def prime_seq(n: Int): Unit = {
  if (prime(n)) println(n)
  if (n>0) prime_seq(n-1)
}
prime_seq(10)

//3
def sum(n: Int): Int= {
  if(n==1) 1
  else n+sum(n-1)
}
sum(5)

//4

def even_odd(n: Int): Unit = n match {
  case 0 => println("Even")
  case 1 => println("Odd")
  case _ => even_odd(n-2)
}


//5
def sum_of_even(n: Int): Int = (n-1)%2 match {
  case 0 if n>2 => n-1 + sum_of_even(n-1)
  case 1 if n>2 => sum_of_even(n-1)
  case _ => 0
}


//6
def fibonacci(n: Int): Int = n match {
  case 0 => 0
  case 1 => 1
  case _ => fibonacci(n-1) + fibonacci(n-2)
}

def fibonacci_seq(n: Int): Unit = {
  if(n>0) fibonacci_seq(n-1)
  println(fibonacci(n))
}
