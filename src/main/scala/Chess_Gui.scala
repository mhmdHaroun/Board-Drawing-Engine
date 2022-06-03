import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control._
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle
import scalafx.scene.text.Font
import scalafx.scene.{Cursor, Group, Node}

import scala.language.postfixOps

object Chess_Gui extends {

  def  ChssView (): Seq[Node] = List {
    var chess = new Chess()
    val path = "C:\\Users\\abdos\\Desktop\\chess\\chess"
    val root = new Group

    val error = false;
    var WhiteTurn = true
    var labelTitle = new Label("Chess Game")
    labelTitle.layoutY = 10
    labelTitle.layoutX = 420
    labelTitle.setFont(new Font(40))

    var list :List[ImageView] = List()
    val w_r = new Image(path + "\\Chess_rdt60.PNG")
    val w_n = new Image(path + "\\Chess_ndt60.PNG")
    val w_b = new Image(path + "\\Chess_bdt60.PNG")
    val w_q = new Image(path + "\\Chess_qdt60.PNG")
    val w_k = new Image(path + "\\Chess_kdt60.PNG")
    val w_p = new Image(path + "\\Chess_pdt60.PNG")
    val view1 = new ImageView(w_r)
    view1.fitHeight = 50
    view1.fitWidth = 50
    view1.layoutY = 80
    view1.layoutX = 190
    list = list :+ view1
    val view2 = new ImageView(w_n)
    view2.fitHeight = 50
    view2.fitWidth = 50
    view2.layoutY = 80
    view2.layoutX = 260
    list = list :+ view2
    val view3 = new ImageView(w_b)
    view3.fitHeight = 50
    view3.fitWidth = 50
    view3.layoutY = 80
    view3.layoutX = 330
    list = list :+ view3
    val view4 = new ImageView(w_q)
    view4.fitHeight = 50
    view4.fitWidth = 50
    view4.layoutY = 80
    view4.layoutX = 400
    list = list :+ view4
    val view5 = new ImageView(w_k)
    view5.fitHeight = 50
    view5.fitWidth = 50
    view5.layoutY = 80
    view5.layoutX = 470
    list = list :+ view5
    val view6 = new ImageView(w_b)
    view6.fitHeight = 50
    view6.fitWidth = 50
    view6.layoutY = 80
    view6.layoutX = 540
    list = list :+ view6
    val view7 = new ImageView(w_n)
    view7.fitHeight = 50
    view7.fitWidth = 50
    view7.layoutY = 80
    view7.layoutX = 610
    list = list :+ view7
    val view8 = new ImageView(w_r)
    view8.fitHeight = 50
    view8.fitWidth = 50
    view8.layoutY = 80
    view8.layoutX = 680
    list = list :+ view8

    var view9 = new ImageView(w_p)
    view9.fitHeight = 50
    view9.fitWidth = 50
    view9.layoutY = 140
    view9.layoutX = 190
    list = list :+ view9
    val view10 = new ImageView(w_p)
    view10.fitHeight = 50
    view10.fitWidth = 50
    view10.layoutY = 140
    view10.layoutX = 260
    list = list :+ view10
    val view11 = new ImageView(w_p)
    view11.fitHeight = 50
    view11.fitWidth = 50
    view11.layoutY = 140
    view11.layoutX = 330
    list = list :+ view11
    val view12 = new ImageView(w_p)
    view12.fitHeight = 50
    view12.fitWidth = 50
    view12.layoutY = 140
    view12.layoutX = 400
    list = list :+ view12

    val view13 = new ImageView(w_p)
    view13.fitHeight = 50
    view13.fitWidth = 50
    view13.layoutY = 140
    view13.layoutX = 470
    list = list :+ view13
    //val img14 = new Image(path + "\\Chess_pdt60.PNG")
    val view14 = new ImageView(w_p)
    view14.fitHeight = 50
    view14.fitWidth = 50
    view14.layoutY = 140
    view14.layoutX = 540
    list = list :+ view14
    //val img15 = new Image(path + "\\Chess_pdt60.PNG")
    val view15 = new ImageView(w_p)
    view15.fitHeight = 50
    view15.fitWidth = 50
    view15.layoutY = 140
    view15.layoutX = 610
    list = list :+ view15
    //val img16 = new Image(path + "\\Chess_pdt60.PNG")
    val view16 = new ImageView(w_p)
    view16.fitHeight = 50
    view16.fitWidth = 50
    view16.layoutY = 140
    view16.layoutX = 680
    list = list :+ view16

    var view17 = new ImageView()
    view17.fitHeight = 50
    view17.fitWidth = 50
    view17.layoutY = 200
    view17.layoutX = 190
    list = list :+ view17
    var view18 = new ImageView()
    view18.fitHeight = 50
    view18.fitWidth = 50
    view18.layoutY = 200
    view18.layoutX = 260
    list = list :+ view18
    var view19 = new ImageView()
    view19.fitHeight = 50
    view19.fitWidth = 50
    view19.layoutY = 200
    view19.layoutX = 330
    list = list :+ view19
    var view20 = new ImageView()
    view20.fitHeight = 50
    view20.fitWidth = 50
    view20.layoutY = 200
    view20.layoutX = 400
    list = list :+ view20
    var view21 = new ImageView()
    view21.fitHeight = 50
    view21.fitWidth = 50
    view21.layoutY = 200
    view21.layoutX = 470
    list = list :+ view21
    var view22 = new ImageView()
    view22.fitHeight = 50
    view22.fitWidth = 50
    view22.layoutY = 200
    view22.layoutX = 540
    list = list :+ view22
    var view23 = new ImageView()
    view23.fitHeight = 50
    view23.fitWidth = 50
    view23.layoutY = 200
    view23.layoutX = 610
    list = list :+ view23
    var view24 = new ImageView()
    view24.fitHeight = 50
    view23.fitWidth = 50
    view24.layoutY = 200
    view24.layoutX = 680
    list = list :+ view24

    var view25 = new ImageView()
    view25.fitHeight = 50
    view25.fitWidth = 50
    view25.layoutY = 260
    view25.layoutX = 190
    list = list :+ view25
    var view26 = new ImageView()
    view26.fitHeight = 50
    view26.fitWidth = 50
    view26.layoutY = 260
    view26.layoutX = 260
    list = list :+ view26
    var view27 = new ImageView()
    view27.fitHeight = 50
    view27.fitWidth = 50
    view27.layoutY = 260
    view27.layoutX = 330
    list = list :+ view27
    var view28 = new ImageView()
    view28.fitHeight = 50
    view28.fitWidth = 50
    view28.layoutY = 260
    view28.layoutX = 400
    list = list :+ view28
    var view29 = new ImageView()
    view29.fitHeight = 50
    view29.fitWidth = 50
    view29.layoutY = 260
    view29.layoutX = 470
    list = list :+ view29
    var view30 = new ImageView()
    view30.fitHeight = 50
    view30.fitWidth = 50
    view30.layoutY = 260
    view30.layoutX = 540
    list = list :+ view30
    var view31 = new ImageView()
    view31.fitHeight = 50
    view31.fitWidth = 50
    view31.layoutY = 260
    view31.layoutX = 610
    list = list :+ view31
    var view32 = new ImageView()
    view32.fitHeight = 50
    view32.fitWidth = 50
    view32.layoutY = 260
    view32.layoutX = 680
    list = list :+ view32

    var view33 = new ImageView()
    view33.fitHeight = 50
    view33.fitWidth = 50
    view33.layoutY = 320
    view33.layoutX = 190
    list = list :+ view33
    var view34 = new ImageView()
    view34.fitHeight = 50
    view34.fitWidth = 50
    view34.layoutY = 320
    view34.layoutX = 260
    list = list :+ view34
    var view35 = new ImageView()
    view35.fitHeight = 50
    view35.fitWidth = 50
    view35.layoutY = 320
    view35.layoutX = 330
    list = list :+ view35
    var view36 = new ImageView()
    view36.fitHeight = 50
    view36.fitWidth = 50
    view36.layoutY = 320
    view36.layoutX = 400
    list = list :+ view36
    var view37 = new ImageView()
    view37.fitHeight = 50
    view37.fitWidth = 50
    view37.layoutY = 320
    view37.layoutX = 470
    list = list :+ view37
    var view38 = new ImageView()
    view38.fitHeight = 50
    view38.fitWidth = 50
    view38.layoutY = 320
    view38.layoutX = 540
    list = list :+ view38
    var view39 = new ImageView()
    view39.fitHeight = 50
    view39.fitWidth = 50
    view39.layoutY = 320
    view39.layoutX = 610
    list = list :+ view39
    var view40 = new ImageView()
    view40.fitHeight = 50
    view40.fitWidth = 50
    view40.layoutY = 320
    view40.layoutX = 680
    list = list :+ view40

    var view41 = new ImageView()
    view41.fitHeight = 50
    view41.fitWidth = 50
    view41.layoutY = 380
    view41.layoutX = 190
    list = list :+ view41
    var view42 = new ImageView()
    view42.fitHeight = 50
    view42.fitWidth = 50
    view42.layoutY = 380
    view42.layoutX = 260
    list = list :+ view42
    var view43 = new ImageView()
    view43.fitHeight = 50
    view43.fitWidth = 50
    view43.layoutY = 380
    view43.layoutX = 330
    list = list :+ view43
    var view44 = new ImageView()
    view44.fitHeight = 50
    view44.fitWidth = 50
    view44.layoutY = 380
    view44.layoutX = 400
    list = list :+ view44
    var view45 = new ImageView()
    view45.fitHeight = 50
    view45.fitWidth = 50
    view45.layoutY = 380
    view45.layoutX = 470
    list = list :+ view45
    var view46 = new ImageView()
    view46.fitHeight = 50
    view46.fitWidth = 50
    view46.layoutY = 380
    view46.layoutX = 540
    list = list :+ view46
    var view47 = new ImageView()
    view47.fitHeight = 50
    view47.fitWidth = 50
    view47.layoutY = 380
    view47.layoutX = 610
    list = list :+ view47
    var view48 = new ImageView()
    view48.fitHeight = 50
    view48.fitWidth = 50
    view48.layoutY = 380
    view48.layoutX = 680
    list = list :+ view48
    val b_p = new Image(path + "\\Chess_plt60.PNG")
    var view49 = new ImageView(b_p)
    view49.fitHeight = 50
    view49.fitWidth = 50
    view49.layoutY = 440
    view49.layoutX = 190
    list = list :+ view49
    //          val img26 = new Image(path + "\\Chess_plt60.PNG")
    var view50 = new ImageView(b_p)
    view50.fitHeight = 50
    view50.fitWidth = 50
    view50.layoutY = 440
    view50.layoutX = 260
    list = list :+ view50
    //          val img27 = new Image(path + "\\Chess_plt60.PNG")
    var view51 = new ImageView(b_p)
    view51.fitHeight = 50
    view51.fitWidth = 50
    view51.layoutY = 440
    view51.layoutX = 330
    list = list :+ view51
    //          val img28 = new Image(path + "\\Chess_plt60.PNG")
    var view52 = new ImageView(b_p)
    view52.fitHeight = 50
    view52.fitWidth = 50
    view52.layoutY = 440
    view52.layoutX = 400
    list = list :+ view52
    //          val img29 = new Image(path + "\\Chess_plt60.PNG")
    var view53 = new ImageView(b_p)
    view53.fitHeight = 50
    view53.fitWidth = 50
    view53.layoutY = 440
    view53.layoutX = 470
    list = list :+ view53
    //          val img30 = new Image(path + "\\Chess_plt60.PNG")
    var view54 = new ImageView(b_p)
    view54.fitHeight = 50
    view54.fitWidth = 50
    view54.layoutY = 440
    view54.layoutX = 540
    list = list :+ view54
    //          val img31 = new Image(path + "\\Chess_plt60.PNG")
    var view55 = new ImageView(b_p)
    view55.fitHeight = 50
    view55.fitWidth = 50
    view55.layoutY = 440
    view55.layoutX = 610
    list = list :+ view55
    //          val img32 = new Image(path + "\\Chess_plt60.PNG")
    var view56 = new ImageView(b_p)
    view56.fitHeight = 50
    view56.fitWidth = 50
    view56.layoutY = 440
    view56.layoutX = 680
    list = list :+ view56

    val b_r = new Image(path + "\\Chess_rlt60.PNG")
    var view57 = new ImageView(b_r)
    view57.fitHeight = 50
    view57.fitWidth = 50
    view57.layoutY = 500
    view57.layoutX = 190
    list = list :+ view57
    val b_n = new Image(path + "\\Chess_nlt60.PNG")
    var view58 = new ImageView(b_n)
    view58.fitHeight = 50
    view58.fitWidth = 50
    view58.layoutY = 500
    view58.layoutX = 260
    list = list :+ view58
    val b_b = new Image(path + "\\Chess_blt60.PNG")
    var view59 = new ImageView(b_b)
    view59.fitHeight = 50
    view59.fitWidth = 50
    view59.layoutY = 500
    view59.layoutX = 330
    list = list :+ view59
    val b_q = new Image(path + "\\Chess_qlt60.PNG")
    var view60 = new ImageView(b_q)
    view60.fitHeight = 50
    view60.fitWidth = 50
    view60.layoutY = 500
    view60.layoutX = 400
    list = list :+ view60
    val b_k = new Image(path + "\\Chess_klt60.PNG")
    var view61 = new ImageView(b_k)
    view61.fitHeight = 50
    view61.fitWidth = 50
    view61.layoutY = 500
    view61.layoutX = 470
    list = list :+ view61
    //val img22 = new Image(path + "\\Chess_blt60.PNG")
    var view62 = new ImageView(b_b)
    view62.fitHeight = 50
    view62.fitWidth = 50
    view62.layoutY = 500
    view62.layoutX = 540
    list = list :+ view62
    //val img23 = new Image(path + "\\Chess_nlt60.PNG")
    var view63 = new ImageView(b_n)
    view63.fitHeight = 50
    view63.fitWidth = 50
    view63.layoutY = 500
    view63.layoutX = 610
    list = list :+ view63
    //val img24 = new Image(path + "\\Chess_rlt60.PNG")
    var view64 = new ImageView(b_r)
    view64.fitHeight = 50
    view64.fitWidth = 50
    view64.layoutY = 500
    view64.layoutX = 680
    list = list :+ view64

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


    var rectangle = Rectangle(640, 640)
    rectangle.fill = Color.BLUEVIOLET
    rectangle.layoutX = 250
    rectangle.layoutY = 80

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
    blackLable.visible = false
    blackLable.setFont(new Font(40))

    val whiteLable = new Label("white Turn")
    whiteLable.layoutX = 950
    whiteLable.layoutY = 300
    whiteLable.setFont(new Font(40))

    val invalid = new Label("Invalid Input")
    invalid.layoutX = 950
    invalid.layoutY = 400
    invalid.textFill = Color.Red
    invalid.setFont(new Font(40))
    invalid.visible = false

//    def validate(): Unit ={
//      if(chess.validate(in,blackTurn)){
//        blackTurn = !blackTurn
//        update()
//        invalid.visible = false
//      }
//      else{
//        invalid.visible = true
//      }
//    }
    def update(): Unit ={
      var temp = chess.state
      var i = 0
      var j = 0
      while (i<8){
        while (j<8){
          list(8*i+j).image = piece(temp(i)(j).charAt(temp(i)(j).length-1))
          j +=1
        }
        i+=1
        j = 0
      }
    }
    def piece(x:Char):Image = {
      return  x match {
        case 'r' =>
          w_r

        case 'b' =>
          w_b

        case 'n' =>
          w_n

        case 'q' =>
          w_q

        case 'k' =>
          w_k

        case 'p' =>
          w_p

        case 'R' =>
          b_r

        case 'N' =>
          b_n

        case 'B' =>
          b_b

        case 'Q' =>
          b_q

        case 'K' =>
          b_k

        case 'P' =>
          b_p

        case _ =>
          null
      }
    }

    val submit = new Button("Movement Submit")
    submit.layoutX = 20
    submit.layoutY = 400
    submit.setOnMouseClicked((e) => {
      if(fromText.text.value.length==2 && toText.text.value.length==2){
        if(chess.validate(fromText.text.value+toText.text.value,WhiteTurn)){
          WhiteTurn = !WhiteTurn
          if (!WhiteTurn) {
            whiteLable.setVisible(false)
            blackLable.setVisible(true)
          } else {
            blackLable.setVisible(false)
            whiteLable.setVisible(true)
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
    val lis = List( rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8,rectangle9, rectangle10, rectangle11,rectangle12,
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
      rectangle61,rectangle62,rectangle63,rectangle64,view1, view2,
      view3, view4, view5,view6,view7,view8,view9,view10,
      view11,view12,view13,view14,view15,view16,view17,view18,
      view19,view20,view21,view22,view23,view24,
      view25,view26,view27,view28,view29,view30,view31,
      view32,view33, view34,
      view35, view36, view37,view38,view39,view40,view41,view42,
      view43,view44,view45,view46,view47,view48,view49,view50,
      view51,view52,view53,view54,view55,view56,
      view57,view58,view59,view60,view61,view62,
      view63,view64,label1,label2,label3,label4,label5,
      label6,label7,label8,label9,label10,label11,
      label12,label13,label14,label15,label16,
      label17, label18,label19,label20,label21
      ,label22,label23,label24,label25,label26,label27,label28,
      label29,label30,label31,label32,labelTitle, fromLabel, fromText, toLabel, toText, submit, blackLable, whiteLable,invalid)

    return (lis)
  }
}