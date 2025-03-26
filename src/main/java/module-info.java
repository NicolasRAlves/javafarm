module br.com.joaocarloslima {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.joaocarloslima to javafx.fxml;
    exports br.com.joaocarloslima.controller;
    opens br.com.joaocarloslima.controller to javafx.fxml;

    exports br.com.joaocarloslima;
}
