// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.custom.CustomCreateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomDeleteParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomGetParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomMergeParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomSearchParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val simplePublicObjectFuture =
            customServiceAsync.create(
                CustomCreateParams.builder()
                    .objectType("objectType")
                    .simplePublicObjectInputForCreate(
                        SimplePublicObjectInputForCreate.builder()
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("id").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .properties(
                                SimplePublicObjectInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val simplePublicObjectFuture =
            customServiceAsync.update(
                CustomUpdateParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .idProperty("idProperty")
                    .simplePublicObjectInput(
                        SimplePublicObjectInput.builder()
                            .properties(
                                SimplePublicObjectInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val pageFuture = customServiceAsync.list("objectType")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val future =
            customServiceAsync.delete(
                CustomDeleteParams.builder().objectType("objectType").objectId("objectId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val simplePublicObjectWithAssociationsFuture =
            customServiceAsync.get(
                CustomGetParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .archived(true)
                    .addAssociation("string")
                    .idProperty("idProperty")
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )

        val simplePublicObjectWithAssociations = simplePublicObjectWithAssociationsFuture.get()
        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun merge() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val simplePublicObjectFuture =
            customServiceAsync.merge(
                CustomMergeParams.builder()
                    .objectType("objectType")
                    .publicMergeInput(
                        PublicMergeInput.builder()
                            .objectIdToMerge("objectIdToMerge")
                            .primaryObjectId("primaryObjectId")
                            .build()
                    )
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customServiceAsync = client.crm().objects().custom()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            customServiceAsync.search(
                CustomSearchParams.builder()
                    .objectType("objectType")
                    .publicObjectSearchRequest(
                        PublicObjectSearchRequest.builder()
                            .after("after")
                            .addFilterGroup(
                                FilterGroup.builder()
                                    .addFilter(
                                        Filter.builder()
                                            .operator(Filter.Operator.BETWEEN)
                                            .propertyName("propertyName")
                                            .highValue("highValue")
                                            .value("value")
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .limit(0)
                            .addProperty("string")
                            .addSort("string")
                            .query("query")
                            .build()
                    )
                    .build()
            )

        val collectionResponseWithTotalSimplePublicObject =
            collectionResponseWithTotalSimplePublicObjectFuture.get()
        collectionResponseWithTotalSimplePublicObject.validate()
    }
}
