/*
 * BrAPI-Genotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.genotype;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.*;

/**
 * A Scale describes the units and acceptable values for an ObservationVariable.  &lt;br&gt;For example, an ObservationVariable might be defined with a Trait of \&quot;plant height\&quot;, a Scale of \&quot;meters\&quot;, and a Method of \&quot;tape measure\&quot;. This variable would be distinct from a variable with the Scale \&quot;inches\&quot; or \&quot;pixels\&quot;.
 */
@Schema(description = "A Scale describes the units and acceptable values for an ObservationVariable.  <br>For example, an ObservationVariable might be defined with a Trait of \"plant height\", a Scale of \"meters\", and a Method of \"tape measure\". This variable would be distinct from a variable with the Scale \"inches\" or \"pixels\".")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T14:54:00.515Z[GMT]")
public class VariableBaseClassScale {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    /**
     * &lt;p&gt;Class of the scale, entries can be&lt;/p&gt; &lt;p&gt;\&quot;Code\&quot; -  This scale class is exceptionally used to express complex traits. Code is a nominal scale that combines the expressions of the different traits composing the complex trait. For example a severity trait might be expressed by a 2 digit and 2 character code. The first 2 digits are the percentage of the plant covered by a fungus and the 2 characters refer to the delay in development, e.g. \&quot;75VD\&quot; means \&quot;75 %\&quot; of the plant is infected and the plant is very delayed.&lt;/p&gt; &lt;p&gt;\&quot;Date\&quot; - The date class is for events expressed in a time format, See ISO 8601&lt;/p&gt; &lt;p&gt;\&quot;Duration\&quot; - The Duration class is for time elapsed between two events expressed in a time format, e.g. days, hours, months&lt;/p&gt; &lt;p&gt;\&quot;Nominal\&quot; - Categorical scale that can take one of a limited and fixed number of categories. There is no intrinsic ordering to the categories&lt;/p&gt; &lt;p&gt;\&quot;Numerical\&quot; - Numerical scales express the trait with real numbers. The numerical scale defines the unit e.g. centimeter, ton per hectare, branches&lt;/p&gt; &lt;p&gt;\&quot;Ordinal\&quot; - Ordinal scales are scales composed of ordered categories&lt;/p&gt; &lt;p&gt;\&quot;Text\&quot; - A free text is used to express the trait.&lt;/p&gt;
     */
    @JsonAdapter(DataTypeEnum.Adapter.class)
    public enum DataTypeEnum {
        CODE("Code"),
        DATE("Date"),
        DURATION("Duration"),
        NOMINAL("Nominal"),
        NUMERICAL("Numerical"),
        ORDINAL("Ordinal"),
        TEXT("Text");

        private String value;

        DataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataTypeEnum fromValue(String input) {
            for (DataTypeEnum b : DataTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<DataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return DataTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("dataType")
    private DataTypeEnum dataType = null;

    @SerializedName("decimalPlaces")
    private Integer decimalPlaces = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("ontologyReference")
    private MethodBaseClassOntologyReference ontologyReference = null;

    @SerializedName("scaleDbId")
    private String scaleDbId = null;

    @SerializedName("scaleName")
    private String scaleName = null;

    @SerializedName("scalePUI")
    private String scalePUI = null;

    @SerializedName("units")
    private String units = null;

    @SerializedName("validValues")
    private ScaleBaseClassValidValues validValues = null;

    public VariableBaseClassScale additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public VariableBaseClassScale putAdditionalInfoItem(String key, String additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap<String, String>();
        }
        this.additionalInfo.put(key, additionalInfoItem);
        return this;
    }

    /**
     * A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.
     *
     * @return additionalInfo
     **/
    @Schema(description = "A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.")
    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public VariableBaseClassScale dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * &lt;p&gt;Class of the scale, entries can be&lt;/p&gt; &lt;p&gt;\&quot;Code\&quot; -  This scale class is exceptionally used to express complex traits. Code is a nominal scale that combines the expressions of the different traits composing the complex trait. For example a severity trait might be expressed by a 2 digit and 2 character code. The first 2 digits are the percentage of the plant covered by a fungus and the 2 characters refer to the delay in development, e.g. \&quot;75VD\&quot; means \&quot;75 %\&quot; of the plant is infected and the plant is very delayed.&lt;/p&gt; &lt;p&gt;\&quot;Date\&quot; - The date class is for events expressed in a time format, See ISO 8601&lt;/p&gt; &lt;p&gt;\&quot;Duration\&quot; - The Duration class is for time elapsed between two events expressed in a time format, e.g. days, hours, months&lt;/p&gt; &lt;p&gt;\&quot;Nominal\&quot; - Categorical scale that can take one of a limited and fixed number of categories. There is no intrinsic ordering to the categories&lt;/p&gt; &lt;p&gt;\&quot;Numerical\&quot; - Numerical scales express the trait with real numbers. The numerical scale defines the unit e.g. centimeter, ton per hectare, branches&lt;/p&gt; &lt;p&gt;\&quot;Ordinal\&quot; - Ordinal scales are scales composed of ordered categories&lt;/p&gt; &lt;p&gt;\&quot;Text\&quot; - A free text is used to express the trait.&lt;/p&gt;
     *
     * @return dataType
     **/
    @Schema(example = "Numerical", description = "<p>Class of the scale, entries can be</p> <p>\"Code\" -  This scale class is exceptionally used to express complex traits. Code is a nominal scale that combines the expressions of the different traits composing the complex trait. For example a severity trait might be expressed by a 2 digit and 2 character code. The first 2 digits are the percentage of the plant covered by a fungus and the 2 characters refer to the delay in development, e.g. \"75VD\" means \"75 %\" of the plant is infected and the plant is very delayed.</p> <p>\"Date\" - The date class is for events expressed in a time format, See ISO 8601</p> <p>\"Duration\" - The Duration class is for time elapsed between two events expressed in a time format, e.g. days, hours, months</p> <p>\"Nominal\" - Categorical scale that can take one of a limited and fixed number of categories. There is no intrinsic ordering to the categories</p> <p>\"Numerical\" - Numerical scales express the trait with real numbers. The numerical scale defines the unit e.g. centimeter, ton per hectare, branches</p> <p>\"Ordinal\" - Ordinal scales are scales composed of ordered categories</p> <p>\"Text\" - A free text is used to express the trait.</p>")
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public VariableBaseClassScale decimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
        return this;
    }

    /**
     * For numerical, number of decimal places to be reported
     *
     * @return decimalPlaces
     **/
    @Schema(example = "2", description = "For numerical, number of decimal places to be reported")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public VariableBaseClassScale externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public VariableBaseClassScale addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReferencesInner>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    /**
     * An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.
     *
     * @return externalReferences
     **/
    @Schema(example = "[{\"referenceId\":\"doi:10.155454/12341234\",\"referenceSource\":\"DOI\"},{\"referenceId\":\"75a50e76\",\"referenceSource\":\"Remote Data Collection Upload Tool\"}]", description = "An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.")
    public List<ExternalReferencesInner> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public VariableBaseClassScale ontologyReference(MethodBaseClassOntologyReference ontologyReference) {
        this.ontologyReference = ontologyReference;
        return this;
    }

    /**
     * Get ontologyReference
     *
     * @return ontologyReference
     **/
    @Schema(description = "")
    public MethodBaseClassOntologyReference getOntologyReference() {
        return ontologyReference;
    }

    public void setOntologyReference(MethodBaseClassOntologyReference ontologyReference) {
        this.ontologyReference = ontologyReference;
    }

    public VariableBaseClassScale scaleDbId(String scaleDbId) {
        this.scaleDbId = scaleDbId;
        return this;
    }

