// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
        /// </summary>
        [Input("errorHandlingConfig")]
        public Input<Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfigArgs>? ErrorHandlingConfig { get; set; }

        [Input("idFieldNames")]
        private InputList<string>? _idFieldNames;

        /// <summary>
        /// Name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete.
        /// </summary>
        public InputList<string> IdFieldNames
        {
            get => _idFieldNames ?? (_idFieldNames = new InputList<string>());
            set => _idFieldNames = value;
        }

        /// <summary>
        /// Object specified in the Veeva flow source.
        /// </summary>
        [Input("object", required: true)]
        public Input<string> Object { get; set; } = null!;

        /// <summary>
        /// This specifies the type of write operation to be performed in Zendesk. When the value is `UPSERT`, then `id_field_names` is required. Valid values are `INSERT`, `UPSERT`, `UPDATE`, and `DELETE`.
        /// </summary>
        [Input("writeOperationType")]
        public Input<string>? WriteOperationType { get; set; }

        public FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs()
        {
        }
        public static new FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs Empty => new FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs();
    }
}
