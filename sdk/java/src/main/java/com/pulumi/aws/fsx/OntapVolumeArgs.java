// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OntapVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OntapVolumeArgs Empty = new OntapVolumeArgs();

    /**
     * Specifies the location in the storage virtual machine&#39;s namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    @Import(name="junctionPath", required=true)
    private Output<String> junctionPath;

    /**
     * @return Specifies the location in the storage virtual machine&#39;s namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    public Output<String> junctionPath() {
        return this.junctionPath;
    }

    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     * 
     */
    @Import(name="securityStyle")
    private @Nullable Output<String> securityStyle;

    /**
     * @return Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     * 
     */
    public Optional<Output<String>> securityStyle() {
        return Optional.ofNullable(this.securityStyle);
    }

    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    @Import(name="sizeInMegabytes", required=true)
    private Output<Integer> sizeInMegabytes;

    /**
     * @return Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    public Output<Integer> sizeInMegabytes() {
        return this.sizeInMegabytes;
    }

    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    @Import(name="storageEfficiencyEnabled", required=true)
    private Output<Boolean> storageEfficiencyEnabled;

    /**
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    public Output<Boolean> storageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * Specifies the storage virtual machine in which to create the volume.
     * 
     */
    @Import(name="storageVirtualMachineId", required=true)
    private Output<String> storageVirtualMachineId;

    /**
     * @return Specifies the storage virtual machine in which to create the volume.
     * 
     */
    public Output<String> storageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tieringPolicy")
    private @Nullable Output<OntapVolumeTieringPolicyArgs> tieringPolicy;

    public Optional<Output<OntapVolumeTieringPolicyArgs>> tieringPolicy() {
        return Optional.ofNullable(this.tieringPolicy);
    }

    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    /**
     * @return The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private OntapVolumeArgs() {}

    private OntapVolumeArgs(OntapVolumeArgs $) {
        this.junctionPath = $.junctionPath;
        this.name = $.name;
        this.securityStyle = $.securityStyle;
        this.sizeInMegabytes = $.sizeInMegabytes;
        this.storageEfficiencyEnabled = $.storageEfficiencyEnabled;
        this.storageVirtualMachineId = $.storageVirtualMachineId;
        this.tags = $.tags;
        this.tieringPolicy = $.tieringPolicy;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OntapVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OntapVolumeArgs $;

        public Builder() {
            $ = new OntapVolumeArgs();
        }

        public Builder(OntapVolumeArgs defaults) {
            $ = new OntapVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param junctionPath Specifies the location in the storage virtual machine&#39;s namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
         * 
         * @return builder
         * 
         */
        public Builder junctionPath(Output<String> junctionPath) {
            $.junctionPath = junctionPath;
            return this;
        }

        /**
         * @param junctionPath Specifies the location in the storage virtual machine&#39;s namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
         * 
         * @return builder
         * 
         */
        public Builder junctionPath(String junctionPath) {
            return junctionPath(Output.of(junctionPath));
        }

        /**
         * @param name Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param securityStyle Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
         * 
         * @return builder
         * 
         */
        public Builder securityStyle(@Nullable Output<String> securityStyle) {
            $.securityStyle = securityStyle;
            return this;
        }

        /**
         * @param securityStyle Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
         * 
         * @return builder
         * 
         */
        public Builder securityStyle(String securityStyle) {
            return securityStyle(Output.of(securityStyle));
        }

        /**
         * @param sizeInMegabytes Specifies the size of the volume, in megabytes (MB), that you are creating.
         * 
         * @return builder
         * 
         */
        public Builder sizeInMegabytes(Output<Integer> sizeInMegabytes) {
            $.sizeInMegabytes = sizeInMegabytes;
            return this;
        }

        /**
         * @param sizeInMegabytes Specifies the size of the volume, in megabytes (MB), that you are creating.
         * 
         * @return builder
         * 
         */
        public Builder sizeInMegabytes(Integer sizeInMegabytes) {
            return sizeInMegabytes(Output.of(sizeInMegabytes));
        }

        /**
         * @param storageEfficiencyEnabled Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
         * 
         * @return builder
         * 
         */
        public Builder storageEfficiencyEnabled(Output<Boolean> storageEfficiencyEnabled) {
            $.storageEfficiencyEnabled = storageEfficiencyEnabled;
            return this;
        }

        /**
         * @param storageEfficiencyEnabled Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
         * 
         * @return builder
         * 
         */
        public Builder storageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
            return storageEfficiencyEnabled(Output.of(storageEfficiencyEnabled));
        }

        /**
         * @param storageVirtualMachineId Specifies the storage virtual machine in which to create the volume.
         * 
         * @return builder
         * 
         */
        public Builder storageVirtualMachineId(Output<String> storageVirtualMachineId) {
            $.storageVirtualMachineId = storageVirtualMachineId;
            return this;
        }

        /**
         * @param storageVirtualMachineId Specifies the storage virtual machine in which to create the volume.
         * 
         * @return builder
         * 
         */
        public Builder storageVirtualMachineId(String storageVirtualMachineId) {
            return storageVirtualMachineId(Output.of(storageVirtualMachineId));
        }

        /**
         * @param tags A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tieringPolicy(@Nullable Output<OntapVolumeTieringPolicyArgs> tieringPolicy) {
            $.tieringPolicy = tieringPolicy;
            return this;
        }

        public Builder tieringPolicy(OntapVolumeTieringPolicyArgs tieringPolicy) {
            return tieringPolicy(Output.of(tieringPolicy));
        }

        /**
         * @param volumeType The type of volume, currently the only valid value is `ONTAP`.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType The type of volume, currently the only valid value is `ONTAP`.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public OntapVolumeArgs build() {
            $.junctionPath = Objects.requireNonNull($.junctionPath, "expected parameter 'junctionPath' to be non-null");
            $.sizeInMegabytes = Objects.requireNonNull($.sizeInMegabytes, "expected parameter 'sizeInMegabytes' to be non-null");
            $.storageEfficiencyEnabled = Objects.requireNonNull($.storageEfficiencyEnabled, "expected parameter 'storageEfficiencyEnabled' to be non-null");
            $.storageVirtualMachineId = Objects.requireNonNull($.storageVirtualMachineId, "expected parameter 'storageVirtualMachineId' to be non-null");
            return $;
        }
    }

}
