// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.cloudstack.api.response;

import java.util.List;

import com.cloud.projects.ProjectAccount;
import org.apache.cloudstack.api.ApiConstants;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;
import org.apache.cloudstack.api.BaseResponse;
import org.apache.cloudstack.api.EntityReference;

@EntityReference(value=ProjectAccount.class)
@SuppressWarnings("unused")
public class ProjectAccountResponse extends BaseResponse implements ControlledViewEntityResponse {
    @SerializedName(ApiConstants.PROJECT_ID)
    @Param(description = "project id")
    private String projectId;

    @SerializedName(ApiConstants.PROJECT)
    @Param(description = "project name")
    private String projectName;

    @SerializedName(ApiConstants.ACCOUNT_ID)
    @Param(description = "the id of the account")
    private String accountId;

    @SerializedName(ApiConstants.ACCOUNT)
    @Param(description = "the name of the account")
    private String accountName;

    @SerializedName(ApiConstants.ACCOUNT_TYPE)
    @Param(description = "account type (admin, domain-admin, user)")
    private Short accountType;

    @SerializedName(ApiConstants.ROLE)
    @Param(description = "account role in the project (regular,owner)")
    private String role;

    @SerializedName(ApiConstants.DOMAIN_ID)
    @Param(description = "id of the Domain the account belongs too")
    private String domainId;

    @SerializedName(ApiConstants.DOMAIN)
    @Param(description = "name of the Domain the account belongs too")
    private String domainName;

    @SerializedName(ApiConstants.USER)
    @Param(description = "the list of users associated with account", responseObject = UserResponse.class)
    private List<UserResponse> users;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setAccountId(String id) {
        this.accountId = id;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountType(Short accountType) {
        this.accountType = accountType;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setUsers(List<UserResponse> users) {
        this.users = users;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
