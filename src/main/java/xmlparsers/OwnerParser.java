package xmlparsers;

import implementations.Owner;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.getFile;

public class OwnerParser {

    private Validator initValidator(String xsdPath) throws SAXException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Source schemaFile = new StreamSource(getFile(xsdPath));
        Schema schema = factory.newSchema(schemaFile);
        return schema.newValidator();
    }

    public boolean isValid(String xsdPath, String xmlPath) throws IOException, SAXException {
        Validator validator = initValidator(xsdPath);
        try {
            validator.validate(new StreamSource(getFile(xmlPath)));
            return true;
        } catch (SAXException e) {
            return false;
        }
    }

    public void marshal() throws JAXBException, IOException {
        Owner owner = new Owner(1);
        //owner.setID(1);
        owner.setName("Generic Name");
        owner.setAddress("1234 Place");

        JAXBContext context = JAXBContext.newInstance(Owner.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(owner, new File("./Owners.xml"));
    }

    public Owner unmarshal() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Owner.class);
        return (Owner) context.createUnmarshaller()
                .unmarshal(new FileReader("./book.xml"));
    }
}
