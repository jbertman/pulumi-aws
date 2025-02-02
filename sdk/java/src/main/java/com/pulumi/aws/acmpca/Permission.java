// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.acmpca.PermissionArgs;
import com.pulumi.aws.acmpca.inputs.PermissionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an AWS Certificate Manager Private Certificate Authorities Permission.
 * Currently, this is only required in order to allow the ACM service to automatically renew certificates issued by a PCA.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acmpca.CertificateAuthority;
 * import com.pulumi.aws.acmpca.CertificateAuthorityArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs;
 * import com.pulumi.aws.acmpca.Permission;
 * import com.pulumi.aws.acmpca.PermissionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleCertificateAuthority = new CertificateAuthority(&#34;exampleCertificateAuthority&#34;, CertificateAuthorityArgs.builder()        
 *             .certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfigurationArgs.builder()
 *                 .keyAlgorithm(&#34;RSA_4096&#34;)
 *                 .signingAlgorithm(&#34;SHA512WITHRSA&#34;)
 *                 .subject(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.builder()
 *                     .commonName(&#34;example.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var examplePermission = new Permission(&#34;examplePermission&#34;, PermissionArgs.builder()        
 *             .certificateAuthorityArn(exampleCertificateAuthority.arn())
 *             .actions(            
 *                 &#34;IssueCertificate&#34;,
 *                 &#34;GetCertificate&#34;,
 *                 &#34;ListPermissions&#34;)
 *             .principal(&#34;acm.amazonaws.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:acmpca/permission:Permission")
public class Permission extends com.pulumi.resources.CustomResource {
    /**
     * Actions that the specified AWS service principal can use. These include `IssueCertificate`, `GetCertificate`, and `ListPermissions`. Note that in order for ACM to automatically rotate certificates issued by a PCA, it must be granted permission on all 3 actions, as per the example above.
     * 
     */
    @Export(name="actions", type=List.class, parameters={String.class})
    private Output<List<String>> actions;

    /**
     * @return Actions that the specified AWS service principal can use. These include `IssueCertificate`, `GetCertificate`, and `ListPermissions`. Note that in order for ACM to automatically rotate certificates issued by a PCA, it must be granted permission on all 3 actions, as per the example above.
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }
    /**
     * ARN of the CA that grants the permissions.
     * 
     */
    @Export(name="certificateAuthorityArn", type=String.class, parameters={})
    private Output<String> certificateAuthorityArn;

    /**
     * @return ARN of the CA that grants the permissions.
     * 
     */
    public Output<String> certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * IAM policy that is associated with the permission.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return IAM policy that is associated with the permission.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * AWS service or identity that receives the permission. At this time, the only valid principal is `acm.amazonaws.com`.
     * 
     */
    @Export(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return AWS service or identity that receives the permission. At this time, the only valid principal is `acm.amazonaws.com`.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * ID of the calling account
     * 
     */
    @Export(name="sourceAccount", type=String.class, parameters={})
    private Output<String> sourceAccount;

    /**
     * @return ID of the calling account
     * 
     */
    public Output<String> sourceAccount() {
        return this.sourceAccount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Permission(String name) {
        this(name, PermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Permission(String name, PermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Permission(String name, PermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/permission:Permission", name, args == null ? PermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Permission(String name, Output<String> id, @Nullable PermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/permission:Permission", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Permission get(String name, Output<String> id, @Nullable PermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Permission(name, id, state, options);
    }
}
