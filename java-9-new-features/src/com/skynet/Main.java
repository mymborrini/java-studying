package com.skynet;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
	    System.out.println("Skynet");
	    NewHttpClient.tryNewHttpClient();

	    SystemProcess.retrieveProcessInfo();

	    ClassImplementsIPVT classImplementsIPVT = new ClassImplementsIPVT();
	    classImplementsIPVT.check();

    }
}
