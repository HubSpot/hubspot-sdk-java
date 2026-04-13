// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.crm.Filter
import com.hubspot.sdk.models.crm.FilterGroup
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.associations.AssociationDeleteParams
import com.hubspot.sdk.models.crm.associations.AssociationListParams
import com.hubspot.sdk.models.crm.associations.AssociationSearchParams
import com.hubspot.sdk.models.crm.associations.AssociationUpdateAssociationLabelsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val associationServiceAsync = client.crm().associations()

        val pageFuture =
            associationServiceAsync.list(
                AssociationListParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val associationServiceAsync = client.crm().associations()

        val future =
            associationServiceAsync.delete(
                AssociationDeleteParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestHighUsageReport() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val associationServiceAsync = client.crm().associations()

        val reportCreationResponseFuture = associationServiceAsync.requestHighUsageReport(0)

        val reportCreationResponse = reportCreationResponseFuture.get()
        reportCreationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val associationServiceAsync = client.crm().associations()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            associationServiceAsync.search(
                AssociationSearchParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAssociationLabels() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val associationServiceAsync = client.crm().associations()

        val labelsBetweenObjectPairFuture =
            associationServiceAsync.updateAssociationLabels(
                AssociationUpdateAssociationLabelsParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .addBody(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .build()
            )

        val labelsBetweenObjectPair = labelsBetweenObjectPairFuture.get()
        labelsBetweenObjectPair.validate()
    }
}
