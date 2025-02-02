// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StackUserSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackUserSettingArgs Empty = new StackUserSettingArgs();

    /**
     * Action that is enabled or disabled.
     * Valid values are `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, or `DOMAIN_SMART_CARD_SIGNIN`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Action that is enabled or disabled.
     * Valid values are `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, or `DOMAIN_SMART_CARD_SIGNIN`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Whether the action is enabled or disabled.
     * Valid values are `ENABLED` or `DISABLED`.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return Whether the action is enabled or disabled.
     * Valid values are `ENABLED` or `DISABLED`.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    private StackUserSettingArgs() {}

    private StackUserSettingArgs(StackUserSettingArgs $) {
        this.action = $.action;
        this.permission = $.permission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackUserSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackUserSettingArgs $;

        public Builder() {
            $ = new StackUserSettingArgs();
        }

        public Builder(StackUserSettingArgs defaults) {
            $ = new StackUserSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action that is enabled or disabled.
         * Valid values are `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, or `DOMAIN_SMART_CARD_SIGNIN`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action that is enabled or disabled.
         * Valid values are `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, or `DOMAIN_SMART_CARD_SIGNIN`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param permission Whether the action is enabled or disabled.
         * Valid values are `ENABLED` or `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission Whether the action is enabled or disabled.
         * Valid values are `ENABLED` or `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public StackUserSettingArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.permission = Objects.requireNonNull($.permission, "expected parameter 'permission' to be non-null");
            return $;
        }
    }

}
