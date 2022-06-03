class Tic_tac_toe {
  var state = Array(
    Array("0","0","0"),
    Array("0","0","0"),
    Array("0","0","0"))
  def getState = state
  def Validate(in : String,player : Boolean): Boolean = {
      var c = in.charAt(1) match {
      case 'a' => 0
      case 'b' => 1
      case 'c' => 2
      case _ => -1
      }
      var r = ('4' - in.charAt(0)) - 1
      if(r>=0 && r <3 && c!= -1&&state(r)(c)=="0") {
        if(player)
          state(r)(c) = "X"
        else {
          state(r)(c) = "O"
        }
        return true
      }
      else return false
    }
  }

