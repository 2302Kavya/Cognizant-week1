public class DocumentFactory {

    public static Document createDocument(String type) {

        if(type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }

        if(type.equalsIgnoreCase("pdf")) {
            return new pdfDocument();
        }

        if(type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }

        return null;
    }
}

