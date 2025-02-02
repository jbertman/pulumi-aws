// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediapackage.inputs;

import com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelHlsIngestArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelHlsIngestArgs Empty = new ChannelHlsIngestArgs();

    /**
     * A list of the ingest endpoints
     * 
     */
    @Import(name="ingestEndpoints")
    private @Nullable Output<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints;

    /**
     * @return A list of the ingest endpoints
     * 
     */
    public Optional<Output<List<ChannelHlsIngestIngestEndpointArgs>>> ingestEndpoints() {
        return Optional.ofNullable(this.ingestEndpoints);
    }

    private ChannelHlsIngestArgs() {}

    private ChannelHlsIngestArgs(ChannelHlsIngestArgs $) {
        this.ingestEndpoints = $.ingestEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelHlsIngestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelHlsIngestArgs $;

        public Builder() {
            $ = new ChannelHlsIngestArgs();
        }

        public Builder(ChannelHlsIngestArgs defaults) {
            $ = new ChannelHlsIngestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ingestEndpoints A list of the ingest endpoints
         * 
         * @return builder
         * 
         */
        public Builder ingestEndpoints(@Nullable Output<List<ChannelHlsIngestIngestEndpointArgs>> ingestEndpoints) {
            $.ingestEndpoints = ingestEndpoints;
            return this;
        }

        /**
         * @param ingestEndpoints A list of the ingest endpoints
         * 
         * @return builder
         * 
         */
        public Builder ingestEndpoints(List<ChannelHlsIngestIngestEndpointArgs> ingestEndpoints) {
            return ingestEndpoints(Output.of(ingestEndpoints));
        }

        /**
         * @param ingestEndpoints A list of the ingest endpoints
         * 
         * @return builder
         * 
         */
        public Builder ingestEndpoints(ChannelHlsIngestIngestEndpointArgs... ingestEndpoints) {
            return ingestEndpoints(List.of(ingestEndpoints));
        }

        public ChannelHlsIngestArgs build() {
            return $;
        }
    }

}
