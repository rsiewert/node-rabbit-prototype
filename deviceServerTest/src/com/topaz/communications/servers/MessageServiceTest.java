package com.topaz.communications.servers;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.topaz.communications.handlers.MessageProtocolHandler;
import com.topaz.communications.messages.Message;
import com.topaz.communications.protocols.MessageProtocol;


/**
 * The class <code>MessageServiceTest</code> contains tests for the class <code>{@link MessageService}</code>.
 *
 * @generatedBy CodePro at 3/12/14 9:52 PM
 * @author rbgodwin
 * @version $Revision: 1.0 $
 */
public class MessageServiceTest {
	
	String msHost= "localhost";
	int msPort = 5672;

	/**
	 * Run the MessageService(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testMessageService_1()
		throws Exception {
		String host = "";

		MessageService result = new MessageService(host);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:237)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:58)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:411)
		//       at java.net.Socket$3.run(Socket.java:865)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:862)
		//       at com.rabbitmq.client.impl.SocketFrameHandler.<init>(SocketFrameHandler.java:54)
		//       at com.rabbitmq.client.ConnectionFactory.createFrameHandler(ConnectionFactory.java:462)
		//       at com.rabbitmq.client.ConnectionFactory.createFrameHandler(ConnectionFactory.java:447)
		//       at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:504)
		//       at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:533)
		//       at com.topaz.communications.servers.MessageService.<init>(MessageService.java:79)
		//       at com.topaz.communications.servers.MessageService.<init>(MessageService.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the void addProtocol(MessageProtocol,MessageProtocolHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testAddProtocol_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService(this.msHost);
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());
		MessageProtocol protocol = new MessageProtocol();
		MessageProtocolHandler protocolHandler = new MessageProtocolHandler();

		fixture.addProtocol(protocol, protocolHandler);

	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService(this.msHost);
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		MessageService fixture = MessageService.getMessageService(this.msHost);
		fixture.setChannel((Channel) null);
		fixture.setConnection((Connection) null);
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());

		fixture.close();

	}

	/**
	 * Run the Channel getChannel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testGetChannel_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService(this.msHost);
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());

		Channel result = fixture.getChannel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Must insitialize with a port and IP
		//       at com.topaz.communications.servers.MessageService.getMessageService(MessageService.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testGetConnection_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService(this.msHost);
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());

		Connection result = fixture.getConnection();

		assertNotNull(result);
	}

	/**
	 * Run the MessageService getMessageService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testGetMessageService_1()
		throws Exception {

		MessageService result = MessageService.getMessageService(this.msHost);

		assertNotNull(result);
	}

	/**
	 * Run the MessageService getMessageService(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testGetMessageService_4()
		throws Exception {
		String host = msHost;

		MessageService result = MessageService.getMessageService(host);

		assertNotNull(result);
	}

	/**
	 * Run the MessageService getMessageService(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testGetMessageService_6()
		throws Exception {
		String host = this.msHost;
		int port = this.msPort;

		MessageService result = MessageService.getMessageService(host, port);

		// add additional test code here
		assertNotNull(result);
	}
	/**
	 * Run the void sendMessage(String,String,Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testSendMessage_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService();
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());
		String exchange = "";
		String route = "";
		Message msg = new Message();
		msg.setRequestAck(new Boolean(true));

		fixture.sendMessage(exchange, route, msg);
	}
	/**
	 * Run the void setChannel(Channel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testSetChannel_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService();
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());
		Channel channel = EasyMock.createMock(Channel.class);
		// add mock object expectations here

		EasyMock.replay(channel);

		fixture.setChannel(channel);

		// add additional test code here
		EasyMock.verify(channel);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Must insitialize with a port and IP
		//       at com.topaz.communications.servers.MessageService.getMessageService(MessageService.java:43)
	}

	/**
	 * Run the void setConnection(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Test
	public void testSetConnection_1()
		throws Exception {
		MessageService fixture = MessageService.getMessageService();
		fixture.setChannel(EasyMock.createNiceMock(Channel.class));
		fixture.setConnection(EasyMock.createNiceMock(Connection.class));
		fixture.addProtocol(new MessageProtocol(), new MessageProtocolHandler());
		Connection connection = EasyMock.createMock(Connection.class);
		// add mock object expectations here

		EasyMock.replay(connection);

		fixture.setConnection(connection);

		// add additional test code here
		EasyMock.verify(connection);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Must insitialize with a port and IP
		//       at com.topaz.communications.servers.MessageService.getMessageService(MessageService.java:43)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/13/14 6:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageServiceTest.class);
	}
}