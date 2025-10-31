// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class GroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupServiceAsync = client.cms().mediaBridge().groups()

        val propertyGroupFuture =
            groupServiceAsync.create(
                GroupCreateParams.builder()
                    .appId("appId")
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

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupServiceAsync = client.cms().mediaBridge().groups()

        val groupsFuture =
            groupServiceAsync.list(
                GroupListParams.builder().appId("appId").objectType("objectType").build()
            )

        val groups = groupsFuture.get()
        groups.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByName() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupServiceAsync = client.cms().mediaBridge().groups()

        val future =
            groupServiceAsync.deleteByName(
                GroupDeleteByNameParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByName() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupServiceAsync = client.cms().mediaBridge().groups()

        val propertyGroupFuture =
            groupServiceAsync.getByName(
                GroupGetByNameParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateByName() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val groupServiceAsync = client.cms().mediaBridge().groups()

        val propertyGroupFuture =
            groupServiceAsync.updateByName(
                GroupUpdateByNameParams.builder()
                    .appId("appId")
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
}
