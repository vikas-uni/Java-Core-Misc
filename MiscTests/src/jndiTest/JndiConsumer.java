package jndiTest;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JndiConsumer {
	public void readObject() {
		Properties initialProperties = new Properties();
		initialProperties.put(Context.INITIAL_CONTEXT_FACTORY,
		          "com.sun.jndi.fscontext.RefFSContextFactory");
		initialProperties.put(InitialContext.PROVIDER_URL,
		"jnp://localhost:1099");
		initialProperties.put(InitialContext.URL_PKG_PREFIXES,
		"org.jboss.naming:org.jnp.interfaces");
		try {
		Context context = new InitialContext(initialProperties);
		Student student = (Student) context.lookup("student");
		System.out.println("Object received from context = "+student);
		} catch (NamingException e) {

		e.printStackTrace();
		}

		}

		public static void main(String[] args) {
		new JndiConsumer().readObject();

		}
}
