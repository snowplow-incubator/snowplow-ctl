# Snowplowctl

[![Build Status][travis-image]][travis]  [![Release][release-image]][releases] [![License][license-image]][license]

Snowplowctl is a CLI application performing common Snowplow setup and maintainance operations.

## Quickstart

Assuming git, **[Vagrant][vagrant-install]** and **[VirtualBox][virtualbox-install]** installed:

```bash
host$ git clone https://github.com/snowplow-incubator/snowplowctl.git
host$ cd snowplowctl
host$ vagrant up && vagrant ssh
guest$ cd /vagrant
guest$ sbt test
```

## Copyright and License

Snowplow Snowplow CTL is copyright 2018 Snowplow Analytics Ltd.

Licensed under the **[Apache License, Version 2.0][license]** (the "License");
you may not use this software except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


[vagrant-install]: http://docs.vagrantup.com/v2/installation/index.html
[virtualbox-install]: https://www.virtualbox.org/wiki/Downloads

[travis]: https://travis-ci.org/snowplow-incubator/snowplowctl
[travis-image]: https://travis-ci.org/snowplow-incubator/snowplowctl.png?branch=master

[license-image]: http://img.shields.io/badge/license-Apache--2-blue.svg?style=flat
[license]: http://www.apache.org/licenses/LICENSE-2.0

[release-image]: http://img.shields.io/badge/release-0.1.0-rc1-blue.svg?style=flat
[releases]: https://github.com/snowplow-incubator/snowplowctl/releases
