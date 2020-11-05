package homework_8.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class WorkWithXML {
    public void parseXML(String url) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document document = dbf.newDocumentBuilder().parse(url);

            document.getDocumentElement().normalize();
            System.out.println ("Root element of the doc is " + document.getDocumentElement().getNodeName());

            NodeList listCurrency = document.getElementsByTagName("Currency");
            int totalCurrency = listCurrency.getLength();
            System.out.println("Total node of Currency: " + totalCurrency);

            for(int i = 0; i < listCurrency.getLength() ; i++) {

                Node firstCurrencyNode = listCurrency.item(i);
                if(firstCurrencyNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element firstElement = (Element)firstCurrencyNode;
                    System.out.println("Id :"+firstElement.getAttribute("Id"));

                    //-------
                    NodeList charCode = firstElement.getElementsByTagName("CharCode");
                    Element firstCharCodeElement = (Element)charCode.item(0);
                    NodeList charCodeList = firstCharCodeElement.getChildNodes();
                    System.out.println("CharCode : " + ((Node)charCodeList.item(0)).getNodeValue().trim());

                    NodeList scale = firstElement.getElementsByTagName("Scale");
                    Element firstScaleElement = (Element)scale.item(0);
                    NodeList scaleList = firstScaleElement.getChildNodes();
                    System.out.println("Scale : " + ((Node)scaleList.item(0)).getNodeValue().trim());

                    NodeList RateBuy = firstElement.getElementsByTagName("RateBuy");
                    Element firstRateBuyElement = (Element)RateBuy.item(0);
                    NodeList rateBuyElementList = firstRateBuyElement.getChildNodes();
                    System.out.println("RateBuy : " + ((Node)rateBuyElementList.item(0)).getNodeValue().trim());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
