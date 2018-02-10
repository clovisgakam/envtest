/**
 * 
 */
package de.adorsys.test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cga
 *
 */
@Component
@ConfigurationProperties(prefix="my")
public class Config {

	  private List<Server> servers = new ArrayList<Server>();

	  public List<Server> getServers() {
	    return this.servers;
	  }
}
