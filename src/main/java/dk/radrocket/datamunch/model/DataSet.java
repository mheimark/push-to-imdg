package dk.radrocket.datamunch.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "dataset")
public class DataSet {

    private String to;
    private String from;
    private String heading;

}
