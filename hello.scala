object Geeks {


	def main(args:Array[String])
	{ 
		
			//val lettres:List[String]=List("AA","BBB","C","DDDD")
			//lettres.map(ele=>(ele,ele.length)).foreach(println)

			//val num=List(1,1,2,2,3,4,3,5)
			//num.groupBy(identity).mapValues(ele=>(ele.length)).foreach(println)
			//num.groupBy (x=>x).map(x=>(x._1,x._2.sum)).foreach(println)
			//println(num.groupBy (x=>x))
			


			



			//var chiffres:List[Int]=List(1,3,9,7)
			//for(element<-chiffres) println(element);

			//val listeDelistes : List[List[Int]]=List(List(3,2),List(2,5,7))

			//var chiffres2:List[Int]=List(2,5,6,10)
			//val concat = List.concat(chiffres,chiffres2)
			//println(concat)
			
			//val evens = chiffres.filter(_<=3)
			//println(evens)
			val numetlet=List(("A",4),("B",5),("C",5),("A",5),("C",4))
			numetlet.groupBy(x=>x).map(x=>((x._1.ele),(x._2.sum)).foreach(println))
		
	}

			
}


