class Chess {
  var white_king_moved = false
  var black_king_moved = false
  var white_rook1_moved = false
  var white_rook2_moved = false
  var black_rook1_moved = false
  var black_rook2_moved = false
  var dim = 8*8
  var state = Array(
    Array("\u001b[44m,\u001b[38mr","\u001b[46m,\u001b[38mn","\u001b[44m,\u001b[38mb","\u001b[46m,\u001b[38mk","\u001b[44m,\u001b[38mq","\u001b[46m,\u001b[38mb","\u001b[44m,\u001b[38mn","\u001b[46m,\u001b[38mr"),
    Array("\u001b[46m,\u001b[38mp","\u001b[44m,\u001b[38mp","\u001b[46m,\u001b[38mp","\u001b[44m,\u001b[38mp","\u001b[46m,\u001b[38mp","\u001b[44m,\u001b[38mp","\u001b[46m,\u001b[38mp","\u001b[44m,\u001b[38mp"),
    Array("\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0"),
    Array("\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0"),
    Array("\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0"),
    Array("\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0","\u001b[46m,0","\u001b[44m,0"),
    Array("\u001b[44m,\u001b[30mP","\u001b[46m,\u001b[30mP","\u001b[44m,\u001b[30mP","\u001b[46m,\u001b[30mP","\u001b[44m,\u001b[30mP","\u001b[46m,\u001b[30mP","\u001b[44m,\u001b[30mP","\u001b[46m,\u001b[30mP"),
    Array("\u001b[46m,\u001b[30mR","\u001b[44m,\u001b[30mN","\u001b[46m,\u001b[30mB","\u001b[44m,\u001b[30mK","\u001b[46m,\u001b[30mQ","\u001b[44m,\u001b[30mB","\u001b[46m,\u001b[30mN","\u001b[44m,\u001b[30mR"))
  def getstate(): Array[Array[String]] ={
    state
  }
  def validate(input:String,player : Boolean): Boolean =  {
    var start = Array(0,0)
    var end = Array(0,0)
    var res = true
    if ((input.length == 4) && input.charAt(1).isLetter && input.charAt(3).isLetter && input.charAt(0).isDigit && input.charAt(2).isDigit){
      start = location(input.slice(0,2))
      end = location(input.slice(2,4))
      if (start(0) < 0 || end(0) < 0||start(1) <0||end(1) < 0) {
        res = false
        return res
      }
      if((player && state(start(0))(start(1)).contains("30"))||(!player && state(start(0))(start(1)).contains("38"))) {
        def valid = isValidMove(state, start(0), start(1))


        if (valid(state, start(0), start(1), end(0), end(1), player)) {
          if (((state(start(0))(start(1)).contains('P')) && (start(0) == 1)) || ((state(start(0))(start(1)).contains('p')) && (start(0) == 6))) pawn_promotion(start(0), start(1), player)
          if (makeMove(state, start(0), start(1), end(0), end(1), player)) {
            if (state(end(0))(end(1)).contains('k') || state(end(0))(end(1)).contains('K')) {
              if (!player) white_king_moved = true
              else black_king_moved = true
            }
            else if (state(end(0))(end(1)).contains('r') || state(end(0))(end(1)).contains('R')) {
              if ((start(0) == 0) && (start(1) == 0)) white_rook1_moved = true
              else if ((start(0) == 0) && (start(1) == 7)) white_rook2_moved = true
              else if ((start(0) == 7) && (start(1) == 0)) black_rook1_moved = true
              else if ((start(0) == 7) && (start(1) == 7)) black_rook2_moved = true
            }
          }
          else{
            res = false
            return res
          }
        }
        else res = false
      }
      else res = false
    }
    else res = false
    res
  }

  def location(input:String):Array[Int]= {
    var res = Array(0,0)
    //if ((input.length == 4) && input.charAt(1).isLetter && input.charAt(3).isLetter && input.charAt(0).isDigit && input.charAt(2).isDigit){
    input.charAt(1) match {
      case 'a'|'A' =>
        res(1) = 0

      case 'b'|'B' =>
        res(1) = 1

      case 'c'|'C' =>
        res(1) = 2

      case 'd'|'D' =>
        res(1) = 3

      case 'e'|'E' =>
        res(1) = 4

      case 'f'|'F' =>
        res(1) = 5

      case 'g'|'G' =>
        res(1) = 6

      case 'h'|'H' =>
        res(1) = 7

      case _ =>
        res(1) = -1
    }
    res(0) = ('9' - input.charAt(0)) - 1
    if(res(0)>8 && res(0)<0)
      res(0) = -1
    res
  }

