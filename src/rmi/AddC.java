package rmi;

// this belong to the server

import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements AddI {

    public AddC() throws Exception{
        super();
    }

    @Override
    public int add(int x, int y) throws Exception {
        return x+y;
    }
}
