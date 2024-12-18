package ua.ucu.edu.task3;

import java.io.IOException;

public class ReaderFacade {

    private PDLReader pdlReader;

    public ReaderFacade() {
        pdlReader = new PDLReader();
    }

    public Company task(String companyName) throws IOException {
        Company companyPDL = pdlReader.task(companyName);
        return companyPDL;
        
    }
}