/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aldrin.appupdate;

/**
 *
 * @author Java Programming with Aldrin
 */
import javax.swing.*;


public class AppUpdate  {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrameAppUpdater frame = new JFrameAppUpdater();
            frame.setVisible(true);
        });
    }
}
