package br.com.felkj;

import br.com.felkj.ui.custom.frame.MainFrame;
import br.com.felkj.ui.custom.panel.MainPanel;
import br.com.felkj.ui.custom.screen.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain {
    public static void main(String[] args) {

        final var gameConfig = Stream.of(args)
                .collect(toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));
        var option = -1;
        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}
