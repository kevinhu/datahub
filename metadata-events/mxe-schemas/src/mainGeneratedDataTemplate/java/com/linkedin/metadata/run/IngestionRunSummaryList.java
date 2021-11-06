
package com.linkedin.metadata.run;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/IngestionRunSummaryList.pdl.")
public class IngestionRunSummaryList
    extends RecordTemplate
{

    private final static IngestionRunSummaryList.Fields _fields = new IngestionRunSummaryList.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record IngestionRunSummaryList{ingestionRunSummaries:array[record IngestionRunSummary{runId:string,timestamp:long,rows:long}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_IngestionRunSummaries = SCHEMA.getField("ingestionRunSummaries");

    public IngestionRunSummaryList() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public IngestionRunSummaryList(DataMap data) {
        super(data, SCHEMA);
    }

    public static IngestionRunSummaryList.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public boolean hasIngestionRunSummaries() {
        return contains(FIELD_IngestionRunSummaries);
    }

    /**
     * Remover for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public void removeIngestionRunSummaries() {
        remove(FIELD_IngestionRunSummaries);
    }

    /**
     * Getter for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public IngestionRunSummaryArray getIngestionRunSummaries(GetMode mode) {
        return obtainWrapped(FIELD_IngestionRunSummaries, IngestionRunSummaryArray.class, mode);
    }

    /**
     * Getter for ingestionRunSummaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    @Nonnull
    public IngestionRunSummaryArray getIngestionRunSummaries() {
        return obtainWrapped(FIELD_IngestionRunSummaries, IngestionRunSummaryArray.class, GetMode.STRICT);
    }

    /**
     * Setter for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public IngestionRunSummaryList setIngestionRunSummaries(IngestionRunSummaryArray value, SetMode mode) {
        putWrapped(FIELD_IngestionRunSummaries, IngestionRunSummaryArray.class, value, mode);
        return this;
    }

    /**
     * Setter for ingestionRunSummaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public IngestionRunSummaryList setIngestionRunSummaries(
        @Nonnull
        IngestionRunSummaryArray value) {
        putWrapped(FIELD_IngestionRunSummaries, IngestionRunSummaryArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public IngestionRunSummaryList clone()
        throws CloneNotSupportedException
    {
        return ((IngestionRunSummaryList) super.clone());
    }

    @Override
    public IngestionRunSummaryList copy()
        throws CloneNotSupportedException
    {
        return ((IngestionRunSummaryList) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.linkedin.metadata.run.IngestionRunSummaryArray.Fields ingestionRunSummaries() {
            return new com.linkedin.metadata.run.IngestionRunSummaryArray.Fields(getPathComponents(), "ingestionRunSummaries");
        }

        public PathSpec ingestionRunSummaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "ingestionRunSummaries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
