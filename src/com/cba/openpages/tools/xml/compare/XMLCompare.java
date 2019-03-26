package com.cba.openpages.tools.xml.compare;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XMLCompare {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		
		String[] paramsArray = args;
		String action, configType, sourceFile, targetFile, logFile ;
		int j = args.length;
		
		for (int i=0; i<j; i++) {
			String string = paramsArray[i];
			System.out.println(String.format("Arg %d %s", new Object[] { Integer.valueOf(i++), string}));
		}
		System.out.println("");
		
		
		if (args.length<5) {
			throw new IllegalArgumentException("Incorrect number of arguments. Expect minimum five arguments for action, Config Type, source,  target and log files");
		} else {
			
			try {
				action = args[0];
				configType = args[1];
				sourceFile = args[2];
				targetFile = args[3];
				logFile = args[4];
				
				File srcFileData = new File(sourceFile);
				File tgtFileData = new File(targetFile);
				
				
	            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	            Document srcDoc = dBuilder.parse(srcFileData);
	            srcDoc.getDocumentElement().normalize();
	            System.out.println("Root element :" + srcDoc.getDocumentElement().getNodeName());
	            NodeList nList = srcDoc.getElementsByTagName("student");
	            System.out.println("----------------------------");	
	            
	            
		       } catch (Exception e){
		    	   e.printStackTrace();
		       }


		}
		
//	      try {
//	          File inputFile = new File("input.txt");
//	          DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//	          DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//	          Document doc = dBuilder.parse(inputFile);
//	          doc.getDocumentElement().normalize();
//	          System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//	          NodeList nList = doc.getElementsByTagName("student");
//	          System.out.println("----------------------------");
//	          
//	          for (int temp = 0; temp < nList.getLength(); temp++) {
//	             Node nNode = nList.item(temp);
//	             System.out.println("\nCurrent Element :" + nNode.getNodeName());
//	             
//	             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//	                Element eElement = (Element) nNode;
//	                System.out.println("Student roll no : " 
//	                   + eElement.getAttribute("rollno"));
//	                System.out.println("First Name : " 
//	                   + eElement
//	                   .getElementsByTagName("firstname")
//	                   .item(0)
//	                   .getTextContent());
//	                System.out.println("Last Name : " 
//	                   + eElement
//	                   .getElementsByTagName("lastname")
//	                   .item(0)
//	                   .getTextContent());
//	                System.out.println("Nick Name : " 
//	                   + eElement
//	                   .getElementsByTagName("nickname")
//	                   .item(0)
//	                   .getTextContent());
//	                System.out.println("Marks : " 
//	                   + eElement
//	                   .getElementsByTagName("marks")
//	                   .item(0)
//	                   .getTextContent());
//	             }
//	          }
//	       } catch (Exception e) {
//	          e.printStackTrace();
//	       }
	}

}
