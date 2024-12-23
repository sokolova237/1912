module ru.dadakin.dadakin_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task7 to javafx.fxml;
    exports ru.sokolova.sokolova_task7;
}