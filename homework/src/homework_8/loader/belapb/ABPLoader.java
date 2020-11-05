package homework_8.loader.belapb;

import homework_8.loader.core.FormatRate;
import homework_8.loader.loaderLogic.SiteLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class ABPLoader extends SiteLoader {
    private final String strForRate = "Cur_OfficialRate";
    private final String strForScale = "Cur_Scale";
    private final String strForDate = "Date";
    private final String strForAbbreviation = "Cur_Abbreviation";
    private final String fileName = "APB.txt";

    public String getFileName() {
        return fileName;
    }

    @Override
    public FormatRate load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?" + currencyName.getIdAPB(), currencyName);
    }

    @Override
    public FormatRate load(Currency currencyName, String date) {
        return null;
    }

    @Override
    public FormatRate load(Currency currencyName, String dateFrom, String dateTo) {
        return null;
    }

    @Override
    protected FormatRate handle(String content, Currency currencyName) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document document = dbf.newDocumentBuilder().parse("https://belapb.by/ExCardsDaily.php?840");

            XPathFactory xpf = XPathFactory.newInstance();
            XPath xpath = xpf.newXPath();
            XPathExpression expression = xpath.compile("//DailyExCards");

            Node b13Node = (Node) expression.evaluate(document, XPathConstants.NODE);
            b13Node.getParentNode().removeChild(b13Node);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            t.transform(new DOMSource(document), new StreamResult(System.out));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return new FormatRate("", "", "");
    }
}
