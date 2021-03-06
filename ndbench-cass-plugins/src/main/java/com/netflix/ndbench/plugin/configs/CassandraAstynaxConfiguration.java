/*
 *  Copyright 2018 Netflix, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.netflix.ndbench.plugin.configs;

import com.netflix.archaius.api.annotations.Configuration;
import com.netflix.archaius.api.annotations.DefaultValue;
import com.netflix.archaius.api.annotations.PropertyName;
import com.netflix.ndbench.api.plugin.common.NdBenchConstants;

@Configuration(prefix =  NdBenchConstants.PROP_NAMESPACE +  "cass")
public interface CassandraAstynaxConfiguration extends CassandraConfigurationBase {

    /**
     * Default to C*'s default thrift port since ndbench doesn't implement cql over Astyanax
     */
    @PropertyName(name = "host.port")
    @DefaultValue("9160")
    Integer getHostPort();

    @DefaultValue("test1_thrift")
    String getCfname();

    @DefaultValue("CL_LOCAL_ONE")
    String getReadConsistencyLevel();

    @DefaultValue("CL_LOCAL_ONE")
    String getWriteConsistencyLevel();

    @DefaultValue("10")
    Long getColsPerRow();
}
