// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroups.inputs;

import com.pulumi.aws.resourcegroups.inputs.GroupConfigurationParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GroupConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupConfigurationArgs Empty = new GroupConfigurationArgs();

    /**
     * A collection of parameters for this group configuration item. See below for details.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<List<GroupConfigurationParameterArgs>> parameters;

    /**
     * @return A collection of parameters for this group configuration item. See below for details.
     * 
     */
    public Output<List<GroupConfigurationParameterArgs>> parameters() {
        return this.parameters;
    }

    /**
     * Specifies the type of group configuration item.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of group configuration item.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GroupConfigurationArgs() {}

    private GroupConfigurationArgs(GroupConfigurationArgs $) {
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupConfigurationArgs $;

        public Builder() {
            $ = new GroupConfigurationArgs();
        }

        public Builder(GroupConfigurationArgs defaults) {
            $ = new GroupConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameters A collection of parameters for this group configuration item. See below for details.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<List<GroupConfigurationParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A collection of parameters for this group configuration item. See below for details.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<GroupConfigurationParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters A collection of parameters for this group configuration item. See below for details.
         * 
         * @return builder
         * 
         */
        public Builder parameters(GroupConfigurationParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param type Specifies the type of group configuration item.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of group configuration item.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GroupConfigurationArgs build() {
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
