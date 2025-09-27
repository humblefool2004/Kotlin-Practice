//dont run this code, it will give error

/*
interface Listener{
fun listen()
}
//
class Team1<T: Player>(val name : String,val players: MutableList<in T>){ /// here out/in
//making two or more upperbounds
class Team1<T>() : where T: Player , T: Listener{

    fun addPlayers(player: T){
        if(players.contains((player))){
            println("player : ${player.name} is already in the team ${this.name}")
        }else{
            players.add(player) //if out is used, we cant use this line
            println("Player : ${player.name} was added in the team ${this.name}")
        }
    }
}

open class Player1(val name : String)

class FootballPlayer1(name : String) : Player1(name)
class BaseballPlayer1(name : String) : Player1(name)

open class GamesPlayer(name : String) : Player1(name)
class CounterStrikePlayer(name : String) : GamesPlayer(name)


//covariance says i will accept the superclass and all its subclasses
// out keyword is used in the superclass i.e  out T is used in mutab..

// countervariance says i will accept the superclasses only, not the subclasses
// in keyword is used in the superclass i.e in T
fun main() {
    val footballPlayer= Team1<Player1>(
         "Football Team",
         mutableListOf<FootballPlayer1>(FootballPlayer1("Player 1"), FootballPlayer1("Player 2"))
    )
    val gamesTeam= Team1<CounterStrikePlayer>(
        "Games Team",
        mutableListOf<GamesPlayer>(GamesPlayer("Player1"), GamesPlayer(Player 2))
    )
}*/
