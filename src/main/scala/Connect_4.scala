class Connect_4 {
  var state = Array(
    Array("0","0","0","0","0","0","0"),
    Array("0","0","0","0","0","0","0"),
    Array("0","0","0","0","0","0","0"),
    Array("0","0","0","0","0","0","0"),
    Array("0","0","0","0","0","0","0"),
    Array("0","0","0","0","0","0","0")
  )
  def getState = state
  def Validate(in : String,player : Boolean): Boolean = {
    var c = in.charAt(0) match {
      case 'a' => 0
      case 'b' => 1
      case 'c' => 2
      case 'd' => 3
      case 'e' => 4
      case 'f' => 5
      case 'g' => 6
      case _ => -1
    }
    if(c != -1 && state(0)(c)=="0"){
      if(player)
        set("y",c)
      else
        set("r",c)
      return true
    }
    else return false
  }
  def set(x:String,c:Int): Unit ={
    var i = 5
    while(i>=0){
      if(state(i)(c)=="0"){
        state(i)(c) = x
        return
      }
      i-=1
    }
  }
}
