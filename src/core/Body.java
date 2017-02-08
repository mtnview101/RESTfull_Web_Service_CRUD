package core;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

@XmlRootElement(name = "employee")
@JsonRootName(value = "employee")
public class Body {
       @XmlElement
       @JsonProperty("id")
       String id;
       @XmlElement
       @JsonProperty("name")
       String name;
       @XmlElement
       @JsonProperty("email")
       String email;

      public String getEmployeeID() {return id;}
      public String getEmployeeName() {return name;}
      public String getEmployeeEmail() {return email;}}

