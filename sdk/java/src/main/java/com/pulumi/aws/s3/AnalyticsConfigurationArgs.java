// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs;
import com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationArgs Empty = new AnalyticsConfigurationArgs();

    /**
     * The name of the bucket this analytics configuration is associated with.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket this analytics configuration is associated with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<AnalyticsConfigurationFilterArgs> filter;

    /**
     * @return Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    public Optional<Output<AnalyticsConfigurationFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Unique identifier of the analytics configuration for the bucket.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier of the analytics configuration for the bucket.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration for the analytics data export (documented below).
     * 
     */
    @Import(name="storageClassAnalysis")
    private @Nullable Output<AnalyticsConfigurationStorageClassAnalysisArgs> storageClassAnalysis;

    /**
     * @return Configuration for the analytics data export (documented below).
     * 
     */
    public Optional<Output<AnalyticsConfigurationStorageClassAnalysisArgs>> storageClassAnalysis() {
        return Optional.ofNullable(this.storageClassAnalysis);
    }

    private AnalyticsConfigurationArgs() {}

    private AnalyticsConfigurationArgs(AnalyticsConfigurationArgs $) {
        this.bucket = $.bucket;
        this.filter = $.filter;
        this.name = $.name;
        this.storageClassAnalysis = $.storageClassAnalysis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsConfigurationArgs $;

        public Builder() {
            $ = new AnalyticsConfigurationArgs();
        }

        public Builder(AnalyticsConfigurationArgs defaults) {
            $ = new AnalyticsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket this analytics configuration is associated with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket this analytics configuration is associated with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param filter Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<AnalyticsConfigurationFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(AnalyticsConfigurationFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name Unique identifier of the analytics configuration for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier of the analytics configuration for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageClassAnalysis Configuration for the analytics data export (documented below).
         * 
         * @return builder
         * 
         */
        public Builder storageClassAnalysis(@Nullable Output<AnalyticsConfigurationStorageClassAnalysisArgs> storageClassAnalysis) {
            $.storageClassAnalysis = storageClassAnalysis;
            return this;
        }

        /**
         * @param storageClassAnalysis Configuration for the analytics data export (documented below).
         * 
         * @return builder
         * 
         */
        public Builder storageClassAnalysis(AnalyticsConfigurationStorageClassAnalysisArgs storageClassAnalysis) {
            return storageClassAnalysis(Output.of(storageClassAnalysis));
        }

        public AnalyticsConfigurationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
