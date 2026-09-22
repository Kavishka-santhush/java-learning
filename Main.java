// 1. Common Interface for Invoice Generator (Open for extension)
interface InvoiceGenerator {
    void generateInvoice(String carModel);
}

// 2. Local Invoice Implementation
class LocalInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(String carModel) {
        System.out.println("Generating Local Invoice for: " + carModel + " (Tax: Local Sri Lankan Rates)");
    }
}

// 3. Online Invoice Implementation (Added later without modifying existing classes!)
class OnlineInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(String carModel) {
        System.out.println("Generating Online Invoice for: " + carModel + " (Tax: International/Online Rates + Gateway Fee)");
    }
}

// 4. Processing Manager that works with any InvoiceGenerator (Closed for modification)
class InvoiceProcessor {
    public void process(InvoiceGenerator generator, String carModel) {
        generator.generateInvoice(carModel);
    }
}

public class Main {
    public static void main(String[] args) {
        InvoiceProcessor processor = new InvoiceProcessor();

        // Processing Local Invoice
        InvoiceGenerator localInvoice = new LocalInvoiceGenerator();
        processor.process(localInvoice, "Toyota Prius");

        // Processing Online Invoice (Seamlessly extended without touching old code)
        InvoiceGenerator onlineInvoice = new OnlineInvoiceGenerator();
        processor.process(onlineInvoice, "Tesla Model S");
    }
}