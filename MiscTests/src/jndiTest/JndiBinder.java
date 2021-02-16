package jndiTest;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JndiBinder {
	public void bindObject() {
		Student student = new Student(1, "Bijoy");
		Properties initialProperties = new Properties();
		initialProperties.put(Context.INITIAL_CONTEXT_FACTORY,
		          "com.sun.jndi.fscontext.RefFSContextFactory");
		initialProperties.put(InitialContext.PROVIDER_URL,
		"jnp://localhost:1099");
		initialProperties.put(InitialContext.URL_PKG_PREFIXES,
		"org.jboss.naming:org.jnp.interfaces");
		try {
		Context context = new InitialContext(initialProperties);
		context.bind("student", student);
		System.out.println("Bound object = "+student);
		} catch (NamingException e) {

		e.printStackTrace();
		}

		}

		public static void main(String[] args) {
		new JndiBinder().bindObject();
		}
}
