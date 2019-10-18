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
// source: google/cloud/websecurityscanner/v1alpha/scan_config.proto

package com.google.cloud.websecurityscanner.v1alpha;

public interface ScanConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.ScanConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are
   * generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are
   * generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The user provided display name of the ScanConfig.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The user provided display name of the ScanConfig.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The maximum QPS during scanning. A valid value ranges from 5 to 20
   * inclusively. If the field is unspecified or its value is set 0, server will
   * default to 15. Other values outside of [5, 20] range will be rejected with
   * INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>int32 max_qps = 3;</code>
   */
  int getMaxQps();

  /**
   *
   *
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<java.lang.String> getStartingUrlsList();
  /**
   *
   *
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getStartingUrlsCount();
  /**
   *
   *
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getStartingUrls(int index);
  /**
   *
   *
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getStartingUrlsBytes(int index);

  /**
   *
   *
   * <pre>
   * The authentication configuration. If specified, service will use the
   * authentication configuration during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication authentication = 5;
   * </code>
   */
  boolean hasAuthentication();
  /**
   *
   *
   * <pre>
   * The authentication configuration. If specified, service will use the
   * authentication configuration during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication authentication = 5;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication getAuthentication();
  /**
   *
   *
   * <pre>
   * The authentication configuration. If specified, service will use the
   * authentication configuration during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication authentication = 5;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.AuthenticationOrBuilder
      getAuthenticationOrBuilder();

  /**
   *
   *
   * <pre>
   * The user agent used during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.UserAgent user_agent = 6;</code>
   */
  int getUserAgentValue();
  /**
   *
   *
   * <pre>
   * The user agent used during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.UserAgent user_agent = 6;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.UserAgent getUserAgent();

  /**
   *
   *
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   */
  java.util.List<java.lang.String> getBlacklistPatternsList();
  /**
   *
   *
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   */
  int getBlacklistPatternsCount();
  /**
   *
   *
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   */
  java.lang.String getBlacklistPatterns(int index);
  /**
   *
   *
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   */
  com.google.protobuf.ByteString getBlacklistPatternsBytes(int index);

  /**
   *
   *
   * <pre>
   * The schedule of the ScanConfig.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule schedule = 8;</code>
   */
  boolean hasSchedule();
  /**
   *
   *
   * <pre>
   * The schedule of the ScanConfig.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule schedule = 8;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule getSchedule();
  /**
   *
   *
   * <pre>
   * The schedule of the ScanConfig.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule schedule = 8;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.ScheduleOrBuilder getScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;
   * </code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform>
      getTargetPlatformsList();
  /**
   *
   *
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;
   * </code>
   */
  int getTargetPlatformsCount();
  /**
   *
   *
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform getTargetPlatforms(
      int index);
  /**
   *
   *
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;
   * </code>
   */
  java.util.List<java.lang.Integer> getTargetPlatformsValueList();
  /**
   *
   *
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;
   * </code>
   */
  int getTargetPlatformsValue(int index);

  /**
   *
   *
   * <pre>
   * Latest ScanRun if available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun latest_run = 11;</code>
   */
  boolean hasLatestRun();
  /**
   *
   *
   * <pre>
   * Latest ScanRun if available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun latest_run = 11;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanRun getLatestRun();
  /**
   *
   *
   * <pre>
   * Latest ScanRun if available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun latest_run = 11;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanRunOrBuilder getLatestRunOrBuilder();
}
