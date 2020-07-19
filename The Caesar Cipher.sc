val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val s = "HELLO"
val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key).abs%a.size)
val cipher=(algo:(Char,Int,String)=>Char, s:String,key:Int,a:String)=>s.map(algo(_,key,a))
val ct=cipher(E,s,3,alphabet)
val pt=cipher(D,ct,3,alphabet)
