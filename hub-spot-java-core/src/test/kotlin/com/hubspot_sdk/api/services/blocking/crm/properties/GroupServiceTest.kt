// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.properties

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.PropertyGroupCreate
import com.hubspot_sdk.api.models.PropertyGroupUpdate
import com.hubspot_sdk.api.models.crm.properties.groups.GroupCreateParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupDeleteParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupGetParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupService = client.crm().properties().groups()

        val createdResponsePropertyGroup =
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

        createdResponsePropertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupService = client.crm().properties().groups()

        val collectionResponsePropertyGroup = groupService.list("objectType")

        collectionResponsePropertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupService = client.crm().properties().groups()

        groupService.delete(
            GroupDeleteParams.builder().objectType("objectType").groupName("groupName").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupService = client.crm().properties().groups()

        val propertyGroup =
            groupService.get(
                GroupGetParams.builder().objectType("objectType").groupName("groupName").build()
            )

        propertyGroup.validate()
    }
}
