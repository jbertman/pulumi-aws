// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchCookiesArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchJsonBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    @Import(name="cookies")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchCookiesArgs> cookies;

    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchCookiesArgs>> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    /**
     * Inspect the request headers. See Headers below for details.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchHeaderArgs>> headers;

    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    public Optional<Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    @Import(name="jsonBody")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchJsonBodyArgs> jsonBody;

    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchJsonBodyArgs>> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs() {}

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.cookies = $.cookies;
        this.headers = $.headers;
        this.jsonBody = $.jsonBody;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers.
         * 
         * @return builder
         * 
         */
        public Builder body(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        /**
         * @param cookies Inspect the cookies in the web request. See Cookies below for details.
         * 
         * @return builder
         * 
         */
        public Builder cookies(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchCookiesArgs> cookies) {
            $.cookies = cookies;
            return this;
        }

        /**
         * @param cookies Inspect the cookies in the web request. See Cookies below for details.
         * 
         * @return builder
         * 
         */
        public Builder cookies(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchCookiesArgs cookies) {
            return cookies(Output.of(cookies));
        }

        /**
         * @param headers Inspect the request headers. See Headers below for details.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Inspect the request headers. See Headers below for details.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Inspect the request headers. See Headers below for details.
         * 
         * @return builder
         * 
         */
        public Builder headers(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
         * 
         * @return builder
         * 
         */
        public Builder jsonBody(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchJsonBodyArgs> jsonBody) {
            $.jsonBody = jsonBody;
            return this;
        }

        /**
         * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
         * 
         * @return builder
         * 
         */
        public Builder jsonBody(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchJsonBodyArgs jsonBody) {
            return jsonBody(Output.of(jsonBody));
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param singleHeader Inspect a single header. See Single Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        /**
         * @param singleHeader Inspect a single header. See Single Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
