import scalafx.scene.Node
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control._
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle}
import scalafx.scene.text.Font

import scala.language.postfixOps

object ConnectFour extends {
  def  ConnectFourView (): Seq[Node] = List {
    var error = false;
    var YellowTurn = true
    var connect_4 = new Connect_4()
    var labelTitle = new Label("Connect-4 Game")
    labelTitle.layoutY = 10
    labelTitle.layoutX = 420
    labelTitle.setFont(new Font(40))

    var list :List[Circle] = List()
    var circle1 =  Circle(250,150 ,25,Color.White)
    list = list :+ circle1
    var circle2 =  Circle(350,150 ,25,Color.White)
    list = list :+ circle2
    var circle3 = Circle(450,150,25,Color.White)
    list = list :+ circle3
    var circle4 = Circle(550,150,25,Color.White)
    list = list :+ circle4
    var circle5 = Circle(650,150,25,Color.White)
    list = list :+ circle5
    var circle6 = Circle(750,150,25,Color.White)
    list = list :+ circle6
    var circle7 = Circle(850,150,25,Color.White)
    list = list :+ circle7

    var circle8 =  Circle(250,250 ,25,Color.White)
    list = list :+ circle8
    var circle9 =  Circle(350,250 ,25,Color.White)
    list = list :+ circle9
    var circle10 = Circle(450,250,25,Color.White)
    list = list :+ circle10
    var circle11 = Circle(550,250,25,Color.White)
    list = list :+ circle11
    var circle12 = Circle(650,250,25,Color.White)
    list = list :+ circle12
    var circle13 = Circle(750,250,25,Color.White)
    list = list :+ circle13
    var circle14 = Circle(850,250,25,Color.White)
    list = list :+ circle14

    var circle15 =  Circle(250,350 ,25,Color.White)
    list = list :+ circle15
    var circle16 =  Circle(350,350 ,25,Color.White)
    list = list :+ circle16
    var circle17 = Circle(450,350,25,Color.White)
    list = list :+ circle17
    var circle18 = Circle(550,350,25,Color.White)
    list = list :+ circle18
    var circle19 = Circle(650,350,25,Color.White)
    list = list :+ circle19
    var circle20 = Circle(750,350,25,Color.White)
    list = list :+ circle20
    var circle21 = Circle(850,350,25,Color.White)
    list = list :+ circle21

    var circle22 =  Circle(250,450 ,25,Color.White)
    list = list :+ circle22
    var circle23 =  Circle(350,450 ,25,Color.White)
    list = list :+ circle23
    var circle24 = Circle(450,450,25,Color.White)
    list = list :+ circle24
    var circle25 = Circle(550,450,25,Color.White)
    list = list :+ circle25
    var circle26 = Circle(650,450,25,Color.White)
    list = list :+ circle26
    var circle27 = Circle(750,450,25,Color.White)
    list = list :+ circle27
    var circle28 = Circle(850,450,25,Color.White)
    list = list :+ circle28

    var circle29 =  Circle(250,550 ,25,Color.White)
    list = list :+ circle29
    var circle30 =  Circle(350,550 ,25,Color.White)
    list = list :+ circle30
    var circle31 = Circle(450,550,25,Color.White)
    list = list :+ circle31
    var circle32 = Circle(550,550,25,Color.White)
    list = list :+ circle32
    var circle33 = Circle(650,550,25,Color.White)
    list = list :+ circle33
    var circle34 = Circle(750,550,25,Color.White)
    list = list :+ circle34
    var circle35 = Circle(850,550,25,Color.White)
    list = list :+ circle35

    var circle36 =  Circle(250,650 ,25,Color.White)
    list = list :+ circle36
    var circle37 =  Circle(350,650 ,25,Color.White)
    list = list :+ circle37
    var circle38 = Circle(450,650,25,Color.White)
    list = list :+ circle38
    var circle39 = Circle(550,650,25,Color.White)
    list = list :+ circle39
    var circle40 = Circle(650,650,25,Color.White)
    list = list :+ circle40
    var circle41 = Circle(750,650,25,Color.White)
    list = list :+ circle41
    var circle42 = Circle(850,650,25,Color.White)
    list = list :+ circle42

    val label1 = new Label("a")
    label1.layoutX = 250
    label1.layoutY = 80
    val label2 = new Label("b")
    label2.layoutX = 350
    label2.layoutY = 80
    val label3 = new Label("c")
    label3.layoutX = 450
    label3.layoutY = 80
    val label4 = new Label("d")
    label4.layoutX = 550
    label4.layoutY = 80
    val label5 = new Label("e")
    label5.layoutX = 650
    label5.layoutY = 80
    val label6 = new Label("f")
    label6.layoutX = 750
    label6.layoutY = 80
    val label7 = new Label("g")
    label7.layoutX = 850
    label7.layoutY = 80

    val label8 = new Label("a")
    label8.layoutX = 250
    label8.layoutY = 720
    val label9 = new Label("b")
    label9.layoutX = 350
    label9.layoutY = 720
    val label10 = new Label("c")
    label10.layoutX = 450
    label10.layoutY = 720
    val label11 = new Label("d")
    label11.layoutX = 550
    label11.layoutY = 720
    val label12 = new Label("e")
    label12.layoutX = 650
    label12.layoutY = 720
    val label13 = new Label("f")
    label13.layoutX = 750
    label13.layoutY = 720
    val label14 = new Label("g")
    label14.layoutX = 850
    label14.layoutY = 720

    var rectangle = Rectangle(700, 600)
    rectangle.fill = Color.Blue
    rectangle.layoutX = 200
    rectangle.layoutY = 100

    val toLabel = new Label("To")
    toLabel.layoutX = 30
    toLabel.layoutY = 150
    toLabel.setFont(new Font(20))

    val toText = new TextField()
    toText.layoutX = 30
    toText.layoutY = 200

    if (error) {
      val alert = new Alert(AlertType.Information, "error").showAndWait()
    }


    val YellowLable = new Label("Yellow Turn")
    YellowLable.layoutX = 950
    YellowLable.layoutY = 150
    YellowLable.setFont(new Font(40))

    val RedLable = new Label("Red Turn")
    RedLable.layoutX = 950
    RedLable.layoutY = 350
    RedLable.setFont(new Font(40))

    def update(): Unit ={
      var temp = connect_4.getState
      //temp.map(_.mkString(" ")).foreach(println)
      var i = 0
      var j = 0
      while (i<6){
        while (j<7){
          if(temp(i)(j) == "y")
            list((7 * i + j)).fill = Color.Yellow
          else if (temp(i)(j) == "r")
            list((7 * i + j)).fill = Color.Red
          else list((7 * i + j)).fill = Color.White
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
    submit.layoutX = 30
    submit.layoutY = 350
    submit.setOnMouseClicked((e) => {
      if(toText.text.value.length == 1){
        if(connect_4.Validate(toText.text.value ,YellowTurn)) {
          update
          YellowTurn = !YellowTurn
          if (YellowTurn) {
            YellowLable.setVisible(true)
            RedLable.setVisible(false)
          } else {
            RedLable.setVisible(true)
            YellowLable.setVisible(false)
          }
          invalid.visible  = false
        }
        else invalid.visible   = true
      }
      else invalid.visible   = true
      toText.text.value  = ""
    })

    val lis = List(rectangle,circle1,circle2, circle3,circle4,circle5,circle6,circle7,circle8,
      circle9,circle10,circle11,circle12,
      circle13, circle14,circle15,circle16,circle17,circle18,circle19,circle20,
      circle21,circle22,circle23,circle24,circle25,circle26,circle27,circle28,
      circle29,circle30,circle31,circle32,circle33,circle34,circle35,circle36,
      circle37,circle38,circle39,circle40,circle41,circle42,
      label1,label2,label3,label4,label5, label6,label7,
      label8,label9,label10,label11, label12,label13,label14,
      labelTitle, toLabel, toText, submit, YellowLable,RedLable,invalid)

    if (YellowTurn) {
      RedLable.setVisible(false)
      return (lis)

    } else {
      YellowLable.setVisible(false)
      return (lis)
    }
  }

}
