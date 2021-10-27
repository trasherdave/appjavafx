/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.appjavafx.view;

import com.david.appjavafx.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);

        Button btnRelatorios = new Button("Relatórios");
        Button btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios, btnConfig));

//        btnRelatorios.setOnAction(app.setScene(new RelatoriosScene(app)));
    }

}
