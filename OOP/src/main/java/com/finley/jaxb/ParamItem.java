package com.finley.jaxb;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by finley on 16/7/23.
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class ParamItem {

    @Getter
    @Setter
    @XmlAttribute(name = "name", required = true)
    private String          name;

    @Getter
    @Setter
    @XmlAttribute(name = "value")
    private String          value;


    @Getter
    @Setter
    @XmlAttribute(name = "match")
    private String          match;

    @Getter
    @Setter
    @XmlElement(name = "field")
    private List<ParamItem> fields;


    @Getter
    @Setter
    @XmlElement(name = "title")
    private List<ParamItem> titles;

}
