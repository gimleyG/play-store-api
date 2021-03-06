// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

public interface TypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Type)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The fully qualified message name.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The fully qualified message name.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  java.util.List<com.google.protobuf.Field> 
      getFieldsList();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  com.google.protobuf.Field getFields(int index);
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  int getFieldsCount();

  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  java.util.List<String>
      getOneofsList();
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  int getOneofsCount();
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  java.lang.String getOneofs(int index);
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  com.google.protobuf.ByteString
      getOneofsBytes(int index);

  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  java.util.List<com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  int getOptionsCount();

  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>optional .google.protobuf.SourceContext source_context = 5;</code>
   */
  boolean hasSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>optional .google.protobuf.SourceContext source_context = 5;</code>
   */
  com.google.protobuf.SourceContext getSourceContext();

  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>optional .google.protobuf.Syntax syntax = 6;</code>
   */
  int getSyntaxValue();
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>optional .google.protobuf.Syntax syntax = 6;</code>
   */
  com.google.protobuf.Syntax getSyntax();
}
