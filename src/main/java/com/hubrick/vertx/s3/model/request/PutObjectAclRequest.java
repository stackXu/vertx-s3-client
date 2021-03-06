/**
 * Copyright (C) 2016 Etaia AS (oss@hubrick.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hubrick.vertx.s3.model.request;

import com.hubrick.vertx.s3.model.AccessControlPolicy;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Emir Dizdarevic
 * @since 3.2.0
 */
public class PutObjectAclRequest {

    private AclHeadersRequest aclHeadersRequest;
    private AccessControlPolicy accessControlPolicy;

    public PutObjectAclRequest(AclHeadersRequest aclHeadersRequest) {
        this.aclHeadersRequest = aclHeadersRequest;
    }

    public PutObjectAclRequest(AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
    }

    public AclHeadersRequest getAclHeadersRequest() {
        return aclHeadersRequest;
    }

    public AccessControlPolicy getAccessControlPolicy() {
        return accessControlPolicy;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
