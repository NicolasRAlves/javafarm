package br.com.joaocarloslima.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Utils {

    public static void exibirAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);

        alert.getDialogPane().getStylesheets().add(Utils.class.getResource("/br/com/joaocarloslima/style.css").toExternalForm());
        alert.getDialogPane().getStyleClass().add("alert-warning");
        alert.getDialogPane().setStyle("-fx-alignment: center;");
        alert.showAndWait();
    }

    public static void exibirErro(String titulo, String mensagem) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);

        alert.getDialogPane().getStylesheets().add(Utils.class.getResource("/br/com/joaocarloslima/style.css").toExternalForm());
        alert.getDialogPane().getStyleClass().add("alert-error");
        alert.getDialogPane().setStyle("-fx-alignment: center;");
        alert.showAndWait();
    }

    public static void exibirSucesso(String titulo, String mensagem) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);

        alert.getDialogPane().getStylesheets().add(Utils.class.getResource("/br/com/joaocarloslima/style.css").toExternalForm());
        alert.getDialogPane().getStyleClass().add("alert-success");
        alert.getDialogPane().setStyle("-fx-alignment: center;");
        alert.showAndWait();
    }

    
}
