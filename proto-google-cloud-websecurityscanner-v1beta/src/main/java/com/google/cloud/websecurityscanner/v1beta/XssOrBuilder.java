/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface XssOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.Xss)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   */
  java.util.List<java.lang.String> getStackTracesList();
  /**
   *
   *
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   */
  int getStackTracesCount();
  /**
   *
   *
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   */
  java.lang.String getStackTraces(int index);
  /**
   *
   *
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   */
  com.google.protobuf.ByteString getStackTracesBytes(int index);

  /**
   *
   *
   * <pre>
   * An error message generated by a javascript breakage.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   */
  java.lang.String getErrorMessage();
  /**
   *
   *
   * <pre>
   * An error message generated by a javascript breakage.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   */
  com.google.protobuf.ByteString getErrorMessageBytes();
}
