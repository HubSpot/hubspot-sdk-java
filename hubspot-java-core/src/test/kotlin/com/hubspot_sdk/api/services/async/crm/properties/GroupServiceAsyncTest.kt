// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.properties

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class GroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupServiceAsync = client.crm().properties().groups()

        val createdResponsePropertyGroupFuture =
            groupServiceAsync.create(
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

        val createdResponsePropertyGroup = createdResponsePropertyGroupFuture.get()
        createdResponsePropertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupServiceAsync = client.crm().properties().groups()

        val propertyGroupFuture =
            groupServiceAsync.update(
                GroupUpdateParams.builder()
                    .objectType("objectType")
                    .groupName("groupName")
                    .propertyGroupUpdate(
                        PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
                    )
                    .build()
            )

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupServiceAsync = client.crm().properties().groups()

        val collectionResponsePropertyGroupFuture = groupServiceAsync.list("objectType")

        val collectionResponsePropertyGroup = collectionResponsePropertyGroupFuture.get()
        collectionResponsePropertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupServiceAsync = client.crm().properties().groups()

        val future =
            groupServiceAsync.delete(
                GroupDeleteParams.builder().objectType("objectType").groupName("groupName").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val groupServiceAsync = client.crm().properties().groups()

        val propertyGroupFuture =
            groupServiceAsync.get(
                GroupGetParams.builder().objectType("objectType").groupName("groupName").build()
            )

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }
}
