class etudiant (nomEtu:String, prenomEtu:String, ageEtu:Int, adresseEtu:String){
   var nom: String=nomEtu
    var prenom: String=prenomEtu
    var age: Int=ageEtu 
    var adresse: String=adresseEtu

    def changeAge(newAge:Int)
    {
        age=newAge
    }

    def changeAdresse(newAdresse:String)
    {
        adresse=newAdresse
    }

    override def toString():String=nom+" "+prenom+" "+age+" "+adresse
}



object STID2{
    def main(args: Array[String]) {
        val etudiant1 = new etudiant("Jean", "Philippe", 20, "15 rue de niort, 79000")
        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAge(21);
        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAge(22);
        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAdresse("14 rue de Poitiers");
        println(etudiant1.nom+" "+etudiant1.age)
        println(etudiant1.toString())

    }
}

object maper{
    def main(args: Array[String]) {
        val etudiant1 = new etudiant("PEROCHON", "Mathéo", 19, "14 e rue de la gavacherie, 79000")
        println(etudiant1.toString())

    }
}


class notes (numEtu:Int, nomModule:String, note:Int){
   var num: Int=numEtu
    var module: String=nomModule
    var notes: Int=note

    override def toString():String=num+" "+module+" "+notes
}

object mesNotes{
    def main(args: Array[String]) {
        val Stats = new notes(22504955, "Statistiques", 11)
        println(Stats.toString())

    }
}
