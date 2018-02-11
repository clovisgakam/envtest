/**
 * 
 */
package de.adorsys.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author cga
 *
 */
@Component
@PropertySource(value = "${sample.properties.file}", ignoreResourceNotFound = false)
@ConfigurationProperties(prefix="my")
public class Config {

	  private List<Server> servers = new ArrayList<Server>();

	  public List<Server> getServers() {
	    return this.servers;
	  }
}
