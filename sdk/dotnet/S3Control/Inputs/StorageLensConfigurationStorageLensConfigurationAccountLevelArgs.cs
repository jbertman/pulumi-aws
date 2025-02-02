// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3Control.Inputs
{

    public sealed class StorageLensConfigurationStorageLensConfigurationAccountLevelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// S3 Storage Lens activity metrics. See Activity Metrics below for more details.
        /// </summary>
        [Input("activityMetrics")]
        public Input<Inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetricsArgs>? ActivityMetrics { get; set; }

        /// <summary>
        /// S3 Storage Lens bucket-level configuration. See Bucket Level below for more details.
        /// </summary>
        [Input("bucketLevel", required: true)]
        public Input<Inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs> BucketLevel { get; set; } = null!;

        public StorageLensConfigurationStorageLensConfigurationAccountLevelArgs()
        {
        }
        public static new StorageLensConfigurationStorageLensConfigurationAccountLevelArgs Empty => new StorageLensConfigurationStorageLensConfigurationAccountLevelArgs();
    }
}