  def isValidMove(Board : Array[Array[String]],r1:Int,c1:Int):(Array[Array[String]],Int,Int,Int,Int,Boolean) => Boolean =//make sure the move is valid
  {
    var pawn = Board(r1)(c1);
    if(pawn.contains('p')){
      return whiteSoldierMove
    }
    else if (pawn.contains('P')){
      return blackSoldierMove
    }
    else if(pawn.contains('b')||pawn.contains('B')){
      return bishopMove
    }
    else if (pawn.contains('k')||pawn.contains('K')){
      return kingMove
    }
    else if (pawn.contains('n')||pawn.contains('N')){
      return knightMove
    }
    else if (pawn.contains('r')||pawn.contains('R')){
      return rookMove
    }
    else {
      return queenMove
    }
  }

  def queenMove(Board : Array[Array[String]],r1:Int,c1:Int,r2:Int,c2:Int,player:Boolean):Boolean = {
    if(Board(r1)(c2).charAt(Board(r1)(c1).length-1) != 'q' && Board(r1)(c2).charAt(Board(r1)(c1).length-1) != 'Q')
      return false
    return rookMove(Board,r1,c1,r2,c2,player) || bishopMove(Board,r1,c1,r2,c2,player)
  }

  // def main(args: Array[String]): Unit ={
  //    var player = true
  //   var c = new Chess()
  //    while (true){
  //      var in = scala.io.StdIn.readLine()
  //      validate(in,player)
  //      println(in)
  //      printBoard()
  //      player = !player
  //    }
  //  }


