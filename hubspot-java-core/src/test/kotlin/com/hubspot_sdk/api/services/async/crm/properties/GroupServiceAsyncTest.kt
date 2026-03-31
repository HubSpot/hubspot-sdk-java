// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.properties

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.PropertyGroupCreate
import com.hubspot_sdk.api.models.PropertyGroupUpdate
import com.hubspot_sdk.api.models.crm.properties.groups.GroupCreateParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupDeleteParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupGetParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupListParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val groupServiceAsync = client.crm().properties().groups()

        val propertyGroupFuture =
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

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val groupServiceAsync = client.crm().properties().groups()

        val collectionResponsePropertyGroupNoPagingFuture =
            groupServiceAsync.list(
                GroupListParams.builder().objectType("objectType").locale("locale").build()
            )

        val collectionResponsePropertyGroupNoPaging =
            collectionResponsePropertyGroupNoPagingFuture.get()
        collectionResponsePropertyGroupNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val groupServiceAsync = client.crm().properties().groups()

        val future =
            groupServiceAsync.delete(
                GroupDeleteParams.builder().objectType("objectType").groupName("groupName").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val groupServiceAsync = client.crm().properties().groups()

        val propertyGroupFuture =
            groupServiceAsync.get(
                GroupGetParams.builder()
                    .objectType("objectType")
                    .groupName("groupName")
                    .locale("locale")
                    .build()
            )

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }
}
