
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/RollbackResponse.pdl.")
public class RollbackResponse
    extends RecordTemplate
{

    private final static RollbackResponse.Fields _fields = new RollbackResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record RollbackResponse{aspectRowSummaries:array[record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean}]entitiesAffected:long,aspectsAffected:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AspectRowSummaries = SCHEMA.getField("aspectRowSummaries");
    private final static RecordDataSchema.Field FIELD_EntitiesAffected = SCHEMA.getField("entitiesAffected");
    private final static RecordDataSchema.Field FIELD_AspectsAffected = SCHEMA.getField("aspectsAffected");

    public RollbackResponse() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public RollbackResponse(DataMap data) {
        super(data, SCHEMA);
    }

    public static RollbackResponse.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public boolean hasAspectRowSummaries() {
        return contains(FIELD_AspectRowSummaries);
    }

    /**
     * Remover for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public void removeAspectRowSummaries() {
        remove(FIELD_AspectRowSummaries);
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public AspectRowSummaryArray getAspectRowSummaries(GetMode mode) {
        return obtainWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, mode);
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    @Nonnull
    public AspectRowSummaryArray getAspectRowSummaries() {
        return obtainWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public RollbackResponse setAspectRowSummaries(AspectRowSummaryArray value, SetMode mode) {
        putWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public RollbackResponse setAspectRowSummaries(
        @Nonnull
        AspectRowSummaryArray value) {
        putWrapped(FIELD_AspectRowSummaries, AspectRowSummaryArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public boolean hasEntitiesAffected() {
        return contains(FIELD_EntitiesAffected);
    }

    /**
     * Remover for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public void removeEntitiesAffected() {
        remove(FIELD_EntitiesAffected);
    }

    /**
     * Getter for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public Long getEntitiesAffected(GetMode mode) {
        return obtainDirect(FIELD_EntitiesAffected, Long.class, mode);
    }

    /**
     * Getter for entitiesAffected
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#entitiesAffected
     */
    @Nonnull
    public Long getEntitiesAffected() {
        return obtainDirect(FIELD_EntitiesAffected, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public RollbackResponse setEntitiesAffected(Long value, SetMode mode) {
        putDirect(FIELD_EntitiesAffected, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for entitiesAffected
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public RollbackResponse setEntitiesAffected(
        @Nonnull
        Long value) {
        putDirect(FIELD_EntitiesAffected, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public RollbackResponse setEntitiesAffected(long value) {
        putDirect(FIELD_EntitiesAffected, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public boolean hasAspectsAffected() {
        return contains(FIELD_AspectsAffected);
    }

    /**
     * Remover for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public void removeAspectsAffected() {
        remove(FIELD_AspectsAffected);
    }

    /**
     * Getter for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public Long getAspectsAffected(GetMode mode) {
        return obtainDirect(FIELD_AspectsAffected, Long.class, mode);
    }

    /**
     * Getter for aspectsAffected
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#aspectsAffected
     */
    @Nonnull
    public Long getAspectsAffected() {
        return obtainDirect(FIELD_AspectsAffected, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public RollbackResponse setAspectsAffected(Long value, SetMode mode) {
        putDirect(FIELD_AspectsAffected, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for aspectsAffected
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public RollbackResponse setAspectsAffected(
        @Nonnull
        Long value) {
        putDirect(FIELD_AspectsAffected, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public RollbackResponse setAspectsAffected(long value) {
        putDirect(FIELD_AspectsAffected, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public RollbackResponse clone()
        throws CloneNotSupportedException
    {
        return ((RollbackResponse) super.clone());
    }

    @Override
    public RollbackResponse copy()
        throws CloneNotSupportedException
    {
        return ((RollbackResponse) super.copy());
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

        public PathSpec entitiesAffected() {
            return new PathSpec(getPathComponents(), "entitiesAffected");
        }

        public PathSpec aspectsAffected() {
            return new PathSpec(getPathComponents(), "aspectsAffected");
        }

    }

}
