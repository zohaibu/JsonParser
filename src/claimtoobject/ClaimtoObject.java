/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claimtoobject;

/**
 *
 * @author Zohaib.Usmani
 */


import java.io.File;
import java.io.IOException; 
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;
import claimtoobject.Claim;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;





public class ClaimtoObject {

public static void main(String a[])throws  JsonMappingException, IOException{

    ObjectMapper mapper = new ObjectMapper()
            .setVisibility(JsonMethod.FIELD,
                         JsonAutoDetect.Visibility.ANY);
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
                     false);
    try {
        File jsonInputFile = new File("C:\\temp\\jsonraw.txt");
       Claim clm = mapper.readValue(jsonInputFile, Claim.class);
        System.out.println(clm);

    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
}