package uk.ac.ebi.fgpt.populous.controller;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ebi.fgpt.populous.utils.OntologyConfiguration;

import java.util.Map;

/**
 * Created by dwelter on 09/09/14.
 */
public class TestPopulousController extends TestCase{

    private     PopulousController populousController;

    @Before
    public void setUp(){

       populousController = new PopulousController();

        OntologyConfiguration ontologyConfiguration = new OntologyConfiguration();
        ontologyConfiguration.init();

        populousController.setOntologyConfiguration(ontologyConfiguration);


    }


    @Test
    public void testSourceOntologyParameters(){

        String onto1 = "efo";
        String onto2 = "clo";

        Map<String, Object> efoSource = populousController.getSourceOntologyParameters(onto1);
        Map<String, String> source = (Map<String, String>) efoSource.get("sourceOntology");
        assertEquals("Experimental Factor Ontology", source.get("name"));


        Map<String, Object> cloSource = populousController.getSourceOntologyParameters(onto2);
        assertNull(cloSource.get("sourceOntology"));

    }



    
    @Test
    public void testDataSubmission(){


        String data = "{\"configuration\":{\"sourceOntology\":\"EFO\",\"opplPatterns\":[{\"name\":\"Bearer of some disease\",\"variables\":[{\"variable\":\"?cellLine\",\"columnIndex\":0},{\"variable\":\"?disease\",\"columnIndex\":1}]},{\"name\":\"Has quality some sex\",\"variables\":[{\"variable\":\"?cellLine\",\"columnIndex\":0},{\"variable\":\"?sex\",\"columnIndex\":5}]}],\"dataRestrictions\":[{\"restrictionIndex\":1,\"restrictionOntology\":\"EFO\",\"restrictionType\":\"children\",\"restrictionName\":\"sex\",\"restrictionURI\":\"http://www.ebi.ac.uk/efo/EFO_0000695\"},{\"restrictionIndex\":3,\"restrictionOntology\":\"EFO\",\"restrictionType\":\"descendants\",\"restrictionName\":\"organism\",\"restrictionURI\":\"http://purl.obolibrary.org/obo/OBI_0100026\"},{\"restrictionIndex\":5,\"restrictionOntology\":\"EFO\",\"restrictionType\":\"descendants\",\"restrictionName\":\"cancer\",\"restrictionURI\":\"http://www.ebi.ac.uk/efo/EFO_0000311\"},{\"restrictionIndex\":7,\"restrictionOntology\":\"EFO\",\"restrictionType\":\"descendants\",\"restrictionName\":\"metabolic disease\",\"restrictionURI\":\"http://www.ebi.ac.uk/efo/EFO_0000589\"}]},\"data\":[[{\"value\":\"BL-2\",\"restrictionIndex\":null},{\"value\":\"Burkitts lymphoma\",\"restrictionIndex\":5},{\"value\":\"cell type\",\"restrictionIndex\":null},{\"value\":\"bone marrow\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"BL-2\",\"restrictionIndex\":null}],[{\"value\":\"JVM-2\",\"restrictionIndex\":null},{\"value\":\"lymphoma\",\"restrictionIndex\":5},{\"value\":\"lymphoblast\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":3},{\"value\":\"female\",\"restrictionIndex\":1},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"JVM-2\",\"restrictionIndex\":null}],[{\"value\":\"KARPAS 422\",\"restrictionIndex\":null},{\"value\":\"diffuse large B-cell lymphoma\",\"restrictionIndex\":5},{\"value\":\"cell type\",\"restrictionIndex\":null},{\"value\":\"lymphatic system\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":3},{\"value\":\"female\",\"restrictionIndex\":1},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"KARPAS 422\",\"restrictionIndex\":null}],[{\"value\":\"U-266\",\"restrictionIndex\":null},{\"value\":\"plasmacytoma\",\"restrictionIndex\":null},{\"value\":\"lymphocyte\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"U-266\",\"restrictionIndex\":null}],[{\"value\":\"Z-138\",\"restrictionIndex\":null},{\"value\":\"lymphoma\",\"restrictionIndex\":5},{\"value\":\"lymphoblast\",\"restrictionIndex\":null},{\"value\":\"organism part\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"Z-138\",\"restrictionIndex\":null}],[{\"value\":\"MEL-GATA-1-ER\",\"restrictionIndex\":null},{\"value\":\"type II diabetes mellitus\",\"restrictionIndex\":7},{\"value\":\"erythroblast\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":null,\"restrictionIndex\":1},{\"value\":\"This is a mouse suspension cell line derived from MEL cells by stable transfection with a GATA-1-ER fusion protein construct as described by Choe et al., 2003 (Cancer Res 63, 6363–6369, 2003). These cells can be terminally differentiated into mature erythroid cells with β-estradiol treatment, while GATA-1 alone can induce MEL cells to differentiate and to lose their tumorigenic properties. [PMID: 14559825]\",\"restrictionIndex\":null},{\"value\":\"MEL-GATA-1-ER\",\"restrictionIndex\":null}],[{\"value\":\"Patski\",\"restrictionIndex\":null},{\"value\":\"breast carcinoma\",\"restrictionIndex\":5},{\"value\":\"fibroblast\",\"restrictionIndex\":null},{\"value\":\"kidney\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":\"female\",\"restrictionIndex\":1},{\"value\":\"Mouse Embryonic Kidney Fibroblast. As described in Lingenfelter et al., 1998 (Nat Genet. 1998 18:212-3) and Yang et al., 2010 (Genome Res. 2010 20:614-22), PATSKI is a female interspecific mouse fibroblast that was derived from the embryonic kidney of an M.spretus x C57BL/6J hybrid mouse such that the C57Bl/6J X chromosome (maternal) is always the inactive X. This is an adherent cell line.\",\"restrictionIndex\":null},{\"value\":\"Patski\",\"restrictionIndex\":null}],[{\"value\":\"416B\",\"restrictionIndex\":null},{\"value\":\"amyloidosis\",\"restrictionIndex\":null},{\"value\":\"myeloid lineage restricted progenitor cell\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":\"Mouse hematopoietic suspension cell line positive for CD34. The cells have a diploid complement of chromosomes, are non-tumorigenic and bipotential (can be induced to differentiate in vivo into two distinct haematopoietic lineages), and which in appropriate circumstances protect mice from potentially lethal radiation. [PMID: 763330]\",\"restrictionIndex\":null},{\"value\":\"416B\",\"restrictionIndex\":null}],[{\"value\":\"ES-Bruce4\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"embryonic stem cell\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":\"An embryonic cell line isolated from C57BL/6 mouse strain. Injection of Bruce4 cells into C57BL/6 blastocysts will produce agouti chimeras.\",\"restrictionIndex\":null},{\"value\":\"ES-Bruce4\",\"restrictionIndex\":null}],[{\"value\":\"46C\",\"restrictionIndex\":null},{\"value\":\"liver disease\",\"restrictionIndex\":null},{\"value\":\"mouse neural progenitor cell\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":\"46C is an embryonic cell line, constructed in the laboratory of Austin Smith, in which a drug resistance gene is placed under the control of a Sox1 promoter. Cells were isolated from the 129a mouse strain. [PMID: 12524553]\",\"restrictionIndex\":null},{\"value\":\"46C\",\"restrictionIndex\":null}],[{\"value\":\"TT2\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"embryonic stem cell\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":\"male\",\"restrictionIndex\":1},{\"value\":\"ES-cells isolated from C57BL/6xCBA\",\"restrictionIndex\":null},{\"value\":\"TT2\",\"restrictionIndex\":null}],[{\"value\":\"J185a\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"myoblast\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":3},{\"value\":null,\"restrictionIndex\":1},{\"value\":\"Fetal myoblast Desmin+\",\"restrictionIndex\":null},{\"value\":\"J185a\",\"restrictionIndex\":null}]]}" +
                "\n";

        String dataNoRestricts = "{\"configuration\":{\"sourceOntology\":\"EFO\",\"opplPatterns\":[{\"name\":\"Bearer of some disease\",\"variables\":[{\"variable\":\"?cellLine\",\"columnIndex\":0},{\"variable\":\"?disease\",\"columnIndex\":1}]},{\"name\":\"Has quality some sex\",\"variables\":[{\"variable\":\"?cellLine\",\"columnIndex\":0},{\"variable\":\"?sex\",\"columnIndex\":5}]}],\"dataRestrictions\":[\"No restrictions available\"]},\"data\":[[{\"value\":\"BL-2\",\"restrictionIndex\":null},{\"value\":\"Burkitts lymphoma\",\"restrictionIndex\":null},{\"value\":\"cell type\",\"restrictionIndex\":null},{\"value\":\"bone marrow\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"BL-2\",\"restrictionIndex\":null}],[{\"value\":\"JVM-2\",\"restrictionIndex\":null},{\"value\":\"lymphoma\",\"restrictionIndex\":null},{\"value\":\"lymphoblast\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":null},{\"value\":\"female\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"JVM-2\",\"restrictionIndex\":null}],[{\"value\":\"KARPAS 422\",\"restrictionIndex\":null},{\"value\":\"diffuse large B-cell lymphoma\",\"restrictionIndex\":null},{\"value\":\"cell type\",\"restrictionIndex\":null},{\"value\":\"lymphatic system\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":null},{\"value\":\"female\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"KARPAS 422\",\"restrictionIndex\":null}],[{\"value\":\"U-266\",\"restrictionIndex\":null},{\"value\":\"plasmacytoma\",\"restrictionIndex\":null},{\"value\":\"lymphocyte\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"U-266\",\"restrictionIndex\":null}],[{\"value\":\"Z-138\",\"restrictionIndex\":null},{\"value\":\"lymphoma\",\"restrictionIndex\":null},{\"value\":\"lymphoblast\",\"restrictionIndex\":null},{\"value\":\"organism part\",\"restrictionIndex\":null},{\"value\":\"Homo sapiens\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"Z-138\",\"restrictionIndex\":null}],[{\"value\":\"MEL-GATA-1-ER\",\"restrictionIndex\":null},{\"value\":\"type II diabetes mellitus\",\"restrictionIndex\":null},{\"value\":\"erythroblast\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"This is a mouse suspension cell line derived from MEL cells by stable transfection with a GATA-1-ER fusion protein construct as described by Choe et al., 2003 (Cancer Res 63, 6363–6369, 2003). These cells can be terminally differentiated into mature erythroid cells with β-estradiol treatment, while GATA-1 alone can induce MEL cells to differentiate and to lose their tumorigenic properties. [PMID: 14559825]\",\"restrictionIndex\":null},{\"value\":\"MEL-GATA-1-ER\",\"restrictionIndex\":null}],[{\"value\":\"Patski\",\"restrictionIndex\":null},{\"value\":\"breast carcinoma\",\"restrictionIndex\":null},{\"value\":\"fibroblast\",\"restrictionIndex\":null},{\"value\":\"kidney\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":\"female\",\"restrictionIndex\":null},{\"value\":\"Mouse Embryonic Kidney Fibroblast. As described in Lingenfelter et al., 1998 (Nat Genet. 1998 18:212-3) and Yang et al., 2010 (Genome Res. 2010 20:614-22), PATSKI is a female interspecific mouse fibroblast that was derived from the embryonic kidney of an M.spretus x C57BL/6J hybrid mouse such that the C57Bl/6J X chromosome (maternal) is always the inactive X. This is an adherent cell line.\",\"restrictionIndex\":null},{\"value\":\"Patski\",\"restrictionIndex\":null}],[{\"value\":\"416B\",\"restrictionIndex\":null},{\"value\":\"amyloidosis\",\"restrictionIndex\":null},{\"value\":\"myeloid lineage restricted progenitor cell\",\"restrictionIndex\":null},{\"value\":\"blood\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":\"Mouse hematopoietic suspension cell line positive for CD34. The cells have a diploid complement of chromosomes, are non-tumorigenic and bipotential (can be induced to differentiate in vivo into two distinct haematopoietic lineages), and which in appropriate circumstances protect mice from potentially lethal radiation. [PMID: 763330]\",\"restrictionIndex\":null},{\"value\":\"416B\",\"restrictionIndex\":null}],[{\"value\":\"ES-Bruce4\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"embryonic stem cell\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":\"An embryonic cell line isolated from C57BL/6 mouse strain. Injection of Bruce4 cells into C57BL/6 blastocysts will produce agouti chimeras.\",\"restrictionIndex\":null},{\"value\":\"ES-Bruce4\",\"restrictionIndex\":null}],[{\"value\":\"46C\",\"restrictionIndex\":null},{\"value\":\"liver disease\",\"restrictionIndex\":null},{\"value\":\"mouse neural progenitor cell\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":\"46C is an embryonic cell line, constructed in the laboratory of Austin Smith, in which a drug resistance gene is placed under the control of a Sox1 promoter. Cells were isolated from the 129a mouse strain. [PMID: 12524553]\",\"restrictionIndex\":null},{\"value\":\"46C\",\"restrictionIndex\":null}],[{\"value\":\"TT2\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"embryonic stem cell\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":\"male\",\"restrictionIndex\":null},{\"value\":\"ES-cells isolated from C57BL/6xCBA\",\"restrictionIndex\":null},{\"value\":\"TT2\",\"restrictionIndex\":null}],[{\"value\":\"J185a\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"myoblast\",\"restrictionIndex\":null},{\"value\":\"embryo\",\"restrictionIndex\":null},{\"value\":\"Mus musculus\",\"restrictionIndex\":null},{\"value\":null,\"restrictionIndex\":null},{\"value\":\"Fetal myoblast Desmin+\",\"restrictionIndex\":null},{\"value\":\"J185a\",\"restrictionIndex\":null}]]}" +
                "\n";

        String dummyData = "{\"foo\":\"bar\"}";

        String message = populousController.processDataSubmission(data);

        System.out.println(message);



//        JsonFactory jsonFactory = new JsonFactory();
//        ObjectMapper mapper = new ObjectMapper(jsonFactory);
//
//
//        try {
//
//            JsonNode actualObj = mapper.readTree(data);
//            System.out.println(actualObj.get("configuration"));
//            //System.out.println(actualObj.get("data"));
//
//            JsonNode allData = actualObj.get("data");
//            JsonNode firstRow = allData.get(0);
//
//            System.out.println("There are " + firstRow.size() + " fields in the first row");
//
//            for(int i=0; i<firstRow.size(); i++){
//                JsonNode field = firstRow.get(i);
//
//                if(field != null){
//                    System.out.println(field.get("value").getTextValue());
//                    if(field.get("restrictionIndex").isInt()){
//                        System.out.println(field.get("restrictionIndex").getIntValue());
//                    }
//                    else{
//                        System.out.println(field.get("restrictionIndex").getTextValue());
//                    }
//                }
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }




}
