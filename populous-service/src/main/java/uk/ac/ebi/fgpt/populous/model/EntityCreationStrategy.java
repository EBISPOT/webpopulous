package uk.ac.ebi.fgpt.populous.model;

import java.net.URI;

/**
 * Created by dwelter on 11/07/14.
 */
public class EntityCreationStrategy implements EntityCreation{


    @Override
    public URI getDefaultBaseURI() {
        return null;
    }

    @Override
    public boolean useDefaultBaseURI() {
        return false;
    }

    @Override
    public String getDefaultSeparator() {
        return null;
    }

    @Override
    public Class<? extends AutoIDGenerator> getAutoIDGeneratorClass() {
        return null;
    }

    @Override
    public String getAutoIDGeneratorName() {
        return null;
    }

    @Override
    public String getPrefix() {
        return null;
    }

    @Override
    public String getSuffix() {
        return null;
    }

    @Override
    public int getAutoIDDigitCount() {
        return 0;
    }

    @Override
    public int getAutoIDStart() {
        return 0;
    }

    @Override
    public int getAutoIDEnd() {
        return 0;
    }

    @Override
    public boolean isFragmentAutoGenerated() {
        return false;
    }

    @Override
    public boolean isGenerateNameLabel() {
        return false;
    }

    @Override
    public URI getNameLabelURI() {
        return null;
    }

    @Override
    public String getNameLabelLang() {
        return null;
    }

    @Override
    public boolean isGenerateIDLabel() {
        return false;
    }

    @Override
    public Class<? extends LabelDescriptor> getLabelDescriptorClass() {
        return null;
    }
}
