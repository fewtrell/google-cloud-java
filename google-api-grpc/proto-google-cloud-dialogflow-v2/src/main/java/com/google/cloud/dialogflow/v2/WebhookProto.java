// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/webhook.proto

package com.google.cloud.dialogflow.v2;

public final class WebhookProto {
  private WebhookProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_WebhookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_WebhookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/webhook.pro" +
      "to\022\032google.cloud.dialogflow.v2\032\034google/a" +
      "pi/annotations.proto\032(google/cloud/dialo" +
      "gflow/v2/context.proto\032\'google/cloud/dia" +
      "logflow/v2/intent.proto\032(google/cloud/di" +
      "alogflow/v2/session.proto\032\034google/protob" +
      "uf/struct.proto\"\326\001\n\016WebhookRequest\022\017\n\007se" +
      "ssion\030\004 \001(\t\022\023\n\013response_id\030\001 \001(\t\022=\n\014quer" +
      "y_result\030\002 \001(\0132\'.google.cloud.dialogflow" +
      ".v2.QueryResult\022_\n\036original_detect_inten",
      "t_request\030\003 \001(\01327.google.cloud.dialogflo" +
      "w.v2.OriginalDetectIntentRequest\"\263\002\n\017Web" +
      "hookResponse\022\030\n\020fulfillment_text\030\001 \001(\t\022H" +
      "\n\024fulfillment_messages\030\002 \003(\0132*.google.cl" +
      "oud.dialogflow.v2.Intent.Message\022\016\n\006sour" +
      "ce\030\003 \001(\t\022(\n\007payload\030\004 \001(\0132\027.google.proto" +
      "buf.Struct\022<\n\017output_contexts\030\005 \003(\0132#.go" +
      "ogle.cloud.dialogflow.v2.Context\022D\n\024foll" +
      "owup_event_input\030\006 \001(\0132&.google.cloud.di" +
      "alogflow.v2.EventInput\"W\n\033OriginalDetect",
      "IntentRequest\022\016\n\006source\030\001 \001(\t\022(\n\007payload" +
      "\030\003 \001(\0132\027.google.protobuf.StructB\233\001\n\036com." +
      "google.cloud.dialogflow.v2B\014WebhookProto" +
      "P\001ZDgoogle.golang.org/genproto/googleapi" +
      "s/cloud/dialogflow/v2;dialogflow\370\001\001\242\002\002DF" +
      "\252\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.SessionProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dialogflow_v2_WebhookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_WebhookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_WebhookRequest_descriptor,
        new java.lang.String[] { "Session", "ResponseId", "QueryResult", "OriginalDetectIntentRequest", });
    internal_static_google_cloud_dialogflow_v2_WebhookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_WebhookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_WebhookResponse_descriptor,
        new java.lang.String[] { "FulfillmentText", "FulfillmentMessages", "Source", "Payload", "OutputContexts", "FollowupEventInput", });
    internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_descriptor,
        new java.lang.String[] { "Source", "Payload", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
