
package paint.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import paint.model.Shape;

public class SaveToXML {
    private String path;
    private Map<String, Double> m;
    private boolean success=false;
    
    public SaveToXML(String path){
    this.path = path;
    try{doTheJob();}catch(Exception e){System.out.println("Failed to save xml");}
}
    
    private void doTheJob() throws ParserConfigurationException, FileNotFoundException{
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document dom = db.newDocument();
        Element rootEle = dom.createElement("root");
        // Changed: shapes are now retrieved from ApplicationStateManager singleton
        ArrayList<Shape> shapes = ApplicationStateManager.getInstance().getShapes();
        
        for(int i=0;i<shapes.size();i++){
            m = shapes.get(i).getProperties();
            Element sh = dom.createElement(shapes.get(i).getClass().getSimpleName());
            for (Map.Entry<String, Double> entry : m.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                sh.setAttribute(key, value.toString());
            }
            rootEle.appendChild(sh);
        }
        dom.appendChild(rootEle);
        
        
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty(OutputKeys.METHOD, "xml");
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            
            tr.transform(new DOMSource(dom), 
                                 new StreamResult(new FileOutputStream(path)));

        } catch (Exception e) {
            System.out.println("Failed to save the xml document");
            success=false;
            return;
        }
        
        success=true;
        
    }
    
    public boolean checkSuccess(){
        return success;
    }
}
