import java.text.SimpleDateFormat
import java.util.Date


class Movie(MId:Int, title:String,year: Int,director:String){
    var mId : Int=MId
    var Title : String=title
    var Year : Int= year
    var Director : String=director

    override def toString():String= mId+""+Title+""+Year+""+Director
}



class Reviewer(rId:Int, name:String){
    var Rid : Int=rId
    var Nom : String=name

    override def toString():String= Rid+""+Nom 

}

class Rating(rId:Int, mID:Int, stars:Int, ratingDate:String){
    var Rid : Int=rId
    var Mid : Int=mID
    var Star : Int=stars
    var date : String = ratingDate
    val format = new SimpleDateFormat("yyyy-mm-dd")
    val datee = format.parse(ratingDate)

    override def toString():String= Rid+""+Mid+""+Star+""+datee

}

object principal{

def loadMovieData(path:String):Array[Movie]=
{
    var movies:Array[Movie]=Array.empty
    val bufferedSource = io.Source.fromFile("movie.csv")
    for (line<-bufferedSource.getLines){
    val cols = line.split(",").map(_.trim)
    val movie = new Movie(cols(0).toInt,cols(1).substring(1,cols(1).length()-1),cols(2).toInt,cols(3).substring(1,cols(3).length()-1))
    movies = movies :+movie
}
bufferedSource.close
return movies;
}

def loadRatingData(path:String):Array[Rating]=
{
    var ratings:Array[Rating]=Array.empty
    val bufferedSource = io.Source.fromFile("rating.csv")
    for (line<-bufferedSource.getLines){
    val cols = line.split(",").map(_.trim)
    val rating = new Rating(cols(0).toInt,cols(1).toInt,cols(2).toInt,cols(3).substring(1,cols(3).length()-1))
    ratings = ratings :+rating
}
bufferedSource.close
return ratings;
}

def loadReviewerData(path:String):Array[Reviewer]=
{
    var reviewers:Array[Reviewer]=Array.empty
    val bufferedSource = io.Source.fromFile("reviewer.csv")
    for (line<-bufferedSource.getLines){
    val cols = line.split(",").map(_.trim)
    val reviewer = new Reviewer(cols(0).toInt,cols(1).substring(1,cols(1).length()-1))
    reviewers = reviewers :+reviewer
}
bufferedSource.close
return reviewers;
}
def main(args:Array[String])
{
    var movies:Array[Movie] = loadMovieData("movie.csv")
    var ratings:Array[Rating] = loadRatingData("rating.csv")
    var reviewers:Array[Reviewer] = loadReviewerData("reviewer.csv")
    movies.foreach {println}
    ratings.foreach {println}
    reviewers.foreach {println}
}
}



