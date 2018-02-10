/**
 * 
 */
package de.adorsys.test;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cga
 *
 */
@RestController
public class EnvEndpoint {
	
	@Autowired
	Config config ;
	
	
	@GetMapping("/config-env")
	public List<Server>  getServer(){
		return config.getServers() ;
	}

}
