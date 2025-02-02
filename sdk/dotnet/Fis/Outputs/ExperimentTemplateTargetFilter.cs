// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fis.Outputs
{

    [OutputType]
    public sealed class ExperimentTemplateTargetFilter
    {
        /// <summary>
        /// Attribute path for the filter.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Set of attribute values for the filter.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private ExperimentTemplateTargetFilter(
            string path,

            ImmutableArray<string> values)
        {
            Path = path;
            Values = values;
        }
    }
}
