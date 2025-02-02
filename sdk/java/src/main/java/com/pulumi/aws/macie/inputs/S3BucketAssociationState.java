// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie.inputs;

import com.pulumi.aws.macie.inputs.S3BucketAssociationClassificationTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class S3BucketAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final S3BucketAssociationState Empty = new S3BucketAssociationState();

    /**
     * The name of the S3 bucket that you want to associate with Amazon Macie.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return The name of the S3 bucket that you want to associate with Amazon Macie.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * The configuration of how Amazon Macie classifies the S3 objects.
     * 
     */
    @Import(name="classificationType")
    private @Nullable Output<S3BucketAssociationClassificationTypeArgs> classificationType;

    /**
     * @return The configuration of how Amazon Macie classifies the S3 objects.
     * 
     */
    public Optional<Output<S3BucketAssociationClassificationTypeArgs>> classificationType() {
        return Optional.ofNullable(this.classificationType);
    }

    /**
     * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `member_account_id` isn&#39;t specified, the action associates specified S3 resources with Macie for the current master account.
     * 
     */
    @Import(name="memberAccountId")
    private @Nullable Output<String> memberAccountId;

    /**
     * @return The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `member_account_id` isn&#39;t specified, the action associates specified S3 resources with Macie for the current master account.
     * 
     */
    public Optional<Output<String>> memberAccountId() {
        return Optional.ofNullable(this.memberAccountId);
    }

    /**
     * Object key prefix identifying one or more S3 objects to which the association applies.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Object key prefix identifying one or more S3 objects to which the association applies.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private S3BucketAssociationState() {}

    private S3BucketAssociationState(S3BucketAssociationState $) {
        this.bucketName = $.bucketName;
        this.classificationType = $.classificationType;
        this.memberAccountId = $.memberAccountId;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(S3BucketAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private S3BucketAssociationState $;

        public Builder() {
            $ = new S3BucketAssociationState();
        }

        public Builder(S3BucketAssociationState defaults) {
            $ = new S3BucketAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the S3 bucket that you want to associate with Amazon Macie.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the S3 bucket that you want to associate with Amazon Macie.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param classificationType The configuration of how Amazon Macie classifies the S3 objects.
         * 
         * @return builder
         * 
         */
        public Builder classificationType(@Nullable Output<S3BucketAssociationClassificationTypeArgs> classificationType) {
            $.classificationType = classificationType;
            return this;
        }

        /**
         * @param classificationType The configuration of how Amazon Macie classifies the S3 objects.
         * 
         * @return builder
         * 
         */
        public Builder classificationType(S3BucketAssociationClassificationTypeArgs classificationType) {
            return classificationType(Output.of(classificationType));
        }

        /**
         * @param memberAccountId The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `member_account_id` isn&#39;t specified, the action associates specified S3 resources with Macie for the current master account.
         * 
         * @return builder
         * 
         */
        public Builder memberAccountId(@Nullable Output<String> memberAccountId) {
            $.memberAccountId = memberAccountId;
            return this;
        }

        /**
         * @param memberAccountId The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `member_account_id` isn&#39;t specified, the action associates specified S3 resources with Macie for the current master account.
         * 
         * @return builder
         * 
         */
        public Builder memberAccountId(String memberAccountId) {
            return memberAccountId(Output.of(memberAccountId));
        }

        /**
         * @param prefix Object key prefix identifying one or more S3 objects to which the association applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Object key prefix identifying one or more S3 objects to which the association applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public S3BucketAssociationState build() {
            return $;
        }
    }

}
