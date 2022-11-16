object Geeks {


	def main(args:Array[String])
	{ 
			val fruits:List[String]=List("Bananes","oranges","pommes")
			fruits.foreach(println);

			var chiffres:List[Int]=List(1,3,9,7)
			for(element<-chiffres) println(element);

		val listeDelistes : List[List[Int]]=List(List(3,2),List(2,5,7))
		val evens = chiffres.filter(_<=3)
		println(evens)
	}

			
}


