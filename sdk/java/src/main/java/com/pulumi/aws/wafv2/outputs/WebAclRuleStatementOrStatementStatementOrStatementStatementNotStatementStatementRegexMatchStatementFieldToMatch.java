// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    private @Nullable List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader> headers;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath uriPath;

    private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies cookies;
        private @Nullable List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader> headers;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody jsonBody;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch build() {
            final var o = new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.cookies = cookies;
            o.headers = headers;
            o.jsonBody = jsonBody;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}
