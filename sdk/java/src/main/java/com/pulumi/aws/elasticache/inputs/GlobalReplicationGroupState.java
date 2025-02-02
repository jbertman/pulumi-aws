// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.inputs;

import com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupGlobalNodeGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupState Empty = new GlobalReplicationGroupState();

    /**
     * The ARN of the ElastiCache Global Replication Group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the ElastiCache Global Replication Group.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    @Import(name="atRestEncryptionEnabled")
    private @Nullable Output<Boolean> atRestEncryptionEnabled;

    /**
     * @return A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    public Optional<Output<Boolean>> atRestEncryptionEnabled() {
        return Optional.ofNullable(this.atRestEncryptionEnabled);
    }

    /**
     * A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    @Import(name="authTokenEnabled")
    private @Nullable Output<Boolean> authTokenEnabled;

    /**
     * @return A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    public Optional<Output<Boolean>> authTokenEnabled() {
        return Optional.ofNullable(this.authTokenEnabled);
    }

    /**
     * Specifies whether read-only replicas will be automatically promoted to read/write primary if the existing primary fails.
     * When creating, by default the Global Replication Group inherits the automatic failover setting of the primary replication group.
     * 
     */
    @Import(name="automaticFailoverEnabled")
    private @Nullable Output<Boolean> automaticFailoverEnabled;

    /**
     * @return Specifies whether read-only replicas will be automatically promoted to read/write primary if the existing primary fails.
     * When creating, by default the Global Replication Group inherits the automatic failover setting of the primary replication group.
     * 
     */
    public Optional<Output<Boolean>> automaticFailoverEnabled() {
        return Optional.ofNullable(this.automaticFailoverEnabled);
    }

    /**
     * The instance class used.
     * See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html)
     * and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * When creating, by default the Global Replication Group inherits the node type of the primary replication group.
     * 
     */
    @Import(name="cacheNodeType")
    private @Nullable Output<String> cacheNodeType;

    /**
     * @return The instance class used.
     * See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html)
     * and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * When creating, by default the Global Replication Group inherits the node type of the primary replication group.
     * 
     */
    public Optional<Output<String>> cacheNodeType() {
        return Optional.ofNullable(this.cacheNodeType);
    }

    /**
     * Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    @Import(name="clusterEnabled")
    private @Nullable Output<Boolean> clusterEnabled;

    /**
     * @return Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    public Optional<Output<Boolean>> clusterEnabled() {
        return Optional.ofNullable(this.clusterEnabled);
    }

    /**
     * The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Redis version to use for the Global Replication Group.
     * When creating, by default the Global Replication Group inherits the version of the primary replication group.
     * If a version is specified, the Global Replication Group and all member replication groups will be upgraded to this version.
     * Cannot be downgraded without replacing the Global Replication Group and all member replication groups.
     * If the version is 6 or higher, the major and minor version can be set, e.g., `6.2`,
     * or the minor version can be unspecified which will use the latest version at creation time, e.g., `6.x`.
     * The actual engine version used is returned in the attribute `engine_version_actual`, see Attributes Reference below.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Redis version to use for the Global Replication Group.
     * When creating, by default the Global Replication Group inherits the version of the primary replication group.
     * If a version is specified, the Global Replication Group and all member replication groups will be upgraded to this version.
     * Cannot be downgraded without replacing the Global Replication Group and all member replication groups.
     * If the version is 6 or higher, the major and minor version can be set, e.g., `6.2`,
     * or the minor version can be unspecified which will use the latest version at creation time, e.g., `6.x`.
     * The actual engine version used is returned in the attribute `engine_version_actual`, see Attributes Reference below.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    @Import(name="engineVersionActual")
    private @Nullable Output<String> engineVersionActual;

    /**
     * @return The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    public Optional<Output<String>> engineVersionActual() {
        return Optional.ofNullable(this.engineVersionActual);
    }

    /**
     * Set of node groups (shards) on the global replication group.
     * Has the values:
     * 
     */
    @Import(name="globalNodeGroups")
    private @Nullable Output<List<GlobalReplicationGroupGlobalNodeGroupArgs>> globalNodeGroups;

    /**
     * @return Set of node groups (shards) on the global replication group.
     * Has the values:
     * 
     */
    public Optional<Output<List<GlobalReplicationGroupGlobalNodeGroupArgs>>> globalNodeGroups() {
        return Optional.ofNullable(this.globalNodeGroups);
    }

    /**
     * A user-created description for the global replication group.
     * 
     */
    @Import(name="globalReplicationGroupDescription")
    private @Nullable Output<String> globalReplicationGroupDescription;

    /**
     * @return A user-created description for the global replication group.
     * 
     */
    public Optional<Output<String>> globalReplicationGroupDescription() {
        return Optional.ofNullable(this.globalReplicationGroupDescription);
    }

    /**
     * The full ID of the global replication group.
     * 
     */
    @Import(name="globalReplicationGroupId")
    private @Nullable Output<String> globalReplicationGroupId;

    /**
     * @return The full ID of the global replication group.
     * 
     */
    public Optional<Output<String>> globalReplicationGroupId() {
        return Optional.ofNullable(this.globalReplicationGroupId);
    }

    /**
     * The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    @Import(name="globalReplicationGroupIdSuffix")
    private @Nullable Output<String> globalReplicationGroupIdSuffix;

    /**
     * @return The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    public Optional<Output<String>> globalReplicationGroupIdSuffix() {
        return Optional.ofNullable(this.globalReplicationGroupIdSuffix);
    }

    /**
     * The number of node groups (shards) on the global replication group.
     * 
     */
    @Import(name="numNodeGroups")
    private @Nullable Output<Integer> numNodeGroups;

    /**
     * @return The number of node groups (shards) on the global replication group.
     * 
     */
    public Optional<Output<Integer>> numNodeGroups() {
        return Optional.ofNullable(this.numNodeGroups);
    }

    /**
     * An ElastiCache Parameter Group to use for the Global Replication Group.
     * Required when upgrading a major engine version, but will be ignored if left configured after the upgrade is complete.
     * Specifying without a major version upgrade will fail.
     * Note that ElastiCache creates a copy of this parameter group for each member replication group.
     * 
     */
    @Import(name="parameterGroupName")
    private @Nullable Output<String> parameterGroupName;

    /**
     * @return An ElastiCache Parameter Group to use for the Global Replication Group.
     * Required when upgrading a major engine version, but will be ignored if left configured after the upgrade is complete.
     * Specifying without a major version upgrade will fail.
     * Note that ElastiCache creates a copy of this parameter group for each member replication group.
     * 
     */
    public Optional<Output<String>> parameterGroupName() {
        return Optional.ofNullable(this.parameterGroupName);
    }

    /**
     * The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    @Import(name="primaryReplicationGroupId")
    private @Nullable Output<String> primaryReplicationGroupId;

    /**
     * @return The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    public Optional<Output<String>> primaryReplicationGroupId() {
        return Optional.ofNullable(this.primaryReplicationGroupId);
    }

    /**
     * A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    @Import(name="transitEncryptionEnabled")
    private @Nullable Output<Boolean> transitEncryptionEnabled;

    /**
     * @return A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    public Optional<Output<Boolean>> transitEncryptionEnabled() {
        return Optional.ofNullable(this.transitEncryptionEnabled);
    }

    private GlobalReplicationGroupState() {}

    private GlobalReplicationGroupState(GlobalReplicationGroupState $) {
        this.arn = $.arn;
        this.atRestEncryptionEnabled = $.atRestEncryptionEnabled;
        this.authTokenEnabled = $.authTokenEnabled;
        this.automaticFailoverEnabled = $.automaticFailoverEnabled;
        this.cacheNodeType = $.cacheNodeType;
        this.clusterEnabled = $.clusterEnabled;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.engineVersionActual = $.engineVersionActual;
        this.globalNodeGroups = $.globalNodeGroups;
        this.globalReplicationGroupDescription = $.globalReplicationGroupDescription;
        this.globalReplicationGroupId = $.globalReplicationGroupId;
        this.globalReplicationGroupIdSuffix = $.globalReplicationGroupIdSuffix;
        this.numNodeGroups = $.numNodeGroups;
        this.parameterGroupName = $.parameterGroupName;
        this.primaryReplicationGroupId = $.primaryReplicationGroupId;
        this.transitEncryptionEnabled = $.transitEncryptionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalReplicationGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalReplicationGroupState $;

        public Builder() {
            $ = new GlobalReplicationGroupState();
        }

        public Builder(GlobalReplicationGroupState defaults) {
            $ = new GlobalReplicationGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the ElastiCache Global Replication Group.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the ElastiCache Global Replication Group.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param atRestEncryptionEnabled A flag that indicate whether the encryption at rest is enabled.
         * 
         * @return builder
         * 
         */
        public Builder atRestEncryptionEnabled(@Nullable Output<Boolean> atRestEncryptionEnabled) {
            $.atRestEncryptionEnabled = atRestEncryptionEnabled;
            return this;
        }

        /**
         * @param atRestEncryptionEnabled A flag that indicate whether the encryption at rest is enabled.
         * 
         * @return builder
         * 
         */
        public Builder atRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
            return atRestEncryptionEnabled(Output.of(atRestEncryptionEnabled));
        }

        /**
         * @param authTokenEnabled A flag that indicate whether AuthToken (password) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder authTokenEnabled(@Nullable Output<Boolean> authTokenEnabled) {
            $.authTokenEnabled = authTokenEnabled;
            return this;
        }

        /**
         * @param authTokenEnabled A flag that indicate whether AuthToken (password) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder authTokenEnabled(Boolean authTokenEnabled) {
            return authTokenEnabled(Output.of(authTokenEnabled));
        }

        /**
         * @param automaticFailoverEnabled Specifies whether read-only replicas will be automatically promoted to read/write primary if the existing primary fails.
         * When creating, by default the Global Replication Group inherits the automatic failover setting of the primary replication group.
         * 
         * @return builder
         * 
         */
        public Builder automaticFailoverEnabled(@Nullable Output<Boolean> automaticFailoverEnabled) {
            $.automaticFailoverEnabled = automaticFailoverEnabled;
            return this;
        }

        /**
         * @param automaticFailoverEnabled Specifies whether read-only replicas will be automatically promoted to read/write primary if the existing primary fails.
         * When creating, by default the Global Replication Group inherits the automatic failover setting of the primary replication group.
         * 
         * @return builder
         * 
         */
        public Builder automaticFailoverEnabled(Boolean automaticFailoverEnabled) {
            return automaticFailoverEnabled(Output.of(automaticFailoverEnabled));
        }

        /**
         * @param cacheNodeType The instance class used.
         * See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html)
         * and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
         * When creating, by default the Global Replication Group inherits the node type of the primary replication group.
         * 
         * @return builder
         * 
         */
        public Builder cacheNodeType(@Nullable Output<String> cacheNodeType) {
            $.cacheNodeType = cacheNodeType;
            return this;
        }

        /**
         * @param cacheNodeType The instance class used.
         * See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html)
         * and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
         * When creating, by default the Global Replication Group inherits the node type of the primary replication group.
         * 
         * @return builder
         * 
         */
        public Builder cacheNodeType(String cacheNodeType) {
            return cacheNodeType(Output.of(cacheNodeType));
        }

        /**
         * @param clusterEnabled Indicates whether the Global Datastore is cluster enabled.
         * 
         * @return builder
         * 
         */
        public Builder clusterEnabled(@Nullable Output<Boolean> clusterEnabled) {
            $.clusterEnabled = clusterEnabled;
            return this;
        }

        /**
         * @param clusterEnabled Indicates whether the Global Datastore is cluster enabled.
         * 
         * @return builder
         * 
         */
        public Builder clusterEnabled(Boolean clusterEnabled) {
            return clusterEnabled(Output.of(clusterEnabled));
        }

        /**
         * @param engine The name of the cache engine to be used for the clusters in this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The name of the cache engine to be used for the clusters in this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion Redis version to use for the Global Replication Group.
         * When creating, by default the Global Replication Group inherits the version of the primary replication group.
         * If a version is specified, the Global Replication Group and all member replication groups will be upgraded to this version.
         * Cannot be downgraded without replacing the Global Replication Group and all member replication groups.
         * If the version is 6 or higher, the major and minor version can be set, e.g., `6.2`,
         * or the minor version can be unspecified which will use the latest version at creation time, e.g., `6.x`.
         * The actual engine version used is returned in the attribute `engine_version_actual`, see Attributes Reference below.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Redis version to use for the Global Replication Group.
         * When creating, by default the Global Replication Group inherits the version of the primary replication group.
         * If a version is specified, the Global Replication Group and all member replication groups will be upgraded to this version.
         * Cannot be downgraded without replacing the Global Replication Group and all member replication groups.
         * If the version is 6 or higher, the major and minor version can be set, e.g., `6.2`,
         * or the minor version can be unspecified which will use the latest version at creation time, e.g., `6.x`.
         * The actual engine version used is returned in the attribute `engine_version_actual`, see Attributes Reference below.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param engineVersionActual The full version number of the cache engine running on the members of this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engineVersionActual(@Nullable Output<String> engineVersionActual) {
            $.engineVersionActual = engineVersionActual;
            return this;
        }

        /**
         * @param engineVersionActual The full version number of the cache engine running on the members of this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engineVersionActual(String engineVersionActual) {
            return engineVersionActual(Output.of(engineVersionActual));
        }

        /**
         * @param globalNodeGroups Set of node groups (shards) on the global replication group.
         * Has the values:
         * 
         * @return builder
         * 
         */
        public Builder globalNodeGroups(@Nullable Output<List<GlobalReplicationGroupGlobalNodeGroupArgs>> globalNodeGroups) {
            $.globalNodeGroups = globalNodeGroups;
            return this;
        }

        /**
         * @param globalNodeGroups Set of node groups (shards) on the global replication group.
         * Has the values:
         * 
         * @return builder
         * 
         */
        public Builder globalNodeGroups(List<GlobalReplicationGroupGlobalNodeGroupArgs> globalNodeGroups) {
            return globalNodeGroups(Output.of(globalNodeGroups));
        }

        /**
         * @param globalNodeGroups Set of node groups (shards) on the global replication group.
         * Has the values:
         * 
         * @return builder
         * 
         */
        public Builder globalNodeGroups(GlobalReplicationGroupGlobalNodeGroupArgs... globalNodeGroups) {
            return globalNodeGroups(List.of(globalNodeGroups));
        }

        /**
         * @param globalReplicationGroupDescription A user-created description for the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupDescription(@Nullable Output<String> globalReplicationGroupDescription) {
            $.globalReplicationGroupDescription = globalReplicationGroupDescription;
            return this;
        }

        /**
         * @param globalReplicationGroupDescription A user-created description for the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupDescription(String globalReplicationGroupDescription) {
            return globalReplicationGroupDescription(Output.of(globalReplicationGroupDescription));
        }

        /**
         * @param globalReplicationGroupId The full ID of the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupId(@Nullable Output<String> globalReplicationGroupId) {
            $.globalReplicationGroupId = globalReplicationGroupId;
            return this;
        }

        /**
         * @param globalReplicationGroupId The full ID of the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupId(String globalReplicationGroupId) {
            return globalReplicationGroupId(Output.of(globalReplicationGroupId));
        }

        /**
         * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupIdSuffix(@Nullable Output<String> globalReplicationGroupIdSuffix) {
            $.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
            return this;
        }

        /**
         * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupIdSuffix(String globalReplicationGroupIdSuffix) {
            return globalReplicationGroupIdSuffix(Output.of(globalReplicationGroupIdSuffix));
        }

        /**
         * @param numNodeGroups The number of node groups (shards) on the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder numNodeGroups(@Nullable Output<Integer> numNodeGroups) {
            $.numNodeGroups = numNodeGroups;
            return this;
        }

        /**
         * @param numNodeGroups The number of node groups (shards) on the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder numNodeGroups(Integer numNodeGroups) {
            return numNodeGroups(Output.of(numNodeGroups));
        }

        /**
         * @param parameterGroupName An ElastiCache Parameter Group to use for the Global Replication Group.
         * Required when upgrading a major engine version, but will be ignored if left configured after the upgrade is complete.
         * Specifying without a major version upgrade will fail.
         * Note that ElastiCache creates a copy of this parameter group for each member replication group.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            $.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * @param parameterGroupName An ElastiCache Parameter Group to use for the Global Replication Group.
         * Required when upgrading a major engine version, but will be ignored if left configured after the upgrade is complete.
         * Specifying without a major version upgrade will fail.
         * Note that ElastiCache creates a copy of this parameter group for each member replication group.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(String parameterGroupName) {
            return parameterGroupName(Output.of(parameterGroupName));
        }

        /**
         * @param primaryReplicationGroupId The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder primaryReplicationGroupId(@Nullable Output<String> primaryReplicationGroupId) {
            $.primaryReplicationGroupId = primaryReplicationGroupId;
            return this;
        }

        /**
         * @param primaryReplicationGroupId The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder primaryReplicationGroupId(String primaryReplicationGroupId) {
            return primaryReplicationGroupId(Output.of(primaryReplicationGroupId));
        }

        /**
         * @param transitEncryptionEnabled A flag that indicates whether the encryption in transit is enabled.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionEnabled(@Nullable Output<Boolean> transitEncryptionEnabled) {
            $.transitEncryptionEnabled = transitEncryptionEnabled;
            return this;
        }

        /**
         * @param transitEncryptionEnabled A flag that indicates whether the encryption in transit is enabled.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionEnabled(Boolean transitEncryptionEnabled) {
            return transitEncryptionEnabled(Output.of(transitEncryptionEnabled));
        }

        public GlobalReplicationGroupState build() {
            return $;
        }
    }

}
