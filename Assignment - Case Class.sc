case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  def +(that:Point)= Point(this.x+that.x,this.y+that.y)
  def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
  def distance(that:Point): Double= scala.math.sqrt(scala.math.pow(this.x-that.x,2) +scala.math.pow(this.y-that.y,2))
  def invert()= Point(y,x)
}

  val p1 = Point(1, 3)
  val p2 = Point(5, 6)

  println(p1)
  println(p2)

  println(p1+p2)
  println(p1.move(1,1))
  println(p1.distance(p2))
  println(p1.invert())







