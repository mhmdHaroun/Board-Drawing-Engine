import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.text.Font

import scala.language.postfixOps

object Home extends {
  def main(args: Array[String]) {
    val app: JFXApp = new JFXApp {
      stage = new JFXApp.PrimaryStage {
        title = "Paradigms Game Project"
        scene = new Scene(300,300){

          val labelGame = new Label ("Game")
          labelGame.layoutY = 10
          labelGame.layoutX = 115
          labelGame.setFont(new Font(30))

          val game = new ComboBox(List("Tic-Tac-Toe","Connect-4","Checkers","Chess"))
          game.layoutX = 100
          game.layoutY = 70
          //          game.onAction = (e: ActionEvent) => {

          //          }

          val confirm = new Button("confirm")
          confirm.layoutX = 200
          confirm.layoutY = 200
          confirm.setOnMouseClicked((e) => {
            if (game.value.value == "Chess"){
              content = Chess_Gui.ChssView()

              stage.setWidth(1200)
              stage.setHeight(800)
            }
            if (game.value.value == "Checkers"){
              content = Checkers_Gui.CheckersView()
              stage.setWidth(1200)
              stage.setHeight(800)
            }
            if (game.value.value == "Connect-4"){
              content = ConnectFour.ConnectFourView()
              stage.setWidth(1200)
              stage.setHeight(800)
            }
            if (game.value.value == "Tic-Tac-Toe"){
              content = tic_tac_toe_Gui.TicTacToeView()
              stage.setWidth(1200)
              stage.setHeight(800)
            }
          })
          content = List(labelGame,game,confirm)
        }
      }
    }

    app.main(Array(""))
  }

}
