/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Vimukthi Weerasiri
 */
public class MainServer {

    private static MainServer mainServer;

    private MainServer() {

    }

    public static MainServer getInstance() {
        if (mainServer == null) {
            return mainServer;
        }
        return mainServer;
    }



}
