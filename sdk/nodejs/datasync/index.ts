// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AgentArgs, AgentState } from "./agent";
export type Agent = import("./agent").Agent;
export const Agent: typeof import("./agent").Agent = null as any;

export { EfsLocationArgs, EfsLocationState } from "./efsLocation";
export type EfsLocation = import("./efsLocation").EfsLocation;
export const EfsLocation: typeof import("./efsLocation").EfsLocation = null as any;

export { FsxOpenZfsFileSystemArgs, FsxOpenZfsFileSystemState } from "./fsxOpenZfsFileSystem";
export type FsxOpenZfsFileSystem = import("./fsxOpenZfsFileSystem").FsxOpenZfsFileSystem;
export const FsxOpenZfsFileSystem: typeof import("./fsxOpenZfsFileSystem").FsxOpenZfsFileSystem = null as any;

export { LocationFsxLustreArgs, LocationFsxLustreState } from "./locationFsxLustre";
export type LocationFsxLustre = import("./locationFsxLustre").LocationFsxLustre;
export const LocationFsxLustre: typeof import("./locationFsxLustre").LocationFsxLustre = null as any;

export { LocationFsxWindowsArgs, LocationFsxWindowsState } from "./locationFsxWindows";
export type LocationFsxWindows = import("./locationFsxWindows").LocationFsxWindows;
export const LocationFsxWindows: typeof import("./locationFsxWindows").LocationFsxWindows = null as any;

export { LocationHdfsArgs, LocationHdfsState } from "./locationHdfs";
export type LocationHdfs = import("./locationHdfs").LocationHdfs;
export const LocationHdfs: typeof import("./locationHdfs").LocationHdfs = null as any;

export { LocationSmbArgs, LocationSmbState } from "./locationSmb";
export type LocationSmb = import("./locationSmb").LocationSmb;
export const LocationSmb: typeof import("./locationSmb").LocationSmb = null as any;

export { NfsLocationArgs, NfsLocationState } from "./nfsLocation";
export type NfsLocation = import("./nfsLocation").NfsLocation;
export const NfsLocation: typeof import("./nfsLocation").NfsLocation = null as any;

export { S3LocationArgs, S3LocationState } from "./s3location";
export type S3Location = import("./s3location").S3Location;
export const S3Location: typeof import("./s3location").S3Location = null as any;

export { TaskArgs, TaskState } from "./task";
export type Task = import("./task").Task;
export const Task: typeof import("./task").Task = null as any;

utilities.lazyLoad(exports, ["Agent"], () => require("./agent"));
utilities.lazyLoad(exports, ["EfsLocation"], () => require("./efsLocation"));
utilities.lazyLoad(exports, ["FsxOpenZfsFileSystem"], () => require("./fsxOpenZfsFileSystem"));
utilities.lazyLoad(exports, ["LocationFsxLustre"], () => require("./locationFsxLustre"));
utilities.lazyLoad(exports, ["LocationFsxWindows"], () => require("./locationFsxWindows"));
utilities.lazyLoad(exports, ["LocationHdfs"], () => require("./locationHdfs"));
utilities.lazyLoad(exports, ["LocationSmb"], () => require("./locationSmb"));
utilities.lazyLoad(exports, ["NfsLocation"], () => require("./nfsLocation"));
utilities.lazyLoad(exports, ["S3Location"], () => require("./s3location"));
utilities.lazyLoad(exports, ["Task"], () => require("./task"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:datasync/agent:Agent":
                return new Agent(name, <any>undefined, { urn })
            case "aws:datasync/efsLocation:EfsLocation":
                return new EfsLocation(name, <any>undefined, { urn })
            case "aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem":
                return new FsxOpenZfsFileSystem(name, <any>undefined, { urn })
            case "aws:datasync/locationFsxLustre:LocationFsxLustre":
                return new LocationFsxLustre(name, <any>undefined, { urn })
            case "aws:datasync/locationFsxWindows:LocationFsxWindows":
                return new LocationFsxWindows(name, <any>undefined, { urn })
            case "aws:datasync/locationHdfs:LocationHdfs":
                return new LocationHdfs(name, <any>undefined, { urn })
            case "aws:datasync/locationSmb:LocationSmb":
                return new LocationSmb(name, <any>undefined, { urn })
            case "aws:datasync/nfsLocation:NfsLocation":
                return new NfsLocation(name, <any>undefined, { urn })
            case "aws:datasync/s3Location:S3Location":
                return new S3Location(name, <any>undefined, { urn })
            case "aws:datasync/task:Task":
                return new Task(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "datasync/agent", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/efsLocation", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/fsxOpenZfsFileSystem", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/locationFsxLustre", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/locationFsxWindows", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/locationHdfs", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/locationSmb", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/nfsLocation", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/s3Location", _module)
pulumi.runtime.registerResourceModule("aws", "datasync/task", _module)