  def printBoard()={
    state.map(_.mkString(" ")).foreach(println)
  }
  def pawn_promotion(r1: Int, c1: Int,player : Boolean): Unit ={
    var ch = 'a'
    printf("Which pawn do you want to promote?\n ");
    if (player)
    {
      printf(" Enter q for Queen\n\tn for Knight\n\tr for Rook\n\tb for Bishop\n")
      ch = scala.io.StdIn.readChar()
      ch match
      {
        case 'q' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "Q"
        case 'n' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "N"
        case 'r' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "R"
        case 'b' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "B"
        case _ =>
          println("Invalid Input!");
          println("Please enter a valid input\n");
          pawn_promotion(r1,c1,player);
      }
    }
    else
    {
      printf(" Enter q for Queen\n\tn for Knight\n\tr for Rook\n\tb for Bishop\n");
      ch = scala.io.StdIn.readChar()
      ch match
      {
        case 'q' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "q"
        case 'n' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "n"
        case 'r' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "r"
        case 'b' =>
          state(r1)(c1) = state(r1)(c1).slice(0, state(r1)(c1).length - 1) + "b"
        case _ =>
          println("Invalid Input!");
          println("Please enter a valid input\n");
          pawn_promotion(r1,c1,player);
      }
    }
  }
  def makeMove (Board : Array[Array[String]],r1 :Int,c1:Int,r2:Int,c2:Int,player:Boolean):Boolean = {
    var temp = Board(r2)(c2).slice(6,Board(r2)(c2).length)
    var res = true
    Board(r2)(c2) = Board(r2)(c2).slice(0,6) + Board(r1)(c1).slice(6,Board(r1)(c1).length)
    Board(r1)(c1) = Board(r1)(c1).slice(0, 6) + "0"
    if (!isKingSafe(Board,player))
    {
      Board(r1)(c1) = Board(r1)(c1).slice(0, 6) + Board(r2)(c2).slice(6,Board(r2)(c2).length)
      Board(r2)(c2) = Board(r2)(c2).slice(0, 6) + temp
      res = false
    }
    res
  }
  def isKingSafe(Board: Array[Array[String]], player: Boolean):Boolean = {
    var res = true
    var r = -1
    var c = -1
    var i = 0
    while ( i < 8 ) {
      for (j <- 0 until 8) {
        if(i<8) {
          if (((Board(i)(j).contains('K')) && player) || ((Board(i)(j).contains("k")) & !player)) {
            r = i
            c = j
            i = 8
          }
        }
      }
      i += 1
    }
    if (player) {
      for (i <- 0 until 8) {
        for (j <- 0 until 8) {
          if (Board(i)(j).charAt(Board(i)(j).length-1).isUpper) {}
          else if (isValidMove(Board, i, j)(Board, i, j, r, c,false)) {
            res = false
          }
        }
      }
    }
    else {
      for (i <- 0 until 8) {
        for (j <- 0 until 8) {
          if (Board(i)(j).charAt(Board(i)(j).length-1).isLower) {} //todo: continue is not supported
          else if (isValidMove(Board, i, j)(Board, i, j, r, c,true)) {
            res = false
          }
        }
      }
    }
    res
  }
  def whiteSoldierMove(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int,boolean: Boolean): Boolean ={
    var res = false
    if (c1 == c2) { //check if same row
      if ((r1 == 1) && (Board(r2)(c2).charAt(Board(r2)(c2).length-1) == '0') &&
        (Board(r1 + 1)(c2).charAt(Board(r1 + 1)(c2).length-1)=='0') && ((r2 == 3) || (r2 == 2))) res = true
      else if (((r2 - 1) == r1) && (Board(r2)(c2).charAt(Board(r2)(c2).length-1) == '0')) res = true
      else res = false
    }
    else if ((Board(r2)(c2).charAt(Board(r2)(c2).length-1).isUpper) && (r2 == (r1 + 1)) && ((c2 == (c1 - 1)) || (c2 == (c1 + 1)))) res = true
    else res = false
    res
  }
  def blackSoldierMove(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int,boolean: Boolean): Boolean ={
    var res = false
    if (c1 == c2) { //check if same row
      if ((r1 == 6) && (Board(r2)(c2).charAt(Board(r2)(c2).length-1) == '0') &&
        (Board(r1 - 1)(c2).charAt(Board(r1 - 1)(c2).length-1)=='0') && ((r2 == 4) || (r2 == 5))) res = true
      else if (((r2 + 1) == r1) && (Board(r2)(c2).charAt(Board(r2)(c2).length-1) == '0')) res = true
      else res = false
    }
    else if ((Board(r2)(c2).charAt(Board(r2)(c2).length-1).isLower) && (r2 == (r1 - 1)) && ((c2 == (c1 - 1)) || (c2 == (c1 + 1)))) res = true
    else res = false
    res
  }
  def bishopMove(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int,player : Boolean): Boolean ={
    var res = true
    if (player) if (Board(r2)(c2).charAt(Board(r2)(c2).length-1).isLower) res  = false
    else if (Board(r2)(c2).charAt(Board(r2)(c2).length-1).isUpper) return true
    if (r2 > r1 && c2 > c1) if ((r2 - r1) == (c2 - c1)) {
      var i = r1 + 1
      var j = c1 + 1
      while ( {
        i < r2
      }) {
        if (Board(i)(j).charAt(Board(i)(j).length-1) == '0') {} //todo: continue is not supported

        else
          res = false


        i += 1
        j += 1

      }
    }
    else res = false
    else if (r2 > r1 && c2 < c1) if ((r2 - r1) == (c1 - c2)) {
      var i = r1 + 1
      var j = c1 - 1
      while ( {
        i < r2
      }) {
        if (Board(i)(j).charAt(Board(i)(j).length-1) == '0') {}
        else {
          res = false
        }
        i += 1
        j -= 1
      }
    }
    else res = false
    else if (r1 > r2 && c2 > c1) if ((r1 - r2) == (c2 - c1)) {
      var i = r1 - 1
      var j = c1 + 1
      while ( {
        j < c2
      }) {

        if (Board(i)(j).charAt(Board(i)(j).length-1) == '0') {}
        else {
          res = false
        }


        i -= 1
        j += 1
      }
    }
    else res = false
    else if (r2 < r1 && c2 < c1) {
      if ((r1 - r2) == (c1 - c2)) {
        var i = r1 - 1
        var j = c1 - 1
        while ( {
          i > r2
        }) {
          if (Board(i)(j).charAt(Board(i)(j).length-1) == '0') {}
          else {
            res = false
          }


          i -= 1
          j -= 1
        }
      }
      else res = false
    }
    else res = false
    res
  }
  def kingMove(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int,player:Boolean) : Boolean = {
    var res = false
    if ((r2 == r1) && !((c2 == c1 + 1) || (c2 == c1 - 1))) if (isCastle(Board, r1, c1, r2, c2,player)) {
      castle(r1, c1, r2, c2)
      res = true
    }
    if (player) {
      if (Board(r2)(c2).charAt(Board(r2)(c2).length-1).isLower){
        res = false
      }
    }
    else {
      if (Board(r2)(c2).charAt(Board(r2)(c2).length-1).isUpper) res = false
    }
    if (((r2 == r1 + 1) || (r2 == r1 - 1)) && ((c2 == c1 + 1) || (c2 == c1 - 1))) res = true
    else if ((r2 == r1) && ((c2 == c1 + 1) || (c2 == c1 - 1))) res = true
    else if ((c2 == c1) && ((r2 == r1 + 1) || (r2 == r1 - 1))) res = true
    else res = false
    res
  }
  def isCastle(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int,player:Boolean):Boolean ={
    var res = false
    if (!isKingSafe(Board,player)){
      res = false
      return res
    }
    if ((r1 == 0) && (c1 == 4)) {
      if (white_king_moved) {
        res = false
        return res
      }
      if ((c2 == 6) && !white_rook2_moved && (Board(0)(7).charAt(Board(0)(7).length) == 'r'))
        for (i <- c1 + 1 to 6) {
          if (Board(r1)(i).charAt(Board(r1)(i).length-1) == '0') {
            res = true
          }
          else {
            res = false
            return res
          }
        }
      else if ((c2 == 2) && !white_rook1_moved && (Board(0)(0).charAt(Board(0)(0).length-1) == 'r'))
        for (i <- c1 - 1 to 1 by -1) {
          if (Board(r1)(i).charAt(Board(r1)(i).length-1) == 0) {
            res = true //todo: continue is not supported
          }
          else{
            res = false
            return res
          }
        }
    }
    else if ((r1 == 7) && (c1 == 4)) {
      if (black_king_moved) {
        res = false
        return res
      }
      if ((c2 == 6) && !black_rook2_moved && (Board(7)(7).charAt(Board(7)(7).length) == 'R'))
        for (i <- c1 + 1 to 6) {
          if (Board(r1)(i).charAt(Board(r1)(i).length-1) == 0) {
            res = true
          }
          else {
            res = false
            return res
          }
        }
      else if ((c2 == 2) && !black_rook1_moved && (Board(7)(0).charAt(Board(7)(0).length) == 'R'))
        for (i <- c1 - 1 to 1 by -1) {
          if (Board(r1)(i).charAt(Board(r1)(i).length-1) == 0) {
            res = true
          }
          else {
            res = false
            return res
          }
        }
    }

    res
  }
  def castle(r1: Int, c1: Int, r2: Int, c2: Int): Unit ={
    if (r1 == 0) if (c2 == 6) {
      state(0)(7) = state(0)(7).slice(0, state(0)(7).length - 1) + '0'
      state(0)(5) = state(0)(5).slice(0, state(0)(5).length - 1) + 'r'
    }
    else if (c2 == 2) {
      state(0)(0) =  state(0)(0).slice(0, state(0)(0).length - 1) + '0'
      state(0)(3) =  state(0)(3).slice(0, state(0)(3).length - 1) + 'r'
    }
    else if (c2 == 6) {
      state(7)(7) =  state(7)(7).slice(0, state(7)(7).length - 1) + '0'
      state(7)(5) =  state(7)(5).slice(0, state(7)(5).length - 1) + 'R'
    }
    else if (c2 == 2) {
      state(7)(0) =  state(7)(0).slice(0, state(7)(0).length - 1) + '0'
      state(7)(3) =  state(7)(3).slice(0, state(7)(3).length - 1) + 'R'
    }
  }
  def knightMove(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int, player:Boolean): Boolean ={
    var res = false
    if (player && Board(r2)(c2).charAt(Board(r2)(c2).length-1).isLower) res = false
    else if (!player && Board(r2)(c2).charAt(Board(r2)(c2).length-1).isUpper) return false
    if (((r2 == (r1 + 2)) || (r2 == (r1 - 2))) && ((c2 == (c1 + 1)) || (c2 == (c1 - 1)))) res = true
    else if (((c2 == (c1 + 2)) || (c2 == (c1 - 2))) && ((r2 == (r1 + 1)) || (r2 == (r1 - 1)))) res = true
    else res = false
    res
  }
  def rookMove(Board: Array[Array[String]], r1: Int, c1: Int, r2: Int, c2: Int,player:Boolean): Boolean = {
    var res = true
    if (player && Board(r2)(c2).charAt(Board(r2)(c2).length-1).isLower) res = false
    else if (!player && Board(r2)(c2).charAt(Board(r2)(c2).length-1).isUpper) res = false
    if (r1 == r2) {
      if (c1 > c2) {
        var i = c1 - 1
        while ( {
          i > c2
        }) {
          if (Board(r2)(i).charAt(Board(r2)(i).length-1) == 0) {} //todo: continue is not supported
          else {
            res = false
            return res
          }
          i -= 1
        }
      }
      else if (c2 > c1) {
        var i = c1 + 1
        while ( {
          i < c2
        }) {
          if (Board(r2)(i).charAt(Board(r2)(i).length-1) == 0) {} //todo: continue is not supported
          else {
            res = false
            return res
          }
          i += 1
        }
      }
      else {
        res = false
        return res
      }
    }
    else if (c1 == c2) {
      if (r1 > r2) {
        var i = r1 - 1
        while ( {
          i > r2
        }) {
          if (Board(i)(c2).charAt(Board(i)(c2).length-1) == 0) {}
          else {
            res = false
            return res
          }
          i -= 1
        }
      }
      else if (r2 > r1) {
        var i = r1 + 1
        while ( {
          i < r2
        }) {
          if (Board(i)(c2).charAt(Board(i)(c2).length-1) == 0) {}
          else {
            res = false
            return res
          }
          i += 1
        }
      }
      else {
        res = false
        return res
      }
    }
    else{ res = false}
    res
  }
}
