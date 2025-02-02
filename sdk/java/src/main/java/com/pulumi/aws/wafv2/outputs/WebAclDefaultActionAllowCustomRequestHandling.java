// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclDefaultActionAllowCustomRequestHandlingInsertHeader;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclDefaultActionAllowCustomRequestHandling {
    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

    private WebAclDefaultActionAllowCustomRequestHandling() {}
    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllowCustomRequestHandling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders;
        public Builder() {}
        public Builder(WebAclDefaultActionAllowCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        @CustomType.Setter
        public Builder insertHeaders(List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(WebAclDefaultActionAllowCustomRequestHandlingInsertHeader... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }
        public WebAclDefaultActionAllowCustomRequestHandling build() {
            final var o = new WebAclDefaultActionAllowCustomRequestHandling();
            o.insertHeaders = insertHeaders;
            return o;
        }
    }
}
