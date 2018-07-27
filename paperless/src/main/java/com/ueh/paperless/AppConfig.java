//package com.ueh.paperless;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppConfig {
//	@Autowired
//    private SessionFactory sessionFactory;
//	
//
//	  public void setUp() throws Exception {
//	        // A SessionFactory is set up once for an application!
//	        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//	                .configure()
//	                .build();
//
//	        try {
//	            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
//	        }
//	        catch (Exception e) {
//	            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//	            // so destroy it manually.
//	            StandardServiceRegistryBuilder.destroy( registry );
//	        }
//	    }
//
//	    public void close(){
//	        sessionFactory.close();
//	    }
//	    
//	   
//}
