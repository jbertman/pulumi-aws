// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImage;
import com.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileUserSettingsKernelGatewayAppSettings {
    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    private @Nullable List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImage> customImages;
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    private UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec defaultResourceSpec;
    /**
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    private @Nullable List<String> lifecycleConfigArns;

    private UserProfileUserSettingsKernelGatewayAppSettings() {}
    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    public List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImage> customImages() {
        return this.customImages == null ? List.of() : this.customImages;
    }
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    public UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec defaultResourceSpec() {
        return this.defaultResourceSpec;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    public List<String> lifecycleConfigArns() {
        return this.lifecycleConfigArns == null ? List.of() : this.lifecycleConfigArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImage> customImages;
        private UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec defaultResourceSpec;
        private @Nullable List<String> lifecycleConfigArns;
        public Builder() {}
        public Builder(UserProfileUserSettingsKernelGatewayAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        @CustomType.Setter
        public Builder customImages(@Nullable List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImage> customImages) {
            this.customImages = customImages;
            return this;
        }
        public Builder customImages(UserProfileUserSettingsKernelGatewayAppSettingsCustomImage... customImages) {
            return customImages(List.of(customImages));
        }
        @CustomType.Setter
        public Builder defaultResourceSpec(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }
        @CustomType.Setter
        public Builder lifecycleConfigArns(@Nullable List<String> lifecycleConfigArns) {
            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }
        public Builder lifecycleConfigArns(String... lifecycleConfigArns) {
            return lifecycleConfigArns(List.of(lifecycleConfigArns));
        }
        public UserProfileUserSettingsKernelGatewayAppSettings build() {
            final var o = new UserProfileUserSettingsKernelGatewayAppSettings();
            o.customImages = customImages;
            o.defaultResourceSpec = defaultResourceSpec;
            o.lifecycleConfigArns = lifecycleConfigArns;
            return o;
        }
    }
}
