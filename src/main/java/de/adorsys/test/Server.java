/**
 * 
 */
package de.adorsys.test;

/**
 * @author cga
 *
 */
public class Server {
	String name ;

	  String description ;

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  @Override
	  public String toString() {
	    return "Server{" +
	        "name='" + name + '\'' +
	        ", description='" + description + '\'' +
	        '}';
	  }
}
