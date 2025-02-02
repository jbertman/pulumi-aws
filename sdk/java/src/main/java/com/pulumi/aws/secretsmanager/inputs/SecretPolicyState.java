// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final SecretPolicyState Empty = new SecretPolicyState();

    /**
     * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
     * 
     */
    @Import(name="blockPublicPolicy")
    private @Nullable Output<Boolean> blockPublicPolicy;

    /**
     * @return Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
     * 
     */
    public Optional<Output<Boolean>> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }

    /**
     * Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Secret ARN.
     * 
     */
    @Import(name="secretArn")
    private @Nullable Output<String> secretArn;

    /**
     * @return Secret ARN.
     * 
     */
    public Optional<Output<String>> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    private SecretPolicyState() {}

    private SecretPolicyState(SecretPolicyState $) {
        this.blockPublicPolicy = $.blockPublicPolicy;
        this.policy = $.policy;
        this.secretArn = $.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretPolicyState $;

        public Builder() {
            $ = new SecretPolicyState();
        }

        public Builder(SecretPolicyState defaults) {
            $ = new SecretPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockPublicPolicy Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicPolicy(@Nullable Output<Boolean> blockPublicPolicy) {
            $.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * @param blockPublicPolicy Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
         * 
         * @return builder
         * 
         */
        public Builder blockPublicPolicy(Boolean blockPublicPolicy) {
            return blockPublicPolicy(Output.of(blockPublicPolicy));
        }

        /**
         * @param policy Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `aws.secretsmanager.Secret`, where `policy` can be set to `&#34;{}&#34;` to delete the policy, `&#34;{}&#34;` is not a valid policy since `policy` is required.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param secretArn Secret ARN.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(@Nullable Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        /**
         * @param secretArn Secret ARN.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        public SecretPolicyState build() {
            return $;
        }
    }

}
