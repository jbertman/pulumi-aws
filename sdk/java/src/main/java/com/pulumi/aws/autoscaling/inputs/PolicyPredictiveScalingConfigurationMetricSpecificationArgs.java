// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs;
import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs;
import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs;
import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs;
import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs;
import com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyPredictiveScalingConfigurationMetricSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyPredictiveScalingConfigurationMetricSpecificationArgs Empty = new PolicyPredictiveScalingConfigurationMetricSpecificationArgs();

    /**
     * Customized capacity metric specification. The field is only valid when you use `customized_load_metric_specification`
     * 
     */
    @Import(name="customizedCapacityMetricSpecification")
    private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs> customizedCapacityMetricSpecification;

    /**
     * @return Customized capacity metric specification. The field is only valid when you use `customized_load_metric_specification`
     * 
     */
    public Optional<Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs>> customizedCapacityMetricSpecification() {
        return Optional.ofNullable(this.customizedCapacityMetricSpecification);
    }

    /**
     * Customized load metric specification.
     * 
     */
    @Import(name="customizedLoadMetricSpecification")
    private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs> customizedLoadMetricSpecification;

    /**
     * @return Customized load metric specification.
     * 
     */
    public Optional<Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs>> customizedLoadMetricSpecification() {
        return Optional.ofNullable(this.customizedLoadMetricSpecification);
    }

    /**
     * Customized scaling metric specification.
     * 
     */
    @Import(name="customizedScalingMetricSpecification")
    private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs> customizedScalingMetricSpecification;

    /**
     * @return Customized scaling metric specification.
     * 
     */
    public Optional<Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs>> customizedScalingMetricSpecification() {
        return Optional.ofNullable(this.customizedScalingMetricSpecification);
    }

    /**
     * Predefined load metric specification.
     * 
     */
    @Import(name="predefinedLoadMetricSpecification")
    private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs> predefinedLoadMetricSpecification;

    /**
     * @return Predefined load metric specification.
     * 
     */
    public Optional<Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs>> predefinedLoadMetricSpecification() {
        return Optional.ofNullable(this.predefinedLoadMetricSpecification);
    }

    /**
     * Metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
     */
    @Import(name="predefinedMetricPairSpecification")
    private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs> predefinedMetricPairSpecification;

    /**
     * @return Metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
     */
    public Optional<Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs>> predefinedMetricPairSpecification() {
        return Optional.ofNullable(this.predefinedMetricPairSpecification);
    }

    /**
     * Predefined scaling metric specification.
     * 
     */
    @Import(name="predefinedScalingMetricSpecification")
    private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs> predefinedScalingMetricSpecification;

    /**
     * @return Predefined scaling metric specification.
     * 
     */
    public Optional<Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs>> predefinedScalingMetricSpecification() {
        return Optional.ofNullable(this.predefinedScalingMetricSpecification);
    }

    /**
     * Target value for the metric.
     * 
     */
    @Import(name="targetValue", required=true)
    private Output<Integer> targetValue;

    /**
     * @return Target value for the metric.
     * 
     */
    public Output<Integer> targetValue() {
        return this.targetValue;
    }

    private PolicyPredictiveScalingConfigurationMetricSpecificationArgs() {}

    private PolicyPredictiveScalingConfigurationMetricSpecificationArgs(PolicyPredictiveScalingConfigurationMetricSpecificationArgs $) {
        this.customizedCapacityMetricSpecification = $.customizedCapacityMetricSpecification;
        this.customizedLoadMetricSpecification = $.customizedLoadMetricSpecification;
        this.customizedScalingMetricSpecification = $.customizedScalingMetricSpecification;
        this.predefinedLoadMetricSpecification = $.predefinedLoadMetricSpecification;
        this.predefinedMetricPairSpecification = $.predefinedMetricPairSpecification;
        this.predefinedScalingMetricSpecification = $.predefinedScalingMetricSpecification;
        this.targetValue = $.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyPredictiveScalingConfigurationMetricSpecificationArgs $;

        public Builder() {
            $ = new PolicyPredictiveScalingConfigurationMetricSpecificationArgs();
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationArgs defaults) {
            $ = new PolicyPredictiveScalingConfigurationMetricSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customizedCapacityMetricSpecification Customized capacity metric specification. The field is only valid when you use `customized_load_metric_specification`
         * 
         * @return builder
         * 
         */
        public Builder customizedCapacityMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs> customizedCapacityMetricSpecification) {
            $.customizedCapacityMetricSpecification = customizedCapacityMetricSpecification;
            return this;
        }

        /**
         * @param customizedCapacityMetricSpecification Customized capacity metric specification. The field is only valid when you use `customized_load_metric_specification`
         * 
         * @return builder
         * 
         */
        public Builder customizedCapacityMetricSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs customizedCapacityMetricSpecification) {
            return customizedCapacityMetricSpecification(Output.of(customizedCapacityMetricSpecification));
        }

        /**
         * @param customizedLoadMetricSpecification Customized load metric specification.
         * 
         * @return builder
         * 
         */
        public Builder customizedLoadMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs> customizedLoadMetricSpecification) {
            $.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
            return this;
        }

        /**
         * @param customizedLoadMetricSpecification Customized load metric specification.
         * 
         * @return builder
         * 
         */
        public Builder customizedLoadMetricSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs customizedLoadMetricSpecification) {
            return customizedLoadMetricSpecification(Output.of(customizedLoadMetricSpecification));
        }

        /**
         * @param customizedScalingMetricSpecification Customized scaling metric specification.
         * 
         * @return builder
         * 
         */
        public Builder customizedScalingMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs> customizedScalingMetricSpecification) {
            $.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
            return this;
        }

        /**
         * @param customizedScalingMetricSpecification Customized scaling metric specification.
         * 
         * @return builder
         * 
         */
        public Builder customizedScalingMetricSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs customizedScalingMetricSpecification) {
            return customizedScalingMetricSpecification(Output.of(customizedScalingMetricSpecification));
        }

        /**
         * @param predefinedLoadMetricSpecification Predefined load metric specification.
         * 
         * @return builder
         * 
         */
        public Builder predefinedLoadMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs> predefinedLoadMetricSpecification) {
            $.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }

        /**
         * @param predefinedLoadMetricSpecification Predefined load metric specification.
         * 
         * @return builder
         * 
         */
        public Builder predefinedLoadMetricSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs predefinedLoadMetricSpecification) {
            return predefinedLoadMetricSpecification(Output.of(predefinedLoadMetricSpecification));
        }

        /**
         * @param predefinedMetricPairSpecification Metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricPairSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs> predefinedMetricPairSpecification) {
            $.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
            return this;
        }

        /**
         * @param predefinedMetricPairSpecification Metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricPairSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs predefinedMetricPairSpecification) {
            return predefinedMetricPairSpecification(Output.of(predefinedMetricPairSpecification));
        }

        /**
         * @param predefinedScalingMetricSpecification Predefined scaling metric specification.
         * 
         * @return builder
         * 
         */
        public Builder predefinedScalingMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs> predefinedScalingMetricSpecification) {
            $.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }

        /**
         * @param predefinedScalingMetricSpecification Predefined scaling metric specification.
         * 
         * @return builder
         * 
         */
        public Builder predefinedScalingMetricSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs predefinedScalingMetricSpecification) {
            return predefinedScalingMetricSpecification(Output.of(predefinedScalingMetricSpecification));
        }

        /**
         * @param targetValue Target value for the metric.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Output<Integer> targetValue) {
            $.targetValue = targetValue;
            return this;
        }

        /**
         * @param targetValue Target value for the metric.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Integer targetValue) {
            return targetValue(Output.of(targetValue));
        }

        public PolicyPredictiveScalingConfigurationMetricSpecificationArgs build() {
            $.targetValue = Objects.requireNonNull($.targetValue, "expected parameter 'targetValue' to be non-null");
            return $;
        }
    }

}
