// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.properties

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.PropertyGroupCreate
import com.hubspot.sdk.models.PropertyGroupUpdate
import com.hubspot.sdk.models.crm.properties.groups.GroupCreateParams
import com.hubspot.sdk.models.crm.properties.groups.GroupDeleteParams
import com.hubspot.sdk.models.crm.properties.groups.GroupGetParams
import com.hubspot.sdk.models.crm.properties.groups.GroupListParams
import com.hubspot.sdk.models.crm.properties.groups.GroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val groupService = client.crm().properties().groups()

        val propertyGroup =
            groupService.create(
                GroupCreateParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val groupService = client.crm().properties().groups()

        val propertyGroup =
            groupService.update(
                GroupUpdateParams.builder()
                    .objectType("objectType")
                    .groupName("groupName")
                    .propertyGroupUpdate(
                        PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
                    )
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val groupService = client.crm().properties().groups()

        val collectionResponsePropertyGroupNoPaging =
            groupService.list(
                GroupListParams.builder().objectType("objectType").locale("locale").build()
            )

        collectionResponsePropertyGroupNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val groupService = client.crm().properties().groups()

        groupService.delete(
            GroupDeleteParams.builder().objectType("objectType").groupName("groupName").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val groupService = client.crm().properties().groups()

        val propertyGroup =
            groupService.get(
                GroupGetParams.builder()
                    .objectType("objectType")
                    .groupName("groupName")
                    .locale("locale")
                    .build()
            )

        propertyGroup.validate()
    }
}
