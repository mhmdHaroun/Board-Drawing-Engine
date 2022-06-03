import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control._
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle}
import scalafx.scene.text.Font
import scalafx.scene.{Cursor, Group, Node}

import scala.language.postfixOps

object Checkers_Gui  {
  def  CheckersView (): Seq[Node] = List{
    val error = false;
    var BlackTurn = false
    val root = new Group
    var player = false
    var checkers = new Checkers
      var list :List[Circle] = List()
      var circle1 =  Circle(285,110 ,20)
      list = list :+ circle1
      var circle2 =  Circle(425,110 ,20)
      list = list :+ circle2
      var circle3 = Circle(565,110,20)
      list = list :+ circle3
      var circle4 = Circle(705,110,20)
      list = list :+ circle4
      var circle5 = Circle(215,170,20)
      list = list :+ circle5
      var circle6 = Circle(355,170,20)
      list = list :+ circle6
      var circle7 = Circle(495,170,20)
      list = list :+ circle7
      var circle8 = Circle(635,170,20)
      list = list :+ circle8
      var circle9 = Circle(285,230,20)
      list = list :+ circle9
      var circle10 = Circle(425,230,20)
      list = list :+ circle10
      var circle11 = Circle(565,230,20)
      list = list :+ circle11
      var circle12 = Circle(705,230,20)
      list = list :+ circle12

      var circle13 =  Circle(215,290 ,20,null)
      list = list :+ circle13
      var circle14 =  Circle(355,290 ,20,null)
      list = list :+ circle14
      var circle15 = Circle(495,290,20,null)
      list = list :+ circle15
      var circle16 = Circle(635,290,20,null)
      list = list :+ circle16
      var circle17 = Circle(285,350,20,null)
      list = list :+ circle17
      var circle18 = Circle(425,350,20,null)
      list = list :+ circle18
      var circle19 = Circle(565,350,20,null)
      list = list :+ circle19
      var circle20 = Circle(705,350,20,null)
      list = list :+ circle20
    var circle21 =  Circle(215,410 ,20, Color.Maroon)
    list = list :+ circle21
    var circle22 =  Circle(355,410 ,20, Color.Maroon)
    list = list :+ circle22
    var circle23 = Circle(495,410,20, Color.Maroon)
    list = list :+ circle23
    var circle24 = Circle(635,410,20, Color.Maroon)
    list = list :+ circle24

    var circle25 = Circle(285,470,20, Color.Maroon)
    list = list :+ circle25
    var circle26 = Circle(425,470,20, Color.Maroon)
    list = list :+ circle26
    var circle27 = Circle(565,470,20, Color.Maroon)
    list = list :+ circle27
    var circle28 = Circle(705,470,20, Color.Maroon)
    list = list :+ circle28

    var circle29 = Circle(215,530,20, Color.Maroon)
    list = list :+ circle29
    var circle30 = Circle(355,530,20, Color.Maroon)
    list = list :+ circle30
    var circle31 = Circle(495,530,20, Color.Maroon)
    list = list :+ circle31
    var circle32 = Circle(635,530,20, Color.Maroon)
    list = list :+ circle32


    var rectangle1 = Rectangle(70, 60)
    rectangle1.layoutX = 180
    rectangle1.layoutY = 80
    rectangle1.fill = Color.White
    var rectangle2 = Rectangle(70, 60)
    rectangle2.layoutX = 250
    rectangle2.layoutY = 80
    rectangle2.fill = Color.Grey
    rectangle2.cursor = Cursor.Hand
    var rectangle3 = Rectangle(70, 60)
    rectangle3.layoutX = 320
    rectangle3.layoutY = 80
    rectangle3.fill = Color.White
    rectangle3.cursor = Cursor.Hand
    var rectangle4 = Rectangle(70, 60)
    rectangle4.layoutX = 390
    rectangle4.layoutY = 80
    rectangle4.fill = Color.Grey
    rectangle4.cursor = Cursor.Hand
    var rectangle5 = Rectangle(70, 60)
    rectangle5.layoutX = 460
    rectangle5.layoutY = 80
    rectangle5.fill = Color.White
    rectangle5.cursor = Cursor.Hand
    var rectangle6 = Rectangle(70, 60)
    rectangle6.layoutX = 530
    rectangle6.layoutY = 80
    rectangle6.fill = Color.Grey
    rectangle6.cursor = Cursor.Hand
    var rectangle7 = Rectangle(70, 60)
    rectangle7.layoutX = 600
    rectangle7.layoutY = 80
    rectangle7.fill = Color.White
    rectangle7.cursor = Cursor.Hand
    var rectangle8 = Rectangle(70, 60)
    rectangle8.layoutX = 670
    rectangle8.layoutY = 80
    rectangle8.fill = Color.Grey
    rectangle8.cursor = Cursor.Hand
    //second row
    var rectangle9 = Rectangle(70, 60)
    rectangle9.layoutX = 180
    rectangle9.layoutY = 140
    rectangle9.fill = Color.Grey
    rectangle9.cursor = Cursor.Hand
    var rectangle10 = Rectangle(70, 60)
    rectangle10.layoutX = 250
    rectangle10.layoutY = 140
    rectangle10.fill = Color.White
    rectangle10.cursor = Cursor.Hand
    var rectangle11 = Rectangle(70, 60)
    rectangle11.layoutX = 320
    rectangle11.layoutY = 140
    rectangle11.fill = Color.Grey
    rectangle11.cursor = Cursor.Hand
    var rectangle12 = Rectangle(70, 60)
    rectangle12.layoutX = 390
    rectangle12.layoutY = 140
    rectangle12.fill = Color.White
    rectangle12.cursor = Cursor.Hand
    var rectangle13 = Rectangle(70, 60)
    rectangle13.layoutX = 460
    rectangle13.layoutY = 140
    rectangle13.fill = Color.Grey
    rectangle13.cursor = Cursor.Hand
    var rectangle14 = Rectangle(70, 60)
    rectangle14.layoutX = 530
    rectangle14.layoutY = 140
    rectangle14.fill = Color.White
    rectangle14.cursor = Cursor.Hand
    var rectangle15 = Rectangle(70, 60)
    rectangle15.layoutX = 600
    rectangle15.layoutY = 140
    rectangle15.fill = Color.Grey
    rectangle15.cursor = Cursor.Hand
    var rectangle16 = Rectangle(70, 60)
    rectangle16.layoutX = 670
    rectangle16.layoutY = 140
    rectangle16.fill = Color.White
    rectangle16.cursor = Cursor.Hand
    //third row
    var rectangle17 = Rectangle(70, 60)
    rectangle17.layoutX = 180
    rectangle17.layoutY = 200
    rectangle17.fill = Color.White
    rectangle17.cursor = Cursor.Hand
    var rectangle18 = Rectangle(70, 60)
    rectangle18.layoutX = 250
    rectangle18.layoutY = 200
    rectangle18.fill = Color.Grey
    rectangle18.cursor = Cursor.Hand
    var rectangle19 = Rectangle(70, 60)
    rectangle19.layoutX = 320
    rectangle19.layoutY = 200
    rectangle19.fill = Color.White
    rectangle19.cursor = Cursor.Hand
    var rectangle20 = Rectangle(70, 60)
    rectangle20.layoutX = 390
    rectangle20.layoutY = 200
    rectangle20.fill = Color.Grey
    rectangle20.cursor = Cursor.Hand
    var rectangle21 = Rectangle(70, 60)
    rectangle21.layoutX = 460
    rectangle21.layoutY = 200
    rectangle21.fill = Color.White
    rectangle21.cursor = Cursor.Hand
    var rectangle22 = Rectangle(70, 60)
    rectangle22.layoutX = 530
    rectangle22.layoutY = 200
    rectangle22.fill = Color.Grey
    rectangle22.cursor = Cursor.Hand
    var rectangle23 = Rectangle(70, 60)
    rectangle23.layoutX = 600
    rectangle23.layoutY = 200
    rectangle23.fill = Color.White
    rectangle23.cursor = Cursor.Hand
    var rectangle24 = Rectangle(70, 60)
    rectangle24.layoutX = 670
    rectangle24.layoutY = 200
    rectangle24.fill = Color.Grey
    rectangle24.cursor = Cursor.Hand
    //fourth
    var rectangle25 = Rectangle(70, 60)
    rectangle25.layoutX = 180
    rectangle25.layoutY = 260
    rectangle25.fill = Color.Grey
    rectangle25.cursor = Cursor.Hand
    var rectangle26 = Rectangle(70, 60)
    rectangle26.layoutX = 250
    rectangle26.layoutY = 260
    rectangle26.fill = Color.White
    rectangle26.cursor = Cursor.Hand
    var rectangle27 = Rectangle(70, 60)
    rectangle27.layoutX = 320
    rectangle27.layoutY = 260
    rectangle27.fill = Color.Grey
    rectangle27.cursor = Cursor.Hand
    var rectangle28 = Rectangle(70, 60)
    rectangle28.layoutX = 390
    rectangle28.layoutY = 260
    rectangle28.fill = Color.White
    rectangle28.cursor = Cursor.Hand
    var rectangle29 = Rectangle(70, 60)
    rectangle29.layoutX = 460
    rectangle29.layoutY = 260
    rectangle29.fill = Color.Grey
    rectangle29.cursor = Cursor.Hand
    var rectangle30 = Rectangle(70, 60)
    rectangle30.layoutX = 530
    rectangle30.layoutY = 260
    rectangle30.fill = Color.White
    rectangle30.cursor = Cursor.Hand
    var rectangle31 = Rectangle(70, 60)
    rectangle31.layoutX = 600
    rectangle31.layoutY = 260
    rectangle31.fill = Color.Grey
    rectangle31.cursor = Cursor.Hand
    var rectangle32 = Rectangle(70, 60)
    rectangle32.layoutX = 670
    rectangle32.layoutY = 260
    rectangle32.fill = Color.White
    rectangle32.cursor = Cursor.Hand

    var rectangle33 = Rectangle(70, 60)
    rectangle33.layoutX = 180
    rectangle33.layoutY = 320
    rectangle33.fill = Color.White
    rectangle33.cursor = Cursor.Hand
    var rectangle34 = Rectangle(70, 60)
    rectangle34.layoutX = 250
    rectangle34.layoutY = 320
    rectangle34.fill = Color.Grey
    rectangle34.cursor = Cursor.Hand
    var rectangle35 = Rectangle(70, 60)
    rectangle35.layoutX = 320
    rectangle35.layoutY = 320
    rectangle35.fill = Color.White
    rectangle35.cursor = Cursor.Hand
    var rectangle36 = Rectangle(70, 60)
    rectangle36.layoutX = 390
    rectangle36.layoutY = 320
    rectangle36.fill = Color.Grey
    rectangle36.cursor = Cursor.Hand
    var rectangle37 = Rectangle(70, 60)
    rectangle37.layoutX = 460
    rectangle37.layoutY = 320
    rectangle37.fill = Color.White
    rectangle37.cursor = Cursor.Hand
    var rectangle38 = Rectangle(70, 60)
    rectangle38.layoutX = 530
    rectangle38.layoutY = 320
    rectangle38.fill = Color.Grey
    rectangle38.cursor = Cursor.Hand
    var rectangle39 = Rectangle(70, 60)
    rectangle39.layoutX = 600
    rectangle39.layoutY = 320
    rectangle39.fill = Color.White
    rectangle39.cursor = Cursor.Hand
    var rectangle40 = Rectangle(70, 60)
    rectangle40.layoutX = 670
    rectangle40.layoutY = 320
    rectangle40.fill = Color.Grey
    rectangle40.cursor = Cursor.Hand
    //new row
    var rectangle41 = Rectangle(70, 60)
    rectangle41.layoutX = 180
    rectangle41.layoutY = 380
    rectangle41.fill = Color.Grey
    rectangle41.cursor = Cursor.Hand
    var rectangle42 = Rectangle(70, 60)
    rectangle42.layoutX = 250
    rectangle42.layoutY = 380
    rectangle42.fill = Color.White
    rectangle42.cursor = Cursor.Hand
    var rectangle43 = Rectangle(70, 60)
    rectangle43.layoutX = 320
    rectangle43.layoutY = 380
    rectangle43.fill = Color.Grey
    rectangle43.cursor = Cursor.Hand
    var rectangle44 = Rectangle(70, 60)
    rectangle44.layoutX = 390
    rectangle44.layoutY = 380
    rectangle44.fill = Color.White
    rectangle44.cursor = Cursor.Hand
    var rectangle45 = Rectangle(70, 60)
    rectangle45.layoutX = 460
    rectangle45.layoutY = 380
    rectangle45.fill = Color.Grey
    rectangle45.cursor = Cursor.Hand
    var rectangle46 = Rectangle(70, 60)
    rectangle46.layoutX = 530
    rectangle46.layoutY = 380
    rectangle46.fill = Color.White
    rectangle46.cursor = Cursor.Hand
    var rectangle47 = Rectangle(70, 60)
    rectangle47.layoutX = 600
    rectangle47.layoutY = 380
    rectangle47.fill = Color.Grey
    rectangle47.cursor = Cursor.Hand
    var rectangle48 = Rectangle(70, 60)
    rectangle48.layoutX = 670
    rectangle48.layoutY = 380
    rectangle48.fill = Color.White
    rectangle48.cursor = Cursor.Hand

    var rectangle49 = Rectangle(70, 60)
    rectangle49.layoutX = 180
    rectangle49.layoutY = 440
    rectangle49.fill = Color.White
    rectangle49.cursor = Cursor.Hand
    var rectangle50 = Rectangle(70, 60)
    rectangle50.layoutX = 250
    rectangle50.layoutY = 440
    rectangle50.fill = Color.Grey
    rectangle50.cursor = Cursor.Hand
    var rectangle51 = Rectangle(70, 60)
    rectangle51.layoutX = 320
    rectangle51.layoutY = 440
    rectangle51.fill = Color.White
    rectangle51.cursor = Cursor.Hand
    var rectangle52 = Rectangle(70, 60)
    rectangle52.layoutX = 390
    rectangle52.layoutY = 440
    rectangle52.fill = Color.Grey
    rectangle52.cursor = Cursor.Hand
    var rectangle53 = Rectangle(70, 60)
    rectangle53.layoutX = 460
    rectangle53.layoutY = 440
    rectangle53.fill = Color.White
    rectangle53.cursor = Cursor.Hand
    var rectangle54 = Rectangle(70, 60)
    rectangle54.layoutX = 530
    rectangle54.layoutY = 440
    rectangle54.fill = Color.Grey
    rectangle54.cursor = Cursor.Hand
    var rectangle55 = Rectangle(70, 60)
    rectangle55.layoutX = 600
    rectangle55.layoutY = 440
    rectangle55.fill = Color.White
    rectangle55.cursor = Cursor.Hand
    var rectangle56 = Rectangle(70, 60)
    rectangle56.layoutX = 670
    rectangle56.layoutY = 440
    rectangle56.fill = Color.Grey
    rectangle56.cursor = Cursor.Hand

    var rectangle57 = Rectangle(70, 60)
    rectangle57.layoutX = 180
    rectangle57.layoutY = 500
    rectangle57.fill = Color.Grey
    rectangle57.cursor = Cursor.Hand
    var rectangle58 = Rectangle(70, 60)
    rectangle58.layoutX = 250
    rectangle58.layoutY = 500
    rectangle58.fill = Color.White
    rectangle58.cursor = Cursor.Hand
    var rectangle59 = Rectangle(70, 60)
    rectangle59.layoutX = 320
    rectangle59.layoutY = 500
    rectangle59.fill = Color.Grey
    rectangle59.cursor = Cursor.Hand
    var rectangle60 = Rectangle(70, 60)
    rectangle60.layoutX = 390
    rectangle60.layoutY = 500
    rectangle60.fill = Color.White
    rectangle60.cursor = Cursor.Hand
    var rectangle61 = Rectangle(70, 60)
    rectangle61.layoutX = 460
    rectangle61.layoutY = 500
    rectangle61.fill = Color.Grey
    rectangle61.cursor = Cursor.Hand
    var rectangle62 = Rectangle(70, 60)
    rectangle62.layoutX = 530
    rectangle62.layoutY = 500
    rectangle62.fill = Color.White
    rectangle62.cursor = Cursor.Hand
    var rectangle63 = Rectangle(70, 60)
    rectangle63.layoutX = 600
    rectangle63.layoutY = 500
    rectangle63.fill = Color.Grey
    rectangle63.cursor = Cursor.Hand
    var rectangle64 = Rectangle(70, 60)
    rectangle64.layoutX = 670
    rectangle64.layoutY = 500
    rectangle64.fill = Color.White
    rectangle64.cursor = Cursor.Hand

    val label1 = new Label("a")
    label1.layoutX = 205
    label1.layoutY = 65
    val label2 = new Label("b")
    label2.layoutX = 280
    label2.layoutY = 65
    val label3 = new Label("c")
    label3.layoutX = 355
    label3.layoutY = 65
    val label4 = new Label("d")
    label4.layoutX = 420
    label4.layoutY = 65
    val label5 = new Label("e")
    label5.layoutX = 490
    label5.layoutY = 65
    val label6 = new Label("f")
    label6.layoutX = 560
    label6.layoutY = 65
    val label7 = new Label("g")
    label7.layoutX = 635
    label7.layoutY = 65
    val label8 = new Label("h")
    label8.layoutX = 700
    label8.layoutY = 65


    val label9 = new Label("a")
    label9.layoutX = 205
    label9.layoutY = 565
    val label10 = new Label("b")
    label10.layoutX = 280
    label10.layoutY = 565
    val label11 = new Label("c")
    label11.layoutX = 355
    label11.layoutY = 565
    val label12 = new Label("d")
    label12.layoutX = 420
    label12.layoutY = 565
    val label13 = new Label("e")
    label13.layoutX = 490
    label13.layoutY = 565
    val label14 = new Label("f")
    label14.layoutX = 560
    label14.layoutY = 565
    val label15 = new Label("g")
    label15.layoutX = 635
    label15.layoutY = 565
    val label16 = new Label("h")
    label16.layoutX = 700
    label16.layoutY = 565


    val label17 = new Label("8")
    label17.layoutX = 170
    label17.layoutY = 100
    val label18 = new Label("7")
    label18.layoutX = 170
    label18.layoutY = 160
    val label19 = new Label("6")
    label19.layoutX = 170
    label19.layoutY = 220
    val label20 = new Label("5")
    label20.layoutX = 170
    label20.layoutY = 280
    val label21 = new Label("4")
    label21.layoutX = 170
    label21.layoutY = 340
    val label22 = new Label("3")
    label22.layoutX = 170
    label22.layoutY = 400
    val label23 = new Label("2")
    label23.layoutX = 170
    label23.layoutY = 460
    val label24 = new Label("1")
    label24.layoutX = 170
    label24.layoutY = 520

    val label25 = new Label("8")
    label25.layoutX = 760
    label25.layoutY = 100
    val label26 = new Label("7")
    label26.layoutX = 760
    label26.layoutY = 160
    val label27 = new Label("6")
    label27.layoutX = 760
    label27.layoutY = 220
    val label28 = new Label("5")
    label28.layoutX = 760
    label28.layoutY = 280
    val label29 = new Label("4")
    label29.layoutX = 760
    label29.layoutY = 340
    val label30 = new Label("3")
    label30.layoutX = 760
    label30.layoutY = 400
    val label31 = new Label("2")
    label31.layoutX = 760
    label31.layoutY = 460
    val label32 = new Label("1")
    label32.layoutX = 760
    label32.layoutY = 520
    rectangle1.cursor = Cursor.HAND

      //          var circle21 = Circle(155,200,20)
      //          var circle22 = Circle(295,200,20)
      //          var circle23 = Circle(435,200,20)
      //          var circle24 = Circle(575,200,20)

    var labelTitle = new Label("Checkers Game")
    labelTitle.layoutY = 10
    labelTitle.layoutX = 420
    labelTitle.setFont(new Font(40))

    var rectangle = Rectangle(640, 640)
    rectangle.fill = Color.Black
    rectangle.layoutX = 250
    rectangle.layoutY = 100

    val fromLabel = new Label("From")
    fromLabel.layoutX = 20
    fromLabel.layoutY = 100
    fromLabel.setFont(new Font(20))

    val fromText = new TextField()
    fromText.layoutX = 20
    fromText.layoutY = 150


    val toLabel = new Label("To")
    toLabel.layoutX = 20
    toLabel.layoutY = 250
    toLabel.setFont(new Font(20))

    val toText = new TextField()
    toText.layoutX = 20
    toText.layoutY = 300

    if (error) {
      val alert = new Alert(AlertType.Information, "error").showAndWait()
    } //for wrong movement and keshmat ant etc...


    val blackLable = new Label("Black Turn")
    blackLable.layoutX = 950
    blackLable.layoutY = 100
    blackLable.setFont(new Font(40))
    blackLable.visible = false

    val whiteLable = new Label("Red Turn")
    whiteLable.layoutX = 950
    whiteLable.layoutY = 300
    whiteLable.setFont(new Font(40))

    def piece(x:String):Color = {
      if(x.contains("30"))
        Color.Maroon
      else if (x.contains("38"))
        Color.BLACK
      else
        null
    }
    def update(): Unit ={
      var temp = checkers.state
      //temp.map(_.mkString(" ")).foreach(println)
      var i = 0
      var j = 0
      while (i<8){
        while (j<8){
          if(temp(i)(j).contains("46"))
            list((8 * i + j) / 2).fill = piece(temp(i)(j))

          j +=1
        }
        i+=1
        j = 0
      }
    }
    val invalid = new Label("Invalid Input")
    invalid.layoutX = 950
    invalid.layoutY = 400
    invalid.textFill = Color.Red
    invalid.setFont(new Font(40))
    invalid.visible = false
    val submit = new Button("Movement Submit")
    submit.layoutX = 20
    submit.layoutY = 400
    submit.setOnMouseClicked((e) => {
      if(fromText.text.value.length==2 && toText.text.value.length==2){
        if(checkers.validate(fromText.text.value+toText.text.value,BlackTurn)){
          BlackTurn = !BlackTurn
          if (BlackTurn) {
            blackLable.setVisible(true)
            whiteLable.setVisible(false)
          } else {
            whiteLable.setVisible(true)
            blackLable.setVisible(false)
          }
          update()
          invalid.visible = false
        }
        else invalid.visible = true
      }
      else invalid.visible = true
      fromText.text.value = ""
      toText.text.value   = ""

    })

    val lis = List(rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8,rectangle9, rectangle10, rectangle11,rectangle12,
      rectangle13,rectangle14,rectangle15, rectangle16,rectangle17, rectangle18, rectangle19, rectangle20,
      rectangle21, rectangle22, rectangle23, rectangle24,rectangle25, rectangle26, rectangle27, rectangle28,
      rectangle29, rectangle30, rectangle31, rectangle32,
      rectangle33,rectangle34,rectangle35, rectangle36,
      rectangle37,rectangle38,rectangle39,rectangle40,
      rectangle41,rectangle42,rectangle43,rectangle44,
      rectangle45,rectangle46,rectangle47,rectangle48,
      rectangle49,rectangle50,rectangle51,rectangle52,
      rectangle53,rectangle54,rectangle55,rectangle56,
      rectangle57,rectangle58,rectangle59,rectangle60,
      rectangle61,rectangle62,rectangle63,rectangle64,
      circle1,circle2, circle3,circle4,circle5,circle6,circle7,circle8,
      circle9,circle10,circle11,circle12,
      circle13, circle14,circle15,circle16,circle17,circle18,circle19,circle20,
      circle21,circle22,circle23,circle24,circle25,circle26,circle27,circle28,
      circle29,circle30,circle31,circle32,
      label1,label2,label3,label4,label5,
      label6,label7,label8,label9,label10,label11,
      label12,label13,label14,label15,label16,
      label17, label18,label19,label20,label21
      ,label22,label23,label24,label25,label26,label27,label28,
      label29,label30,label31,label32,
      labelTitle, fromLabel, fromText, toLabel, toText, submit, whiteLable,blackLable,invalid)
      return lis
  }
}