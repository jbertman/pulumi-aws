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
    public sealed class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the cookies in the web request. See Cookies below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchCookies? Cookies;
        /// <summary>
        /// Inspect the request headers. See Headers below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeader> Headers;
        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody? JsonBody;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchCookies? cookies,

            ImmutableArray<Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchHeader> headers,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody? jsonBody,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath? uriPath)
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
