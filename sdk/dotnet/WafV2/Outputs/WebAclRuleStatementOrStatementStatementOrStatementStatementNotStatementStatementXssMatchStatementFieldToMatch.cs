// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the cookies in the web request. See Cookies below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchCookies? Cookies;
        /// <summary>
        /// Inspect the request headers. See Headers below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchHeader> Headers;
        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchJsonBody? JsonBody;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchCookies? cookies,

            ImmutableArray<Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchHeader> headers,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchJsonBody? jsonBody,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath? uriPath)
        {
            AllQueryArguments = allQueryArguments;
            Body = body;
            Cookies = cookies;
            Headers = headers;
            JsonBody = jsonBody;
            Method = method;
            QueryString = queryString;
            SingleHeader = singleHeader;
            SingleQueryArgument = singleQueryArgument;
            UriPath = uriPath;
        }
    }
}
