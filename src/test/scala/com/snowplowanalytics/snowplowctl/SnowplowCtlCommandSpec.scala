/*
 * Copyright (c) 2018 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

package com.snowplowanalytics.snowplowctl

import com.snowplowanalytics.snowplowctl.SnowplowCtlCommand.AwsConfig
import org.specs2.Specification

class SnowplowCtlCommandSpec extends Specification { def is = s2"""
  Parse manifest resolve subcommand $e1
  Parse manifest resolve subcommand with AWS profile $e2
  """

  def e1 = {
    val args = "manifest --table-name manifest-test resolve s3://snowplow/ FAILED".split(" ")
    val expected = SnowplowCtlCommand.ManifestCommand("manifest-test", SnowplowCtlCommand.Resolve("s3://snowplow/", Config.ResolvableState.Failed), None, AwsConfig(None, None))
    SnowplowCtlCommand.parse(args) must beRight(expected)
  }

  def e2 = {
    val args = "manifest --table-name manifest-test --profile default resolve s3://snowplow/ FAILED".split(" ")
    val expected = SnowplowCtlCommand.ManifestCommand("manifest-test", SnowplowCtlCommand.Resolve("s3://snowplow/", Config.ResolvableState.Failed), None, AwsConfig(Some("default"), None))
    SnowplowCtlCommand.parse(args) must beRight(expected)
  }
}
