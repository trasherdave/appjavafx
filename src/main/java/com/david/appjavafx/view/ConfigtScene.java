/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.appjavafx.view;

import com.david.appjavafx.App;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class ConfigtScene extends AbstractScene {

    public ConfigtScene(App app) {
        super(app);

        Label label1 = new Label("Formato de Relatórios");
        TextField fieldFormatoRelatorios = new TextField();
        Label label2 = new Label("Tipo de Gráficos");
        TextField fieldTipoGraficos = new TextField();
        Button btnOk = new Button("OK");
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOk));
    }

}
