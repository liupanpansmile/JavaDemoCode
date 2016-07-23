package com.finley.jaxb;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;
import java.util.List;

/**
 * Created by finley on 16/7/23.
 */
@XmlRootElement(name = "root", namespace = "http://www.example.org/metric_query")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParamParser {

    private static ParamParser paramParser ;
    static {
        InputStream inputStream = ParamParser.class.getClassLoader().getResourceAsStream("metric_query.xml") ;
        try {
            JAXBContext context = JAXBContext.newInstance(ParamParser.class) ;
            Unmarshaller unmarshaller = context.createUnmarshaller() ;
            paramParser =(ParamParser) unmarshaller.unmarshal(inputStream) ;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if(paramParser != null){
            System.out.println("Succeed to parse");
        }else{
            System.out.println("Failed to parse");
        }
    }

    @Setter
    @Getter
    @XmlElement(name = "name")
    private List<ParamItem> nameList ;

    @Setter
    @Getter
    @XmlElement(name = "type")
    private List<ParamItem> typeList ;

    @Setter
    @Getter
    @XmlElement(name = "transform")
    private List<ParamItem> transformList ;

}
