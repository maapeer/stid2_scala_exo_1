object Geeks {

	def multi10(m:Int):Int=m*10
	def multi(m:Int,n:Int):Int=m*n
    def main(args: Array[String]) 
{
	for(a<-1 to args(0).toInt){
		println("Valeur de a :" +a)
		multi10(2)
	
       }
	   println(multi10(2))
	   println(multi(5,2))
	}
}


