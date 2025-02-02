// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm
{
    public static class GetParameter
    {
        /// <summary>
        /// Provides an SSM Parameter data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Aws.Ssm.GetParameter.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note:** The data source is currently following the behavior of the [SSM API](https://docs.aws.amazon.com/sdk-for-go/api/service/ssm/#Parameter) to return a string value, regardless of parameter type.
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetParameterResult> InvokeAsync(GetParameterArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetParameterResult>("aws:ssm/getParameter:getParameter", args ?? new GetParameterArgs(), options.WithDefaults());

        /// <summary>
        /// Provides an SSM Parameter data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Aws.Ssm.GetParameter.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **Note:** The data source is currently following the behavior of the [SSM API](https://docs.aws.amazon.com/sdk-for-go/api/service/ssm/#Parameter) to return a string value, regardless of parameter type.
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetParameterResult> Invoke(GetParameterInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetParameterResult>("aws:ssm/getParameter:getParameter", args ?? new GetParameterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetParameterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the parameter.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Whether to return decrypted `SecureString` value. Defaults to `true`.
        /// </summary>
        [Input("withDecryption")]
        public bool? WithDecryption { get; set; }

        public GetParameterArgs()
        {
        }
        public static new GetParameterArgs Empty => new GetParameterArgs();
    }

    public sealed class GetParameterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the parameter.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Whether to return decrypted `SecureString` value. Defaults to `true`.
        /// </summary>
        [Input("withDecryption")]
        public Input<bool>? WithDecryption { get; set; }

        public GetParameterInvokeArgs()
        {
        }
        public static new GetParameterInvokeArgs Empty => new GetParameterInvokeArgs();
    }


    [OutputType]
    public sealed class GetParameterResult
    {
        public readonly string Arn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string Type;
        public readonly string Value;
        public readonly int Version;
        public readonly bool? WithDecryption;

        [OutputConstructor]
        private GetParameterResult(
            string arn,

            string id,

            string name,

            string type,

            string value,

            int version,

            bool? withDecryption)
        {
            Arn = arn;
            Id = id;
            Name = name;
            Type = type;
            Value = value;
            Version = version;
            WithDecryption = withDecryption;
        }
    }
}
