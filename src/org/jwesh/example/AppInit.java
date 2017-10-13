package org.jwesh.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.jwesh.action.ActionManager;
import org.jwesh.example.action.IndexAction;

@WebListener
public class AppInit implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ActionManager manager = ActionManager.getInstance();
		manager.addAction("GET|/JWeshExmaple/", new IndexAction());
		manager.addAction("GET|/JWeshExmaple/index", new IndexAction());
	}
}
