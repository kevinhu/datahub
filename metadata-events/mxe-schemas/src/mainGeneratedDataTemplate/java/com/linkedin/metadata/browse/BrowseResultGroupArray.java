
package com.linkedin.metadata.browse;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResult.pdl.")
public class BrowseResultGroupArray
    extends WrappingArrayTemplate<BrowseResultGroup>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.browse,record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}}]", SchemaFormatType.PDL));

    public BrowseResultGroupArray() {
        this(new DataList());
    }

    public BrowseResultGroupArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public BrowseResultGroupArray(Collection<BrowseResultGroup> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public BrowseResultGroupArray(DataList data) {
        super(data, SCHEMA, BrowseResultGroup.class);
    }

    public BrowseResultGroupArray(BrowseResultGroup first, BrowseResultGroup... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public BrowseResultGroupArray clone()
        throws CloneNotSupportedException
    {
        return ((BrowseResultGroupArray) super.clone());
    }

    @Override
    public BrowseResultGroupArray copy()
        throws CloneNotSupportedException
    {
        return ((BrowseResultGroupArray) super.copy());
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

        public com.linkedin.metadata.browse.BrowseResultGroup.Fields items() {
            return new com.linkedin.metadata.browse.BrowseResultGroup.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
