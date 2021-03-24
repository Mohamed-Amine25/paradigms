package ma.aui.sse.paradigms.performance.fx.server;

import java.net.*;
import java.io.*;
import java.util.StringTokenizer;

public class FxServer {

	public static void main(String[] args) throws Exception {

		try (ServerSocket ss = new ServerSocket(80)) {
			while (true) {
				Socket connectionFromClient = ss.accept();
				new FxServerThread(connectionFromClient);
			}
		}
	}
}
