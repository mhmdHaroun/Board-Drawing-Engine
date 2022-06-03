import scalafx.scene.Node
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control._
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle
import scalafx.scene.text.Font

import scala.language.postfixOps

object tic_tac_toe_Gui extends {

  def  TicTacToeView (): Seq[Node] = List {
    val error = false;
    var XTurn = true

    var tic_tac_toe = new Tic_tac_toe()
    var labelTitle = new Label("Tic-Tac-Toe Game")
    labelTitle.layoutY = 10
    labelTitle.layoutX = 240
    labelTitle.setFont(new Font(40))

    var rectangle = Rectangle(300, 300)
    rectangle.fill = Color.BLACK
    rectangle.layoutX = 250
    rectangle.layoutY = 100

    var rectangle1 = Rectangle(80, 80)
    rectangle1.fill = Color.White
    rectangle1.layoutX = 260
    rectangle1.layoutY = 110

    var rectangle2 = Rectangle(80, 80)
    rectangle2.fill = Color.White
    rectangle2.layoutX = 360
    rectangle2.layoutY = 110

    var rectangle3 = Rectangle(80, 80)
    rectangle3.fill = Color.White
    rectangle3.layoutX = 460
    rectangle3.layoutY = 110

    var rectangle4 = Rectangle(80, 80)
    rectangle4.fill = Color.White
    rectangle4.layoutX = 260
    rectangle4.layoutY = 210

    var rectangle5 = Rectangle(80, 80)
    rectangle5.fill = Color.White
    rectangle5.layoutX = 360
    rectangle5.layoutY = 210

    var rectangle6 = Rectangle(80, 80)
    rectangle6.fill = Color.White
    rectangle6.layoutX = 460
    rectangle6.layoutY = 210

    var rectangle7 = Rectangle(80, 80)
    rectangle7.fill = Color.White
    rectangle7.layoutX = 260
    rectangle7.layoutY = 310

    var rectangle8 = Rectangle(80, 80)
    rectangle8.fill = Color.White
    rectangle8.layoutX = 360
    rectangle8.layoutY = 310

    var rectangle9 = Rectangle(80, 80)
    rectangle9.fill = Color.White
    rectangle9.layoutX = 460
    rectangle9.layoutY = 310

    val toLabel = new Label("To")
    toLabel.layoutX = 20
    toLabel.layoutY = 100
    toLabel.setFont(new Font(20))

    val toText = new TextField()
    toText.layoutX = 20
    toText.layoutY = 150

    if (error) {
      val alert = new Alert(AlertType.Information, "error").showAndWait()
    }
    var list :List[Label] = List()
    val label1 = new Label("")
    label1.layoutX = 280
    label1.layoutY = 100
    list = list :+ label1
    label1.setFont(new Font(70))
    val label2 = new Label("")
    label2.layoutX = 375
    label2.layoutY = 100
    list = list :+ label2
    label2.setFont(new Font(70))
    val label3 = new Label("")
    label3.layoutX = 475
    label3.layoutY = 100
    list = list :+ label3
    label3.setFont(new Font(70))
    val label4 = new Label("")
    label4.layoutX = 275
    label4.layoutY = 200
    list = list :+ label4
    label4.setFont(new Font(70))
    val label5 = new Label("")
    label5.layoutX = 375
    label5.layoutY = 200
    list = list :+ label5
    label5.setFont(new Font(70))
    val label6 = new Label("")
    label6.layoutX = 475
    label6.layoutY = 200
    list = list :+ label6
    label6.setFont(new Font(70))
    val label7 = new Label("")
    label7.layoutX = 275
    label7.layoutY = 300
    list = list :+ label7
    label7.setFont(new Font(70))
    val label8 = new Label("")
    label8.layoutX = 375
    label8.layoutY = 300
    list = list :+ label8
    label8.setFont(new Font(70))
    val label9 = new Label("")
    label9.layoutX = 475
    label9.layoutY = 300
    list = list :+ label9
    label9.setFont(new Font(70))

    val label10 = new Label("a")
    label10.layoutX = 300
    label10.layoutY = 85
    val label11 = new Label("b")
    label11.layoutX = 400
    label11.layoutY = 85
    val label12 = new Label("c")
    label12.layoutX = 500
    label12.layoutY = 85

    val label13 = new Label("a")
    label13.layoutX = 300
    label13.layoutY = 410
    val label14 = new Label("b")
    label14.layoutX = 400
    label14.layoutY = 410
    val label15 = new Label("c")
    label15.layoutX = 500
    label15.layoutY = 410

    val label22 = new Label("1")
    label22.layoutX = 220
    label22.layoutY = 350
    val label23 = new Label("2")
    label23.layoutX = 220
    label23.layoutY = 250
    val label24 = new Label("3")
    label24.layoutX = 220
    label24.layoutY = 150

    val label25 = new Label("1")
    label25.layoutX = 580
    label25.layoutY = 350
    val label26 = new Label("2")
    label26.layoutX = 580
    label26.layoutY = 250
    val label27 = new Label("3")
    label27.layoutX = 580
    label27.layoutY = 150

    val XLable = new Label("X Turn")
    XLable.layoutX = 630
    XLable.layoutY = 100
    XLable.setFont(new Font(40))

    val OLable = new Label("O Turn")
    OLable.layoutX = 630
    OLable.layoutY = 300
    OLable.setFont(new Font(40))
    OLable.visible = false

    val invalid = new Label("Invalid Input")
    invalid.layoutX = 630
    invalid.layoutY = 400
    invalid.textFill = Color.Red
    invalid.setFont(new Font(40))
    invalid.visible = false

    def update(): Unit ={
      var temp = tic_tac_toe.getState
      //temp.map(_.mkString(" ")).foreach(println)
      var i = 0
      var j = 0
      while (i<3){
        while (j<3){
          if(temp(i)(j) == "X")
            list(3*i + j).text = "X"
          else if (temp(i)(j) == "O")
            list((3 * i + j)).text = "O"
          else list((3 * i + j)).text =  ""
          j +=1
        }
        i+=1
        j = 0
      }
    }

    val submit = new Button("Movement Submit")
    submit.layoutX = 20
    submit.layoutY = 300
    submit.setOnMouseClicked((e) => {
      if(toText.text.value.length == 2){
        if(tic_tac_toe.Validate(toText.text.value,XTurn)){
          update
          XTurn = !XTurn
          if (XTurn) {
            XLable.setVisible(true)
            OLable.setVisible(false)
          } else {
            OLable.setVisible(true)
            XLable.setVisible(false)
          }
          invalid.visible  = false
        }
        else invalid.visible   = true
      }
      else invalid.visible   = true
      toText.text.value  = ""

    })

    val lis = List(rectangle,rectangle1,rectangle2,rectangle3,rectangle4
      ,rectangle5,rectangle6,rectangle7,rectangle8,rectangle9,label13,label14,
      label1 ,label2 ,label3,label4 ,label5, label6,label7,label8,label9,label15
      ,label10,label11,label12,label22,label23,label24,label25,label26,label27
      ,labelTitle, toLabel, toText, submit, OLable,XLable,invalid)
   // if (XTurn) {
      //OLable.setVisible(false)
      return (lis)
    //} else {
     // XLable.setVisible(false)
    //  return (list)
   // }
  }

}
