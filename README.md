MyBatis CDI Extension
=====================

[![Build Status](https://travis-ci.org/mybatis/cdi.svg?branch=master)](https://travis-ci.org/mybatis/cdi)
[![Coverage Status](https://coveralls.io/repos/mybatis/cdi/badge.svg?branch=master&service=github)](https://coveralls.io/github/mybatis/cdi?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/560f3aa85a262f001e0008cf/badge.svg?style=flat)](https://www.versioneye.com/user/projects/560f3aa85a262f001e0008cf)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-cdi/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-cdi)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

![mybatis-logo](http://mybatis.github.io/images/mybatis-logo.png)

MyBatis-CDI extension takes care of the lifecycle of MyBatis mappers and SqlSessions. MyBatis components are directly injected into your
CDI beans ready to be used, there is no need to create or destroy them. It also provides local and JTA transaction support based on the
@Transactional annotation.

Important
---------

CDI 1.0 is not supported. This extension requieres minimum CDI 1.1, CDI 1.2 is prefered.

Essentials
----------

* [See the docs](http://mybatis.github.io/cdi/)

Contributed Examples
--------------------

* Ready to deploy sample web app (Jee7): [https://github.com/mnesarco/mybatis-cdi-samples](https://github.com/mnesarco/mybatis-cdi-samples/)

