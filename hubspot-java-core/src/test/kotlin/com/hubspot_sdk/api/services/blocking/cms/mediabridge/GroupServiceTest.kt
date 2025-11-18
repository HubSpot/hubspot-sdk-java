// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.PropertyGroupCreate
import com.hubspot_sdk.api.models.PropertyGroupUpdate
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupDeleteByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupGetByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupListParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupUpdateByNameParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupService = client.cms().mediaBridge().groups()

        val propertyGroup =
            groupService.create(
                GroupCreateParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyGroupCreate(
                        PropertyGroupCreate.builder()
                            .label("label")
                            .name("name")
                            .displayOrder(0)
                            .build()
                    )
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupService = client.cms().mediaBridge().groups()

        val collectionResponsePropertyGroupNoPaging =
            groupService.list(GroupListParams.builder().appId(0).objectType("objectType").build())

        collectionResponsePropertyGroupNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupService = client.cms().mediaBridge().groups()

        groupService.deleteByName(
            GroupDeleteByNameParams.builder()
                .appId(0)
                .objectType("objectType")
                .groupName("groupName")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupService = client.cms().mediaBridge().groups()

        val propertyGroup =
            groupService.getByName(
                GroupGetByNameParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateByName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupService = client.cms().mediaBridge().groups()

        val propertyGroup =
            groupService.updateByName(
                GroupUpdateByNameParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .groupName("groupName")
                    .propertyGroupUpdate(
                        PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
                    )
                    .build()
            )

        propertyGroup.validate()
    }
}
