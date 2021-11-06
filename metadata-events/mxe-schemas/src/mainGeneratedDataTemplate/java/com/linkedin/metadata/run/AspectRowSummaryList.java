
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/AspectRowSummaryList.pdl.")
public class AspectRowSummaryList
    extends RecordTemplate
{

    private final static AspectRowSummaryList.Fields _fields = new AspectRowSummaryList.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record AspectRowSummaryList{aspectRowSummaries:array[record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AspectRowSummaries = SCHEMA.getField("aspectRowSummaries");

    public AspectRowSummaryList() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public AspectRowSummaryList(DataMap data) {
        super(data, SCHEMA);
    }

    public static AspectRowSummaryList.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public boolean hasAspectRowSummaries() {
        return contains(FIELD_AspectRowSummaries);
    }

    /**
     * Remover for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public void removeAspectRowSummaries() {
        remove(FIELD_AspectRowSummaries);
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public AspectRowSummaryArray getAspectRowSummaries(GetMode mode) {
        return obtainWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, mode);
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    @Nonnull
    public AspectRowSummaryArray getAspectRowSummaries() {
        return obtainWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public AspectRowSummaryList setAspectRowSummaries(AspectRowSummaryArray value, SetMode mode) {
        putWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public AspectRowSummaryList setAspectRowSummaries(
        @Nonnull
        AspectRowSummaryArray value) {
        putWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public AspectRowSummaryList clone()
        throws CloneNotSupportedException
    {
        return ((AspectRowSummaryList) super.clone());
    }

    @Override
    public AspectRowSummaryList copy()
        throws CloneNotSupportedException
    {
        return ((AspectRowSummaryList) super.copy());
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

        public com.linkedin.metadata.run.AspectRowSummaryArray.Fields aspectRowSummaries() {
            return new com.linkedin.metadata.run.AspectRowSummaryArray.Fields(getPathComponents(), "aspectRowSummaries");
        }

        public PathSpec aspectRowSummaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspectRowSummaries");
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