    /**
     * Unique identifier of the scale. If left blank, the upload system will automatically generate a scale ID.
     *
     * @return scaleDbId
     **/
    @Schema(example = "af730171", description = "Unique identifier of the scale. If left blank, the upload system will automatically generate a scale ID.")
    public String getScaleDbId() {
        return scaleDbId;
    }

    public void setScaleDbId(String scaleDbId) {
        this.scaleDbId = scaleDbId;
    }

    public VariableBaseClassScale scaleName(String scaleName) {
        this.scaleName = scaleName;
        return this;
    }

    /**
     * Name of the scale &lt;br/&gt;MIAPPE V1.1 (DM-92) Scale Name of the scale associated with the variable
     *
     * @return scaleName
     **/
    @Schema(example = "Meters", description = "Name of the scale <br/>MIAPPE V1.1 (DM-92) Scale Name of the scale associated with the variable")
    public String getScaleName() {
        return scaleName;
    }

    public void setScaleName(String scaleName) {
        this.scaleName = scaleName;
    }

    public VariableBaseClassScale scalePUI(String scalePUI) {
        this.scalePUI = scalePUI;
        return this;
    }

    /**
     * The Permanent Unique Identifier of a Scale, usually in the form of a URI
     *
     * @return scalePUI
     **/
    @Schema(example = "http://my-traits.com/trait/CO_123:0000112", description = "The Permanent Unique Identifier of a Scale, usually in the form of a URI")
    public String getScalePUI() {
        return scalePUI;
    }

    public void setScalePUI(String scalePUI) {
        this.scalePUI = scalePUI;
    }

    public VariableBaseClassScale units(String units) {
        this.units = units;
        return this;
    }

    /**
     * This field can be used to describe the units used for this scale. This should be the abbreviated  form of the units, intended to be displayed with every value using this scale. Usually this only  applies when &#x60;dataType&#x60; is Numeric, but could also be included for other dataTypes when applicable.
     *
     * @return units
     **/
    @Schema(example = "m", description = "This field can be used to describe the units used for this scale. This should be the abbreviated  form of the units, intended to be displayed with every value using this scale. Usually this only  applies when `dataType` is Numeric, but could also be included for other dataTypes when applicable.")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public VariableBaseClassScale validValues(ScaleBaseClassValidValues validValues) {
        this.validValues = validValues;
        return this;
    }

    /**
     * Get validValues
     *
     * @return validValues
     **/
    @Schema(description = "")
    public ScaleBaseClassValidValues getValidValues() {
        return validValues;
    }

    public void setValidValues(ScaleBaseClassValidValues validValues) {
        this.validValues = validValues;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableBaseClassScale variableBaseClassScale = (VariableBaseClassScale) o;
        return Objects.equals(this.additionalInfo, variableBaseClassScale.additionalInfo) &&
                Objects.equals(this.dataType, variableBaseClassScale.dataType) &&
                Objects.equals(this.decimalPlaces, variableBaseClassScale.decimalPlaces) &&
                Objects.equals(this.externalReferences, variableBaseClassScale.externalReferences) &&
                Objects.equals(this.ontologyReference, variableBaseClassScale.ontologyReference) &&
                Objects.equals(this.scaleDbId, variableBaseClassScale.scaleDbId) &&
                Objects.equals(this.scaleName, variableBaseClassScale.scaleName) &&
                Objects.equals(this.scalePUI, variableBaseClassScale.scalePUI) &&
                Objects.equals(this.units, variableBaseClassScale.units) &&
                Objects.equals(this.validValues, variableBaseClassScale.validValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, dataType, decimalPlaces, externalReferences, ontologyReference, scaleDbId, scaleName, scalePUI, units, validValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableBaseClassScale {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
        sb.append("    scaleDbId: ").append(toIndentedString(scaleDbId)).append("\n");
        sb.append("    scaleName: ").append(toIndentedString(scaleName)).append("\n");
        sb.append("    scalePUI: ").append(toIndentedString(scalePUI)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
        sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
